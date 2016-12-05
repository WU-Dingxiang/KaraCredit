package top.karacredit.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoanController {

	@RequestMapping("loanResult")
	public String loanResult(HttpServletRequest request, Model model) {
		String applicantId = request.getParameter("applicantId");

		// 1. 申请人ID为空
		if (applicantId == null) {
			model.addAttribute("error", "申请人ID为空");
			return "common_failed";
		}

		// 2. 获取申请人贷款结果JSON
		String loanResult = "";
		// loanResult = loanService.getLoanResultById();

		return loanResult;
	}
}
