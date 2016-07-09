package top.karabay.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import top.karabay.model.Product;
import top.karabay.service.OrderService;
import top.karabay.service.PayService;
import top.karabay.service.ProductService;
import top.karabay.util.StringHelper;

@Controller
public class ProductController {

	@Resource
	private ProductService productService;

	@Resource
	private PayService payService;

	@Resource
	private OrderService orderService;

	@RequestMapping("search")
	public String search(HttpServletRequest request, Model model) {
		String productDesc = request.getParameter("desc");

		if (productDesc != null) {
			List<Product> productList = productService.getProductListByDesc(productDesc);
			model.addAttribute("productList", productList);
			return "product_search_ok";
		}

		model.addAttribute("error", "desc == null");
		return "failed";
	}

	@RequestMapping("preOrder")
	public String preOrder(HttpServletRequest request, Model model) {
		try {
			int productId = Integer.valueOf(request.getParameter("id"));

			if (productId != 0) {
				Product product = productService.getProductById(productId);
				model.addAttribute("product", product);
				return "pre_order";
			}

			model.addAttribute("error", "desc == null");
			return "failed";

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
			String address = request.getParameter("address");
			String cellphone = request.getParameter("cellphone");
			int payAmount = Integer.valueOf(request.getParameter("payAmount"));

			// 2- 判断三个
			if (productId != 0 && !StringHelper.isEmpty(address) && !StringHelper.isEmpty(cellphone)
					&& payAmount != 0) {
				boolean available = productService.isAvailable(productId);
				if (available) {
					int orderId = orderService.create(productId, address, cellphone, payAmount);
					if (orderId != 0) {
						model.addAttribute("orderId", orderId);
						model.addAttribute("payAmount", payAmount);
						return "order_ok";
					}
					model.addAttribute("error", "orderId == 0");
					return "failed";
				}
				model.addAttribute("error", "商品已售罄");
				return "failed";
			}
			model.addAttribute("error", "productId == 0");
			return "failed";
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
			if (orderId != 0 && StringHelper.isEmpty(payAccount) && StringHelper.isEmpty(payPassword)) {
				String payResult = payService.pay(payAccount, payPassword, orderId);
				if (payResult != null) {
					if (payResult.equals("ok")) {
						model.addAttribute("message", "pay ok");
						return "pay_ok";
					}
					model.addAttribute("error", payResult);
					return "failed";
				}
				model.addAttribute("error", "payResult == null");
				return "failed";
			}
			model.addAttribute("error", "productId == 0");
			return "failed";
		} catch (Exception e) {
			model.addAttribute("error", e.toString());
			return "failed";
		}
	}
}
