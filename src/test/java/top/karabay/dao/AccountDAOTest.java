package top.karabay.dao;

import static org.junit.Assert.*;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import top.karabay.model.dao.Account;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring-mybatis.xml" })
public class AccountDAOTest {
	private static Logger logger = Logger.getLogger(AccountDAOTest.class);

	@Resource
	private AccountDAO accountDAO = null;

	@Test
	public void test1() {
		Account record = new Account();
		record.setUsername("a123");
		record.setPassword("123456");
		Integer balance0 = accountDAO.getBalanceByAccount(record);
		assertNotNull(balance0);
		logger.info("balance0 = " + balance0);

		record.setBalance(998);
		accountDAO.updateBalanceByAccount(record);

		Integer balance1 = accountDAO.getBalanceByAccount(record);
		assertNotNull(balance1);
		logger.info("balance1 = " + balance1);

		record.setBalance(balance0);
		accountDAO.updateBalanceByAccount(record);

		Integer balance2 = accountDAO.getBalanceByAccount(record);
		assertNotNull(balance2);
		logger.info("balance2 = " + balance2);
		
		record.setPassword("45465");
		Integer errorBalance = accountDAO.getBalanceByAccount(record);
		assertNull(errorBalance);
		logger.info("errorBalance = " + errorBalance);
		

	}
}
