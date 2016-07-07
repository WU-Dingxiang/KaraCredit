package top.karabay.service;

import java.util.List;

import top.karabay.model.Product;

public interface ProductService {
	public Product getProductById(int id);

	public List<Product> getProductListByDesc(String productDesc);
}
