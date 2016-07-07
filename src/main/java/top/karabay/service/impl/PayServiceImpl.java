package top.karabay.service.impl;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import top.karabay.service.PayService;

@Service("payServiceImpl")
public class PayServiceImpl implements PayService {
	private static Logger logger = Logger.getLogger(PayServiceImpl.class);

	@Override
	public String pay(String payAccount, String payPassword, int payMount, int productId) {

		// 1. 检查账号密码是否合法
		logger.info("payAccount = " + payAccount);
		logger.info("payPassword = " + payPassword);

		// 2. 检查余额是否充足
		logger.info("payMount = " + payMount);

		// 3. 检查商品是否充足
		logger.info("productId = " + productId);
		
		// 4. 扣除金额
		
		// 4. 记录支付操作

		return "ok";
	}

}
