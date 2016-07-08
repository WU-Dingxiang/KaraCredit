package top.karabay.service;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;

import top.karabay.model.Product;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring-mybatis.xml" })
public class ProductServiceTest {
	private static Logger logger = Logger.getLogger(ProductServiceTest.class);

	@Resource
	private ProductService productService = null;

	@Test
	public void test1() {
		Product product = productService.getProductById(1);
		logger.info(JSON.toJSONString(product));
	}
}
