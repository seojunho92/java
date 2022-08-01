package ch04.ex04;

import java.util.Scanner;

public class C03InOneNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int input = 0;
		
		do {
			System.out.print("입력: ");
			input = sc.nextInt();
		} while(!(1 <=input && input <=9));
		
		System.out.println("끝.");
	}
}
/*
과제] 한자리 숫자를 입력 받는다.
10이상의 자연수, 또는 문자가 입력되면 예외처리한.
*/
