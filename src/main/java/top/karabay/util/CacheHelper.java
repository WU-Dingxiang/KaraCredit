package top.karabay.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import top.karabay.model.dao.Product;

public class CacheHelper {
	private static final Map<Integer, Product> productCache = new ConcurrentHashMap<>();
	private static final Map<String, List<Integer>> productIdListCache = new ConcurrentHashMap<>();

	public static void saveProduct(Product product) {
		if (product != null) {
			Integer id = product.getId();
			if (!productCache.containsKey(id)) {
				productCache.put(id, product);
			}
		}
	}

	public static Product getProductById(Integer id) {
		return productCache.get(id);
	}

	public static void saveProductIdList(String desc, List<Integer> productIdList) {
		if (desc != null && productIdList != null && !productIdList.isEmpty()) {
			productIdListCache.put(desc, productIdList);
		}
	}

	public static List<Product> getProductByDesc(String desc) {
		List<Integer> cacheIdList = productIdListCache.get(desc);
		if (cacheIdList != null && !cacheIdList.isEmpty()) {
			List<Product> cacheProductList = new ArrayList<>();
			for (Integer id : cacheIdList) {
				Product cacheProduct = productCache.get(id);
				if (cacheProduct != null) {
					cacheProductList.add(cacheProduct);
				}
			}
			return cacheProductList;
		}
		return null;
	}

}
