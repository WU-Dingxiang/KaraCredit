package top.karabay.dao;

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
public class ProductDAOTest {
	private static Logger logger = Logger.getLogger(ProductDAOTest.class);

	@Resource
	private ProductDAO productDAO = null;

	@Test
	public void test1() {
		Product product = productDAO.selectByPrimaryKey(1);
		logger.info(JSON.toJSONString(product));
	}
}
