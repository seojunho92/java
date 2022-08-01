package ch02.home.ex01;

import java.util.Scanner;

public class H02Replacement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b,num = 0;
		
		// presentation logic 
		System.out.print("a값을 입력하세요.\n>");
		a = sc.nextInt();
		System.out.print("b값을 입력하세요.\n>");
		b = sc.nextInt();
		System.out.printf("a=%d  b=%d\n" , a, b);
		
		// business logic
		System.out.println(">a, b 값을 교체합니다.");	
		num = a;
		a = b;
		b = num; 
		System.out.printf("a=%d  b=%d" , a, b);
	}
}
/*
과제] a,b 변수의 값을 교체하라.

a와 b값을 임의로 입력 받는다.
교체 결과를 출력한다.
*/