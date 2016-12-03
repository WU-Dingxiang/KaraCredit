package top.karacredit.dao;

import java.util.List;

import top.karacredit.model.dao.Product;

public interface ProductDAO {

	Product getProductById(int id);

	List<Product> getProductListByDescription(String productDesc);
}