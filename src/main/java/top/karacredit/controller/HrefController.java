package top.karacredit.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HrefController {

	@RequestMapping("admin_batchInfo")
	public String admin_batchInfo(HttpServletRequest request, Model model) {
		return "admin_batchInfo";

	}

	@RequestMapping("admin_valuationLog")
	public String admin_valuationLog(HttpServletRequest request, Model model) {
		return "admin_valuationLog";

	}

	@RequestMapping("admin_config")
	public String admin_config(HttpServletRequest request, Model model) {
		return "admin_config";

	}

	@RequestMapping("applicant_info")
	public String applicant_info(HttpServletRequest request, Model model) {
		return "applicant_info";

	}

	@RequestMapping("applicant_loanResult")
	public String applicant_loanResult(HttpServletRequest request, Model model) {
		return "applicant_loanResult";

	}

	@RequestMapping("logout")
	public String logout(HttpServletRequest request, Model model) {
		return "auth_login";

	}
}
