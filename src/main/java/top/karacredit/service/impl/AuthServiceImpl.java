package top.karacredit.service.impl;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;

import top.karacredit.dao.AuthDAO;
import top.karacredit.model.dao.Auth;
import top.karacredit.service.AuthService;
import top.karacredit.util.CacheHelper;

@Service("authService")
public class AuthServiceImpl implements AuthService {
	private static Logger logger = Logger.getLogger(AuthServiceImpl.class);

	@Resource
	private AuthDAO authDAO;

	@Override
	public Auth getAuthByPhone(String phone) {
		Auth cacheEntity = CacheHelper.getAuthByPhone(phone);
		if (cacheEntity != null) {
			logger.info("cacheEntity = " + JSON.toJSON(cacheEntity));
			return cacheEntity;
		}

		Auth daoEntity = authDAO.getAuthByPhone(phone);
		if (daoEntity != null) {
			CacheHelper.saveAuth(daoEntity);
		}
		logger.info("daoEntity = " + JSON.toJSON(daoEntity));
		return daoEntity;
	}
}
