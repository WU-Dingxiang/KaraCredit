package top.karacredit.service;

public class t {
	public static void main(String[] args) {
		double a1 = x1(85, 75, 80, 90, 75);
		double a2 = x2(90, 75);
		double a3 = x3(80, 80, 85, 90, 75);
		double a4 = x4(90, 75, 90, 80, 75);
		System.out.println(String.format("%.2f, %.2f, %.2f, %.2f", a1, a2, a3, a4));

	}

	private static double x1(int i, int j, int k, int l, int m) {
		return i * .1216 + j * .1679 + k * .2163 + l * .2163 + m * .2246;
	}

	private static double x2(int i, int j) {
		return i * .6667 + j * .3333;
	}

	private static double x3(int i, int j, int k, int l, int m) {
		return i * .1317 + j * .2233 + k * .2233 + l * .2233 + m * .1983;
	}

	private static double x4(int i, int j, int k, int l, int m) {
		return i * .1031 + j * .2259 + k * .2604 + l * .2053 + m * .2053;
	}
}
