package top.karacredit.service;

import top.karacredit.model.dao.Config;

public interface ConfigService {
	public Config getConfigByKey(String key);
}
