package ch06.ex02.case01.sub;

import ch06.ex02.case01.A;

public class C extends A {
	public void test() {
		int x = 0;
		
		//x = this.a;
		//x = this.b; default 같은패키지에 있을때만 사용가능
		x = this.c; // protected 다른패키지에 있더라도 자식이면 사용가능
		x = this.d;
		
		//this.m1();
		//this.m2();
		this.m3();
		this.m4();
	}
}
