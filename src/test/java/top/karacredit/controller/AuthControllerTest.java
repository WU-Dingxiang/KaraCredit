package top.karacredit.controller;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.ui.ExtendedModelMap;
import org.springframework.ui.Model;

import com.alibaba.fastjson.JSON;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring-mybatis.xml" })
public class AuthControllerTest {

	private static Logger logger = Logger.getLogger(AuthControllerTest.class);

	@Resource
	private AuthController authController = null;

	@Test
	public void test() throws Exception {
		test_captcha();
		test_login();
	}

	public void test_captcha() throws Exception {
		System.out.println();
		logger.info("************************ test_captcha ***************************");

		HttpServletRequest request = null;
		Model model = null;

		System.out.println();
		logger.info("************************ test_captcha 参数为空 ***************************");
		// 参数为空
		model = new ExtendedModelMap();
		request = buildRequest("", "");
		String pageNameFailed = authController.captcha(request, model);
		logger.info("pageNameFailed = " + pageNameFailed);
		logger.info("asMap = " + JSON.toJSONString(model.asMap()));

		System.out.println();
		logger.info("************************ test_captcha OK [admin] ***************************");
		// OK
		model = new ExtendedModelMap();
		request = buildRequest("phone", "13647449504");
		String adminOK = authController.captcha(request, model);
		logger.info("adminOK = " + adminOK);
		logger.info("asMap = " + JSON.toJSONString(model.asMap()));

		System.out.println();
		logger.info("************************ test_captcha OK [applicant] ***************************");
		// OK
		model = new ExtendedModelMap();
		request = buildRequest("phone", "15073923998");
		String applicantOK = authController.captcha(request, model);
		logger.info("applicantOK = " + applicantOK);
		logger.info("asMap = " + JSON.toJSONString(model.asMap()));
	}

	public void test_login() throws Exception {
		System.out.println();
		logger.info("************************ test_login ***************************");

		HttpServletRequest request = null;
		Model model = null;

		System.out.println();
		logger.info("************************ test_login 手机号为空 ***************************");
		// 手机号为空
		model = new ExtendedModelMap();
		request = buildRequest("", "");
		String pageNameFailed0 = authController.login(request, model);
		logger.info("pageNameFailed = " + pageNameFailed0);
		logger.info("asMap = " + JSON.toJSONString(model.asMap()));

		System.out.println();
		logger.info("************************ test_login 验证码为空 ***************************");
		// 验证码为空
		model = new ExtendedModelMap();
		request = buildRequest("phone", "13647449504");
		String pageNameFailed1 = authController.login(request, model);
		logger.info("pageNameFailed = " + pageNameFailed1);
		logger.info("asMap = " + JSON.toJSONString(model.asMap()));

		System.out.println();
		logger.info("************************ test_login 验证码错误 ***************************");
		// 验证码错误
		model = new ExtendedModelMap();
		Map<String, String[]> data = new HashMap<>();
		data.put("phone", new String[] { "13647449504" });
		data.put("captcha", new String[] { "1234" });
		request = buildRequest(data);
		String captchaFail = authController.login(request, model);
		logger.info("captchaFail = " + captchaFail);
		logger.info("asMap = " + JSON.toJSONString(model.asMap()));

		System.out.println();
		logger.info("************************ test_login 管理员验证码通过 ***************************");
		// 管理员验证码通过
		model = new ExtendedModelMap();
		Map<String, String[]> datax = new HashMap<>();
		datax.put("phone", new String[] { "13647449504" });
		datax.put("captcha", new String[] { authController.captchaDebug("13647449504") });
		request = buildRequest(datax);
		String adminOK = authController.login(request, model);
		logger.info("pageNameOK = " + adminOK);
		logger.info("asMap = " + JSON.toJSONString(model.asMap()));

		System.out.println();
		logger.info("************************ test_login 申请人验证码通过 ***************************");
		// 申请人验证码通过
		model = new ExtendedModelMap();
		Map<String, String[]> dataxx = new HashMap<>();
		dataxx.put("phone", new String[] { "15073923998" });
		dataxx.put("captcha", new String[] { authController.captchaDebug("15073923998") });
		request = buildRequest(dataxx);
		String applicantOK = authController.login(request, model);
		logger.info("pageNameOK = " + applicantOK);
		logger.info("asMap = " + JSON.toJSONString(model.asMap()));
	}

	HttpServletRequest buildRequest(String key, String val) throws Exception {
		Map<String, String[]> data = new HashMap<>();
		data.put(key, new String[] { val });
		return buildRequest(data);
	}

	HttpServletRequest buildRequest(Map<? extends String, ? extends String[]> data) throws Exception {
		HttpServletRequest request = new MockHttpServletRequest();
		Field parametersField = MockHttpServletRequest.class.getDeclaredField("parameters");
		parametersField.setAccessible(true);
		Map<String, String[]> parameters = new LinkedHashMap<String, String[]>(16);
		parametersField.set(request, parameters);

		parameters.putAll(data);
		return request;
	}
}
