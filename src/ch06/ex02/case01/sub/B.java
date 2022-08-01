package ch06.ex02.case01.sub;

import ch06.ex02.case01.A;

public class B {
	public void test() {		
		A a = new A();
		
		int x = 0;
		//x = a.a; private
		//x = a.b; default 같은패키지에 있을때만 사용가능
		//x = a.c; protected 같은패키지에 있을때만 사용가능
		x = a.d;
		
		//a.m1();
		//a.m2();
		//a.m3();
		a.m4();
	}
}
