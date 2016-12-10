package top.karacredit.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HrefController {

	@RequestMapping("admin")
	public String admin(HttpServletRequest request, Model model) {
		return "admin";

	}

	@RequestMapping("admin_batchInfo")
	public String admin_batchInfo(HttpServletRequest request, Model model) {
		return "admin_batchInfo";

	}

	@RequestMapping("admin_valuationLog")
	public String admin_valuationLog(HttpServletRequest request, Model model) {
		return "admin_valuationLog";

	}

	@RequestMapping("admin_valuationLog_init")
	public String admin_valuationLog_init(HttpServletRequest request, Model model) {
		return "admin_valuationLog_init";

	}

	@RequestMapping("admin_valuationLog_sum")
	public String admin_valuationLog_sum(HttpServletRequest request, Model model) {
		return "admin_valuationLog_sum";

	}

	@RequestMapping("admin_config")
	public String admin_config(HttpServletRequest request, Model model) {
		return "admin_config";

	}

	@RequestMapping("admin_config_index")
	public String admin_config_index(HttpServletRequest request, Model model) {
		return "admin_config_index";

	}

	@RequestMapping("admin_config_indexWeight")
	public String admin_config_indexWeight(HttpServletRequest request, Model model) {
		return "admin_config_indexWeight";

	}

	@RequestMapping("admin_config_scorePolicy")
	public String admin_config_scorePolicy(HttpServletRequest request, Model model) {
		return "admin_config_scorePolicy";

	}

	@RequestMapping("admin_config_loanPolicy")
	public String admin_config_loanPolicy(HttpServletRequest request, Model model) {
		return "admin_config_loanPolicy";

	}

	@RequestMapping("applicant")
	public String applicant(HttpServletRequest request, Model model) {
		return "applicant";

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
