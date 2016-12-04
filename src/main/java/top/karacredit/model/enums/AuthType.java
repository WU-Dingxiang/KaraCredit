package top.karacredit.model.enums;

public enum AuthType {

	/* 0- 管理员 */
	admin(0),

	/* 1- 申请人 */
	applicant(1);

	// 实际值
	int val;

	/**
	 * 指定实际值
	 * 
	 * @param v
	 */
	private AuthType(int v) {
		val = v;
		getMappings().put(v, this);
	}

	/**
	 * 获取实际值
	 * 
	 * @return
	 */
	public int getValue() {
		return val;
	}

	private static java.util.HashMap<Integer, AuthType> mappings;

	private synchronized static java.util.HashMap<Integer, AuthType> getMappings() {
		if (mappings == null) {
			mappings = new java.util.HashMap<Integer, AuthType>();
		}
		return mappings;
	}

	public static AuthType forValue(int value) {
		return getMappings().get(value);
	}
}
