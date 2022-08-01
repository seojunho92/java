package ch02.home.ex01;

public class H01Replacement {
	public static void main(String[] args) {
		
		int a,b,num = 0;
		a = 1;
		b = 2;
		
		System.out.printf("%d %d\n",a ,b);
		
		num = b;
		b = a;
		a = num;
		
		System.out.printf("%d %d", a ,b);
	}
}
/*
과제] 두 변수의 데이터를 교체하라.
a:1, b:2
a:2, b:1
*/