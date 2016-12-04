package top.karacredit.dao;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;

import top.karacredit.model.dao.Auth;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring-mybatis.xml" })
public class AuthDAOTest {
	private static Logger logger = Logger.getLogger(AuthDAOTest.class);

	@Resource
	private AuthDAO authDAO = null;

	@Test
	public void test() {
		Auth auth = authDAO.getAuthByPhone("13647449504");
		logger.info(JSON.toJSONString(auth));
	}
}
