package top.karacredit.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;

import top.karacredit.dao.ProductDAO;
import top.karacredit.model.dao.Product;
import top.karacredit.service.ProductService;
import top.karacredit.util.CacheHelper;

@Service("productService")
public class ProductServiceImpl implements ProductService {
	private static Logger logger = Logger.getLogger(ProductServiceImpl.class);

	@Resource
	private ProductDAO productDAO;

	@Override
	public Product getProductById(int id) {
		Product cacheProduct = CacheHelper.getProductById(id);
		if (cacheProduct != null) {
			logger.info("cacheProduct = " + JSON.toJSON(cacheProduct));
			return cacheProduct;
		}

		Product daoProduct = productDAO.getProductById(id);
		if (daoProduct != null) {
			CacheHelper.saveProduct(daoProduct);
		}
		logger.info("daoProduct = " + JSON.toJSON(daoProduct));
		return daoProduct;
	}

	@Override
	public List<Product> getProductListByDesc(String productDesc) {
		List<Product> cacheProductList = CacheHelper.getProductByDesc(productDesc);
		if (cacheProductList != null && !cacheProductList.isEmpty()) {
			logger.info("cacheProductList = " + JSON.toJSON(cacheProductList));
			return cacheProductList;
		}

		List<Product> daoProductList = productDAO.getProductListByDescription(productDesc);
		List<Integer> productIdList = new ArrayList<>();
		if (daoProductList != null && !daoProductList.isEmpty()) {
			for (Product daoProduct : daoProductList) {
				if (daoProduct != null) {
					productIdList.add(daoProduct.getId());
					CacheHelper.saveProduct(daoProduct);
				}
			}
			CacheHelper.saveProductIdList(productDesc, productIdList);
		}
		logger.info("daoProductList = " + JSON.toJSON(daoProductList));
		return daoProductList;
	}

	@Override
	public boolean isAvailable(int productId) {
		// Integer productCount =
		return true;
	}
}
