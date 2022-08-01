package ch03.ex04;

public class C01Artih {
	public static void main(String[] args) {
		byte a = 3;
		byte b = 2;
		byte c = (byte) (a + b);	// 산수연산은 리턴값이 int
		System.out.println(c);
		
		// c = c + 1; <- 에러
		c++;	// <- 가능
		System.out.println(c);
		
		double d = a / b;
		System.out.println(d); // overflow
		
		d = (double)a/b;
		System.out.println(d);
		d = 1.0 * a / b;
		System.out.println(d);
		
		// 나쁜사례
		d = (double)(a/b);
		System.out.println(d);
		d = a / b *1.0;
		System.out.println(d);
	}
}