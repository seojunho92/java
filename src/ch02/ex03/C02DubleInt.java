package ch02.ex03;

public class C02DubleInt {
	public static void main(String[] args) {
		double d = 1.92;
		int i = (int) d;
		System.out.printf("%d, %f\n", i, d);
		
		double f = Math.floor(d);	// ����ó��
		double r = Math.round(d);	// �ø�ó��(�ݿø�)
		
		System.out.printf("%f, %f", f, r);
	}
}
