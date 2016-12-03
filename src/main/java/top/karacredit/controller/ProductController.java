package top.karacredit.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import top.karacredit.model.dao.Product;
import top.karacredit.service.AccountService;
import top.karacredit.service.OrderService;
import top.karacredit.service.ProductService;
import top.karacredit.util.StringHelper;

@Controller
public class ProductController {

	@Resource
	private ProductService productService;

	@Resource
	private AccountService accountService;

	@Resource
	private OrderService orderService;

	@RequestMapping("search")
	public String search(HttpServletRequest request, Model model) {
		String productDesc = request.getParameter("desc");

		// 1. 搜索关键字为空
		if (productDesc == null) {
			model.addAttribute("error", "商品描述为空");
			return "failed";
		}

		// 2. 根据关键字搜索商品
		List<Product> productList = productService.getProductListByDesc(productDesc);
		model.addAttribute("productList", productList);
		return "product_search_ok";
	}

	@RequestMapping("preOrder")
	public String preOrder(HttpServletRequest request, Model model) {
		try {
			int productId = Integer.valueOf(request.getParameter("id"));

			// 1. 商品ID不合法
			if (productId <= 0) {
				model.addAttribute("error", "商品ID不合法");
				return "failed";
			}

			// 2. 根据 商品ID获取商品详细信息
			Product product = productService.getProductById(productId);
			model.addAttribute("product", product);
			return "pre_order";

		} catch (Exception ex) {
			model.addAttribute("error", ex.toString());
			return "failed";
		}
	}

	@RequestMapping("order")
	public String order(HttpServletRequest request, Model model) {
		try {
			// 1- 从request中获取产品ID、送货地址、收货人号码
			int productId = Integer.valueOf(request.getParameter("id"));
			int payAmount = Integer.valueOf(request.getParameter("payAmount"));
			String address = request.getParameter("address");
			String cellphone = request.getParameter("cellphone");

			// 2- 商品ID不合法
			if (productId <= 0) {
				model.addAttribute("error", "商品ID不合法");
				return "failed";
			}

			// 3- 支付金额为空
			if (payAmount <= 0) {
				model.addAttribute("error", "支付金额为空");
				return "failed";
			}

			// 4- 收货地址为空
			if (StringHelper.isEmpty(address)) {
				model.addAttribute("error", "收货地址为空");
				return "failed";
			}

			// 5- 收货人联系方式为空
			if (StringHelper.isEmpty(cellphone)) {
				model.addAttribute("error", "收货人联系方式为空");
				return "failed";
			}

			// 6- 商品已售罄
			boolean available = productService.isAvailable(productId);
			if (!available) {
				model.addAttribute("error", "商品已售罄");
				return "failed";
			}

			// 7- 创建订单失败
			int orderId = orderService.create(productId, address, cellphone, payAmount);
			if (orderId <= 0) {
				model.addAttribute("error", "创建订单失败");
				return "failed";
			}

			// 8- 创建订单成功
			model.addAttribute("orderId", orderId);
			model.addAttribute("payAmount", payAmount);
			return "order_ok";

		} catch (Exception e) {
			model.addAttribute("error", e.toString());
			return "failed";
		}
	}

	@RequestMapping("pay")
	public String pay(HttpServletRequest request, Model model) {
		try {
			int orderId = Integer.valueOf(request.getParameter("orderId"));
			String payAccount = request.getParameter("payAccount");
			String payPassword = request.getParameter("payPassword");

			// 1- 订单ID不合法
			if (orderId <= 0) {
				model.addAttribute("error", "订单ID不合法");
				return "failed";
			}

			// 2- 支付账户为空
			if (StringHelper.isEmpty(payAccount)) {
				model.addAttribute("error", "支付账户为空");
				return "failed";
			}

			// 3- 支付密码为空
			if (StringHelper.isEmpty(payPassword)) {
				model.addAttribute("error", "支付密码为空");
				return "failed";
			}

			String payResult = accountService.pay(payAccount, payPassword, orderId);

			// 4- 支付结果为空
			if (StringHelper.isEmpty(payResult)) {
				model.addAttribute("error", "支付密码为空");
				return "failed";
			}

			// 5- 支付失败
			if (!payResult.equals("ok")) {
				model.addAttribute("error", payResult);
				return "failed";
			}

			// 6- 支付成功
			model.addAttribute("message", "支付成功");
			return "pay_ok";

		} catch (Exception e) {
			model.addAttribute("error", e.toString());
			return "failed";
		}
	}
}
