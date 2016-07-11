package top.karabay.service.impl;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import top.karabay.dao.AccountDAO;
import top.karabay.model.dao.Account;
import top.karabay.model.dao.Order;
import top.karabay.service.AccountService;
import top.karabay.service.OrderService;

@Service("accountService")
public class AccountServiceImpl implements AccountService {

	private static Logger logger = Logger.getLogger(AccountServiceImpl.class);

	@Resource
	private AccountDAO accountDAO;

	@Resource
	private OrderService orderService;

	@Override
	public String pay(String payAccount, String payPassword, int orderId) {

		// *. 打印传入的参数
		logger.info("payAccount = " + payAccount);
		logger.info("payPassword = " + payPassword);
		logger.info("orderId = " + orderId);

		// 1. 检查账号密码是否合法
		Account record = new Account();
		record.setUsername(payAccount);
		record.setPassword(payPassword);
		Integer balance = getBalance(record);

		// 2. 账号或密码出错
		if (balance == null) {
			return "支付账户或密码错误";
		}

		// 3. 订单已经支付
		boolean orderIsfinished = orderService.isFinished(orderId);
		if (orderIsfinished) {
			return "订单已经支付";
		}

		// 4. 订单不存在
		Order order = orderService.getOrderById(orderId);
		if (order == null) {
			return "订单不存在";
		}

		// 5. 余额不足
		if (balance < order.getAmount()) {
			return "余额不足";
		}

		// 5. 余额不足
		record.setBalance(balance - order.getAmount());
		int updateRowCount = updateBalance(record);
		if (updateRowCount <= 0) {
			return "扣除金额失败";
		}

		// 6. 修改订单状态失败
		int finishRowCount = orderService.finish(orderId);
		if (finishRowCount <= 0) {

			record.setBalance(balance);
			int callbackRowCount = updateBalance(record);
			if (callbackRowCount <= 0) {
				return "修改订单状态失败且金额无法退回，请及时联系客服退款";
			}

			return "修改订单状态失败，金额已退回";
		}

		// 7. 支付成功
		return "ok";
	}

	@Override
	public Integer getBalance(Account record) {
		return accountDAO.getBalanceByAccount(record);
	}

	@Override
	public int updateBalance(Account record) {
		return accountDAO.updateBalanceByAccount(record);
	}
}
