package ch07.ex01.case01;

public class Main {
	public static void main(String[] args) {
		C c = new C();
		B b = c;	// A > B > C
		A a = c;	// ���θ��
		
		c = (C)a;	// ĳ����
		c = (C)b; 
		
		b = (B)a;
		
		// String s = (String)c; // ������ �ִ� Ÿ�Կ����� ĳ���ð���
	}
}
