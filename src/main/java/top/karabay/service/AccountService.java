package top.karabay.service;

import top.karabay.model.dao.Account;

public interface AccountService {

	public Integer getBalance(Account record);

	public int updateBalance(Account record);

	public String pay(String payAccount, String payPassword, int orderId);

}
