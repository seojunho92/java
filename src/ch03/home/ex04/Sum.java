package ch03.home.ex04;

import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("A: ");
		int a = sc.nextInt();
		System.out.print("B: ");
		int b = sc.nextInt();
		System.out.printf("%d + %d = %d", a , b , a+b);
	}
}
/*
�� �ڿ����� �Է� �޾�, �� �հ踦 ����϶�.
--

a: 1
b: 2
1 + 2 = 3
*/