package ch02.home.ex01;

import java.util.Scanner;

public class H02Replacement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b,num = 0;
		
		// presentation logic 
		System.out.print("a���� �Է��ϼ���.\n>");
		a = sc.nextInt();
		System.out.print("b���� �Է��ϼ���.\n>");
		b = sc.nextInt();
		System.out.printf("a=%d  b=%d\n" , a, b);
		
		// business logic
		System.out.println(">a, b ���� ��ü�մϴ�.");	
		num = a;
		a = b;
		b = num; 
		System.out.printf("a=%d  b=%d" , a, b);
	}
}
/*
����] a,b ������ ���� ��ü�϶�.

a�� b���� ���Ƿ� �Է� �޴´�.
��ü ����� ����Ѵ�.
*/