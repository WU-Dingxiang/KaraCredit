package top.karabay.controller;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
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

import top.karabay.model.dao.Product;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring-mybatis.xml" })
public class ProductControllerTest {

	private static Logger logger = Logger.getLogger(ProductControllerTest.class);

	@Resource
	private ProductController productController = null;

	@SuppressWarnings("unchecked")
	@Test
	public void test() throws Exception {
		test_search();
		test_preOrder();
		test_order();
		test_pay();

		HttpServletRequest request = null;
		Model model = null;
		String pageNameOK = null;
		Map<String, String[]> data = null;

		// ********************************** search
		// *****************************
		model = new ExtendedModelMap();
		request = buildRequest("desc", "");
		pageNameOK = productController.search(request, model);
		assertEquals(pageNameOK, "product_search_ok");

		Field parametersField = MockHttpServletRequest.class.getDeclaredField("parameters");
		parametersField.setAccessible(true);
		Map<String, String[]> parameters = new LinkedHashMap<String, String[]>(16);
		parametersField.set(request, parameters);
		List<Product> productList = (List<Product>) model.asMap().get("productList");
		assertNotNull(productList);
		assertEquals(productList.isEmpty(), false);

		// ********************************** pre_order
		// *****************************
		Product product0 = productList.get(0);
		int productId0 = product0.getId();

		model = new ExtendedModelMap();
		request = buildRequest("id", "" + productId0);
		pageNameOK = productController.preOrder(request, model);
		assertEquals(pageNameOK, "pre_order");

		Product product1 = (Product) model.asMap().get("product");
		assertNotNull(product1);
		assertEquals(product1.getId(), product0.getId());

		// ********************************** order
		// *****************************
		data = new HashMap<>();
		data.put("id", new String[] { "" + product1.getId() });
		data.put("payAmount", new String[] { "" + product1.getPrice() });
		data.put("address", new String[] { "123" });
		data.put("cellphone", new String[] { "123" });
		request = buildRequest(data);

		pageNameOK = productController.order(request, model);
		assertEquals(pageNameOK, "order_ok");

		int orderId = (int) model.asMap().get("orderId");
		int payAmount = (int) model.asMap().get("payAmount");
		assertEquals(payAmount, product1.getPrice());

		// ********************************** pay *****************************
		model = new ExtendedModelMap();
		data = new HashMap<>();
		data.put("orderId", new String[] { "" + orderId });
		data.put("payAccount", new String[] { "a123" });
		data.put("payPassword", new String[] { "123456" });
		request = buildRequest(data);

		pageNameOK = productController.pay(request, model);
		assertEquals(pageNameOK, "pay_ok");
	}

	public void test_search() throws Exception {
		System.out.println();
		logger.info("************************ test_search ***************************");

		HttpServletRequest request = null;
		Model model = null;

		System.out.println();
		logger.info("************************ test_search  参数为空 ***************************");
		// 参数为空
		model = new ExtendedModelMap();
		request = buildRequest("", "");
		String pageNameFailed = productController.search(request, model);
		logger.info("pageNameFailed = " + pageNameFailed);
		logger.info("asMap = " + JSON.toJSONString(model.asMap()));

		System.out.println();
		logger.info("************************ test_search OK ***************************");
		// OK
		model = new ExtendedModelMap();
		request = buildRequest("desc", "");
		String pageNameOK = productController.search(request, model);
		logger.info("pageNameOK = " + pageNameOK);
		logger.info("asMap = " + JSON.toJSONString(model.asMap()));
	}

	public void test_preOrder() throws Exception {
		System.out.println();
		logger.info("************************ test_preOrder ***************************");

		HttpServletRequest request = null;
		Model model = null;

		System.out.println();
		logger.info("************************ test_preOrder 参数为空 ***************************");
		// 参数为空
		model = new ExtendedModelMap();
		request = buildRequest("", "");
		String pageNameFailed0 = productController.preOrder(request, model);
		logger.info("pageNameFailed = " + pageNameFailed0);
		logger.info("asMap = " + JSON.toJSONString(model.asMap()));

		System.out.println();
		logger.info("************************ test_preOrder 商品ID不合法 ***************************");
		// 商品ID不合法
		model = new ExtendedModelMap();
		request = buildRequest("id", "0");
		String pageNameFailed1 = productController.preOrder(request, model);
		logger.info("pageNameFailed = " + pageNameFailed1);
		logger.info("asMap = " + JSON.toJSONString(model.asMap()));

		System.out.println();
		logger.info("************************ test_preOrder OK ***************************");
		// OK
		model = new ExtendedModelMap();
		request = buildRequest("id", "1");
		String pageNameOK = productController.preOrder(request, model);
		logger.info("pageNameOK = " + pageNameOK);
		logger.info("asMap = " + JSON.toJSONString(model.asMap()));
	}

	public void test_order() throws Exception {
		System.out.println();
		logger.info("************************ test_order ***************************");

		HttpServletRequest request = null;
		Model model = null;

		System.out.println();
		logger.info("************************ test_order 参数为空 ***************************");
		// 参数为空
		model = new ExtendedModelMap();
		request = buildRequest("", "");
		String pageNameFailed0 = productController.order(request, model);
		logger.info("pageNameFailed = " + pageNameFailed0);
		logger.info("asMap = " + JSON.toJSONString(model.asMap()));

		System.out.println();
		logger.info("************************ test_order OK ***************************");
		// OK
		model = new ExtendedModelMap();
		Map<String, String[]> data = new HashMap<>();
		data.put("id", new String[] { "12" });
		data.put("payAmount", new String[] { "1230" });
		data.put("address", new String[] { "123" });
		data.put("cellphone", new String[] { "123" });
		request = buildRequest(data);

		String pageNameOK = productController.order(request, model);
		logger.info("pageNameOK = " + pageNameOK);
		logger.info("asMap = " + JSON.toJSONString(model.asMap()));
	}

	public void test_pay() throws Exception {
		System.out.println();
		logger.info("************************ test_pay ***************************");

		HttpServletRequest request = null;
		Model model = null;

		System.out.println();
		logger.info("************************ test_pay 参数为空 ***************************");
		// 参数为空
		model = new ExtendedModelMap();
		request = buildRequest("", "");
		String pageNameFailed0 = productController.pay(request, model);
		logger.info("pageNameFailed = " + pageNameFailed0);
		logger.info("asMap = " + JSON.toJSONString(model.asMap()));

		System.out.println();
		logger.info("************************ test_pay OK ***************************");
		// OK
		model = new ExtendedModelMap();
		Map<String, String[]> data = new HashMap<>();
		data.put("orderId", new String[] { "12" });
		data.put("payAccount", new String[] { "1230" });
		data.put("payPassword", new String[] { "123" });
		request = buildRequest(data);

		String pageNameFailed = productController.pay(request, model);
		logger.info("pageNameFailed = " + pageNameFailed);
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
