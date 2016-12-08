package top.karacredit.dao;

import top.karacredit.model.dao.Config;

public interface ConfigDAO {
	Config getConfigByKey(String phone);
}