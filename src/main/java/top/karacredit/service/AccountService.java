package top.karacredit.service;

import top.karacredit.model.dao.Account;

public interface AccountService {

	public Integer getBalance(Account record);

	public int updateBalance(Account record);

	public String pay(String payAccount, String payPassword, int orderId);

}
