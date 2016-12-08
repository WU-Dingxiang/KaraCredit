package top.karacredit.service.impl;

import java.util.concurrent.ConcurrentHashMap;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;

import top.karacredit.dao.ConfigDAO;
import top.karacredit.model.dao.Config;
import top.karacredit.service.ConfigService;

@Service("configService")
public class ConfigServiceImpl implements ConfigService {
	private static Logger logger = Logger.getLogger(ConfigServiceImpl.class);
	private static ConcurrentHashMap<String, Config> configCache = new ConcurrentHashMap<>();
	@Resource
	private ConfigDAO configDAO;

	@Override
	public Config getConfigByKey(String key) {
		Config cacheEntity = configCache.get(key);
		if (cacheEntity != null) {
			logger.info("cacheEntity = " + JSON.toJSON(cacheEntity));
			return cacheEntity;
		}

		Config daoEntity = configDAO.getConfigByKey(key);
		if (daoEntity != null) {
			configCache.put(daoEntity.getKey(), daoEntity);
		}
		logger.info("daoEntity = " + JSON.toJSON(daoEntity));
		return daoEntity;
	}
}
