package top.karacredit.controller;

import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;

import top.karacredit.model.dao.Auth;
import top.karacredit.model.enums.AuthType;
import top.karacredit.service.AuthService;

@Controller
public class AuthController {

	@Resource
	private AuthService authService;

	private ConcurrentHashMap<String, String> captchaMap = new ConcurrentHashMap<>();
	private Random random = new Random();

	public String captchaDebug(String phone) {
		return captchaMap.get(phone);
	}

	@RequestMapping("captcha")
	public String captcha(HttpServletRequest request, Model model) {
		String phone = request.getParameter("phone");

		// 1. 手机号为空
		if (phone == null) {
			model.addAttribute("error", "手机号为空");
			return "common_failed";
		}

		// 2. 生成动态密码
		String captcha = String.valueOf(random.nextInt(10000));
		System.out.println(captcha);
		captchaMap.put(phone, captcha);

		// 3. 返回数据
		model.addAttribute("error", "");

		// 4. 无意义
		return "[ajax]";
	}

	@RequestMapping("login")
	public String login(HttpServletRequest request, Model model) {
		String phone = request.getParameter("phone");

		// 1. 手机号为空
		if (StringUtils.isEmpty(phone)) {
			model.addAttribute("error", "手机号为空");
			return "common_failed";
		}
		String captcha = request.getParameter("captcha");

		// 2. 验证码为空
		if (StringUtils.isEmpty(phone)) {
			model.addAttribute("error", "验证码为空");
			return "common_failed";
		}

		// 3. 根据手机号获取动态密码
		String trueCaptcha = captchaMap.get(phone);

		// 4. 验证码错误
		System.out.println("captcha = " + captcha);
		System.out.println("trueCaptcha = " + trueCaptcha);
		// if (!captcha.equals(trueCaptcha)) {
		// model.addAttribute("error", "验证码错误");
		// return "common_failed";
		// }

		// 5. 获取手机绑定信息
		Auth auth = authService.getAuthByPhone(phone);

		if (auth != null) {

			// 6. 权限类型为管理员, 跳转管理员主界面
			if (auth.getAuthType() == AuthType.admin.getValue()) {
				return "admin";
			}

			// 7. 权限类型为申请人, 跳转申请人主界面
			if (auth.getAuthType() == AuthType.applicant.getValue()) {
				return "applicant";
			}
		}

		// 8. 绑定信息为空, 跳转申请人注册界面
		return "auth_register";
	}
}
