package ch06.ex02.case01.sub;

import ch06.ex02.case01.A;

public class B {
	public void test() {		
		A a = new A();
		
		int x = 0;
		//x = a.a; private
		//x = a.b; default ������Ű���� �������� ��밡��
		//x = a.c; protected ������Ű���� �������� ��밡��
		x = a.d;
		
		//a.m1();
		//a.m2();
		//a.m3();
		a.m4();
	}
}
