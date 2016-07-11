package top.karabay.model.enums;

public enum OrderStatus {

	/* 0- 未支付 */
	unpay(0),

	/* 1- 已完成 */
	finish(1);

	// 实际值
	int val;

	/**
	 * 指定实际值
	 * 
	 * @param v
	 */
	private OrderStatus(int v) {
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

	private static java.util.HashMap<Integer, OrderStatus> mappings;

	private synchronized static java.util.HashMap<Integer, OrderStatus> getMappings() {
		if (mappings == null) {
			mappings = new java.util.HashMap<Integer, OrderStatus>();
		}
		return mappings;
	}

	public static OrderStatus forValue(int value) {
		return getMappings().get(value);
	}
}
