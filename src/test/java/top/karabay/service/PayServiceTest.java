package top.karabay.service;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring-mybatis.xml" })
public class PayServiceTest {
	private static Logger logger = Logger.getLogger(PayServiceTest.class);

	@Resource
	private PayService payService = null;

	@Test
	public void test1() {
		String payResult;

		payResult = payService.pay("a123", "123456", 555, 1573);
		logger.info(JSON.toJSONString(payResult));

		payResult = payService.pay("a123", "123456", 44444555, 1573);
		logger.info(JSON.toJSONString(payResult));

		payResult = payService.pay("a123", "12456", 555, 1573);
		logger.info(JSON.toJSONString(payResult));

		payResult = payService.pay("aa123", "123456", 555, 1573);
		logger.info(JSON.toJSONString(payResult));
	}
}
