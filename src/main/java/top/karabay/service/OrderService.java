package top.karabay.service;

import top.karabay.model.Order;

public interface OrderService {

	int create(int productId, String address, String cellphone, int payAmount);

	Order getOrderById(int orderId);

	void finish(int orderId);
}
