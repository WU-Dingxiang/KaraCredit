package top.karabay.dao;

import java.util.List;

import top.karabay.model.dao.Product;

public interface ProductDAO {

	Product getProductById(int id);

	List<Product> getProductListByDescription(String productDesc);
}