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
public class AccountServiceTest {
	private static Logger logger = Logger.getLogger(AccountServiceTest.class);

	@Resource
	private AccountService accountService = null;

	@Test
	public void test1() {
		String payResult;

		payResult = accountService.pay("a123", "123456", 1);
		logger.info(JSON.toJSONString(payResult));
	}
}
