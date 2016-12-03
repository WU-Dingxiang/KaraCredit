package top.karacredit.dao;

import top.karacredit.model.dao.Account;

public interface AccountDAO {
	Integer getBalanceByAccount(Account record);

	int updateBalanceByAccount(Account record);
}