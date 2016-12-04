package top.karacredit.dao;

import top.karacredit.model.dao.Auth;

public interface AuthDAO {
	Auth getAuthByPhone(String phone);
}