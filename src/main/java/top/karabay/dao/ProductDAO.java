package top.karabay.dao;

import java.util.List;

import top.karabay.model.Product;

public interface ProductDAO {

	Product selectByPrimaryKey(Integer id);

	List<Product> selectByDescription(String productDesc);
}