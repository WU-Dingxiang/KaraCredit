package com.womai.dao;

import java.util.List;

import com.womai.model.Product;

public interface ProductDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(Product record);

    int insertSelective(Product record);

    Product selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Product record);

    int updateByPrimaryKey(Product record);

	List<Product> selectByDescription(String productDesc);
}