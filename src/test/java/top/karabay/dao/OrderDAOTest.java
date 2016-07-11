package top.karabay.dao;

import static org.junit.Assert.assertEquals;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;

import top.karabay.model.dao.Order;
import top.karabay.model.enums.OrderStatus;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring-mybatis.xml" })
public class OrderDAOTest {

	private static Logger logger = Logger.getLogger(OrderDAOTest.class);

	@Resource
	private OrderDAO orderDAO = null;

	@Test
	public void test1() {

		Order record = new Order();
		record.setProductId(45654);
		record.setAmount(213213);
		record.setAddress("5468456");
		record.setCellphone("546546");
		record.setStatus(OrderStatus.unpay.getValue());
		int affectedRowCount = orderDAO.insert(record);

		if (affectedRowCount > 0 && record.getId() > 0) {

			record.setStatus(OrderStatus.finish.getValue());
			int affectRowCount = orderDAO.updateStatusByOrder(record);
			if (affectRowCount > 0) {
				Order order = orderDAO.getOrderById(record.getId());
				assertEquals(order.getStatus(), OrderStatus.finish.getValue());
				logger.info(JSON.toJSON(order));
			}
		}
	}
}
