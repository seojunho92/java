package ch02.ex03;

public class C02DubleInt {
	public static void main(String[] args) {
		double d = 1.92;
		int i = (int) d;
		System.out.printf("%d, %f\n", i, d);
		
		double f = Math.floor(d);	// 내림처리
		double r = Math.round(d);	// 올림처리(반올림)
		
		System.out.printf("%f, %f", f, r);
	}
}
