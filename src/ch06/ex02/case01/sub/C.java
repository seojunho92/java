package ch06.ex02.case01.sub;

import ch06.ex02.case01.A;

public class C extends A {
	public void test() {
		int x = 0;
		
		//x = this.a;
		//x = this.b; default ������Ű���� �������� ��밡��
		x = this.c; // protected �ٸ���Ű���� �ִ��� �ڽ��̸� ��밡��
		x = this.d;
		
		//this.m1();
		//this.m2();
		this.m3();
		this.m4();
	}
}
