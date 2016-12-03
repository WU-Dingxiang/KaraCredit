package top.karacredit.dao;

import top.karacredit.model.dao.Order;

public interface OrderDAO {

	int insert(Order record);

	int updateStatusByOrder(Order record);

	Order getOrderById(int orderId);

	Integer getStatusById(int orderId);
}
