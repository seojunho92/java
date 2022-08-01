package ch04.ex02;

import java.util.Scanner;

public class C04Season {
	public static void main(String[] args) {
		int month = 0;
		String season = "";
		Scanner sc = new Scanner(System.in);
		
		System.out.print("월: ");
		month = sc.nextInt();
		
		switch(month) {
		case 3: 						// switch는 중복될 경우 명령문을 쓰지 않아도 작동한다.
		case 4:
		case 5: 
			season = "봄"; break;		// 가독성을 위해 중복된 부분 명령어를 아래로 내려 묶음으로 보이게한다.
		case 6: case 7: case 8: 		// 중복되는 부분은 가로로 처리해도 된다.
			season = "여름"; break;
		case 9: case 10: case 11:
			season = "가을"; break;
		case 12: case 1: case 2:
			season = "겨울"; 
		}
		
		System.out.printf("%d월은 %s 입니다.", month, season);
	}
}
