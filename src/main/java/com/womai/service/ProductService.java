package com.womai.service;

import java.util.List;

import com.womai.model.Product;

public interface ProductService {
	public Product getProductById(int id);

	public List<Product> getProductListByDesc(String productDesc);
}
