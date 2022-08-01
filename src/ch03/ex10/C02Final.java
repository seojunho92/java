package ch03.ex10;

public class C02Final {
	public static void main(String[] args) {
		final int MAX = 3;	// final - 이름이 있는 상수를 만드는 방법 (대문자로 만드는게 관례)
		//max = 1;
		
		double area = 3.14 * 3 * 3;
		
		final double PI = 3.14;
		int r = 3;
		area = PI * r * r;
	}
}
