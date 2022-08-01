package ch04.home.ex01;

import java.util.Scanner;

public class H01Grade {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score = 0;
		int tenDigit = 0; // 십의자리
		int oneDigit = 0; // 일의자리
		String grade = ""; 
		
		System.out.print("점수: ");
		score = sc.nextInt();
		
		tenDigit = score / 10;
		oneDigit = score % 10;
		
		if(tenDigit >= 9) grade = "A";
		else if (tenDigit >= 8) grade = "B";
		else grade = "C";
		
		if(score >= 80) {
			if(oneDigit >= 8 || tenDigit == 10) grade += "+";
			else if(0 <= oneDigit && oneDigit < 4) grade += "-";
		}
		
		System.out.println(grade);
		/*
		int score;		// 점수
		String grade;	// 학점
		// 입력
		Scanner sc = new Scanner(System.in);
		System.out.print("점수: ");
		score = sc.nextInt();
		// 처리
		if(score >= 98) grade = "A+";
		else if(94 <= score && score < 98) grade = "A";	
		else if(90 <= score && score < 94) grade = "A-";	
		else if(88 <= score && score < 90) grade = "B+";	
		else if(84 <= score && score < 88) grade = "B";	
		else if(80 <= score && score < 84) grade = "B-";	
		else grade = "C";
		// 출력
		System.out.println(grade);
		*/
	}
}
/*
다음 구간별로 학점을 부여하라. 
 98 이상 A+
 94 이상 A
 90 이상 A-
 88 이상 B+
 84 이상 B
 80 이상 B-
 80 미만 C
 --
 
 점수: 100
 A+
*/