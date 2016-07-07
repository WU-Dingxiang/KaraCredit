package com.womai.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.womai.model.Product;
import com.womai.service.PayService;
import com.womai.service.ProductService;

@Controller
public class ProductController {

	@Resource
	private ProductService productService;

	@Resource
	private PayService payService;

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

	@RequestMapping("prepareForPay")
	public String prepareForPay(HttpServletRequest request, Model model) {
		try {
			int productId = Integer.valueOf(request.getParameter("id"));
			if (productId != 0) {
				Product product = productService.getProductById(productId);
				if (product != null) {
					model.addAttribute("product", product);
					return "prepareForPay_ok";
				}
				model.addAttribute("error", "product == null");
			}
			model.addAttribute("error", "productId == 0");
		} catch (Exception e) {
			model.addAttribute("error", e.toString());
		}
		return "failed";
	}

	@RequestMapping("pay")
	public String pay(HttpServletRequest request, Model model) {
		try {
			int productId = Integer.valueOf(request.getParameter("productId"));
			int payMount = Integer.valueOf(request.getParameter("payMount"));
			if (productId != 0 && payMount != 0) {
				String payAccount = request.getParameter("payAccount");
				String payPassword = request.getParameter("payPassword");
				String payResult = payService.pay(payAccount, payPassword, payMount, productId);
				if (payResult != null) {
					if (payResult.equals("ok")) {
						model.addAttribute("message", "pay ok");
						return "pay_ok";
					}
					model.addAttribute("error", payResult);
				}
				model.addAttribute("error", "payResult == null");
			}
			model.addAttribute("error", "productId == 0");
		} catch (Exception e) {
			model.addAttribute("error", e.toString());
		}
		return "failed";
	}
}
