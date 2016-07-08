package top.karabay.dao;

import top.karabay.model.Account;

public interface AccountDAO {
	Integer selectByAccount(Account record);

	Integer updateByAccount(Account record);
}