package top.karabay.service.impl;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import top.karabay.dao.AccountDAO;
import top.karabay.model.Account;
import top.karabay.service.PayService;

@Service("payServiceImpl")
public class PayServiceImpl implements PayService {
	private static Logger logger = Logger.getLogger(PayServiceImpl.class);

	@Resource
	private AccountDAO accountDAO;

	@Override
	public String pay(String payAccount, String payPassword, int payMount, int orderId) {

		// 1. 检查账号密码是否合法
		Account record = new Account();
		logger.info("payAccount = " + payAccount);
		logger.info("payPassword = " + payPassword);
		record.setUsername(payAccount);
		record.setPassword(payPassword);
		Integer balance = accountDAO.selectByAccount(record);
		
		if (balance!=null) {
			
			// 2. 检查余额是否充足
			logger.info("payMount = " + payMount);
			if (balance>=payMount) {
				
				// 3. 扣除金额
				record.setBalance(balance-payMount);
				accountDAO.updateByAccount(record);

				// 4. 修改订单状态
				logger.info("orderId = " + orderId);
				//orderServive.finish(orderId);
				return "ok";
			}
			return "余额不足";			
		}
		return "支付账户或密码错误";		
	}

}
