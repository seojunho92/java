package ch07.ex01.case01;

public class Main {
	public static void main(String[] args) {
		C c = new C();
		B b = c;	// A > B > C
		A a = c;	// 프로모션
		
		c = (C)a;	// 캐스팅
		c = (C)b; 
		
		b = (B)a;
		
		// String s = (String)c; // 가지고 있는 타입에서만 캐스팅가능
	}
}
