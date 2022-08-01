package ch02.ex01;

import java.util.Scanner;

public class C03Input {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		System.out.print("문자열을 입력하세요.\n>");
		String inVal = sc.nextLine();
		// 과제 ] <입력데이터>를 입력했습니다. 는 확인 메세지를 출력한다
		//System.out.printf("<%s>를 입력했습니다.", inVal);
		System.out.println("<"+inVal+">"+"를 입력했습니다.");
		*/
		
		/*
		System.out.print("숫자를 입력하세요.\n>");
		int i = sc.nextInt();                       // nextLine():String타입 , nextInt():Int타입
		System.out.println(i+"를 입력했습니다.");
		
		System.out.print("숫자를 입력하세요.\n>");
		int x = sc.nextInt();                     
		System.out.println(x+"를 입력했습니다.");
		
		sc.nextLine();	// nextLine() 사용전 초기화
		System.out.print("문자열을 입력하세요.\n>");
		String inVal = sc.nextLine();
		System.out.printf("<%s>를 입력했습니다.", inVal);
		*/
		System.out.print("문자를 입력하세요.\n");
		char c = sc.nextLine().charAt(4);
		System.out.println(c);
	}
}