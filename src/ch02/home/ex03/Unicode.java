package ch02.home.ex03;

import java.util.Scanner;

public class Unicode {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char c;
		int x;
		// 입력
		System.out.print("문자 : ");
		c = sc.nextLine().charAt(0);
		x = c;
		// 출력
		System.out.printf("%c 의 unicode는 %d 입니다.", c, x);
	}
}
/*
과제] 입력한 문자의 unicode 를 출력하라.
--\
문자 : A
A의 unicode는 65입니다.
*/