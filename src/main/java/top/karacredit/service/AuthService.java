package top.karacredit.service;

import top.karacredit.model.dao.Auth;

public interface AuthService {
	public Auth getAuthByPhone(String phone);
}
