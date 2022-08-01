package ch03.ex05;

public class Overflow {
	public static void main(String[] args) {
		int a = 1_000_000;
		int b = 1_000_000;
		
		long c = a + b;
		System.out.println(c);
		
		c = a * b;	// overflow
		System.out.println(c);
		
		c = (long)a * b;
		System.out.println(c);
		
		int x = a * b / a;	// 이미 앞에서 overflow 상태
		x = a * (b / a);
		System.out.println(x);
	}
}
