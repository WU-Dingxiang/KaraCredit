package top.karabay.dao;

import top.karabay.model.dao.Account;

public interface AccountDAO {
	Integer getBalanceByAccount(Account record);

	int updateBalanceByAccount(Account record);
}