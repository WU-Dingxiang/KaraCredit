package top.karacredit.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import top.karacredit.service.ValuationLogService;

@Controller
public class ValuationLogController {

	@Resource
	private ValuationLogService valuationLogService;

	@RequestMapping("valuationLog")
	public String valuationLog(HttpServletRequest request, Model model) {
		String applicantId = request.getParameter("applicantId");

		// 1. 申请人ID为空
		if (applicantId == null) {
			model.addAttribute("error", "申请人ID为空");
			return "common_failed";
		}

		// 2. 获取判别日志JSON包
		String valuationLog = "";
		
		valuationLog = valuationLogService.getLogById();

		return valuationLog;
	}
}
