package top.karacredit.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import top.karacredit.dao.OrderDAO;
import top.karacredit.model.dao.Order;
import top.karacredit.model.enums.OrderStatus;
import top.karacredit.service.OrderService;

@Service("orderService")
public class OrderServiceImpl implements OrderService {

	@Resource
	private OrderDAO orderDAO;

	@Override
	public int create(int productId, String address, String cellphone, int payAmount) {
		Order record = new Order();
		record.setProductId(productId);
		record.setAmount(payAmount);
		record.setAddress(address);
		record.setCellphone(cellphone);
		record.setStatus(OrderStatus.unpay.getValue());
		int affectedRowCount = orderDAO.insert(record);

		if (affectedRowCount > 0 && record.getId() > 0) {
			return record.getId();
		}
		return 0;
	}

	@Override
	public Order getOrderById(int orderId) {
		return orderDAO.getOrderById(orderId);
	}

	@Override
	public int finish(int id) {
		Order order = new Order();
		order.setId(id);
		order.setStatus(OrderStatus.finish.getValue());
		return orderDAO.updateStatusByOrder(order);
	}

	@Override
	public boolean isFinished(int orderId) {
		Integer statusVal = orderDAO.getStatusById(orderId);
		if (statusVal != null) {
			OrderStatus status = OrderStatus.forValue(statusVal);
			return status == OrderStatus.finish;
		}
		return false;
	}
}
