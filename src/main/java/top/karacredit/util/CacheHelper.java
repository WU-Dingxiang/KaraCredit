package top.karacredit.util;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import top.karacredit.model.dao.Auth;

public class CacheHelper {
	private static final Map<String, Auth> authCache = new ConcurrentHashMap<>();

	public static void saveAuth(Auth auth) {
		if (auth != null) {
			String phone = auth.getPhone();
			if (!authCache.containsKey(phone)) {
				authCache.put(phone, auth);
			}
		}
	}

	public static Auth getAuthByPhone(String phone) {
		return authCache.get(phone);
	}

}
