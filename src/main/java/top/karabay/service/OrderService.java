package top.karabay.service;

import top.karabay.model.dao.Order;

public interface OrderService {

	int create(int productId, String address, String cellphone, int payAmount);

	Order getOrderById(int orderId);

	int finish(int orderId);

	boolean isFinished(int orderId);
}
