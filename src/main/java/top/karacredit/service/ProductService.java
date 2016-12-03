package top.karacredit.service;

import java.util.List;

import top.karacredit.model.dao.Product;

public interface ProductService {
	public Product getProductById(int id);

	public List<Product> getProductListByDesc(String productDesc);

	public boolean isAvailable(int productId);
}
