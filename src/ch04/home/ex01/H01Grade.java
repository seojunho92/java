package ch04.home.ex01;

import java.util.Scanner;

public class H01Grade {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score = 0;
		int tenDigit = 0; // �����ڸ�
		int oneDigit = 0; // �����ڸ�
		String grade = ""; 
		
		System.out.print("����: ");
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
		int score;		// ����
		String grade;	// ����
		// �Է�
		Scanner sc = new Scanner(System.in);
		System.out.print("����: ");
		score = sc.nextInt();
		// ó��
		if(score >= 98) grade = "A+";
		else if(94 <= score && score < 98) grade = "A";	
		else if(90 <= score && score < 94) grade = "A-";	
		else if(88 <= score && score < 90) grade = "B+";	
		else if(84 <= score && score < 88) grade = "B";	
		else if(80 <= score && score < 84) grade = "B-";	
		else grade = "C";
		// ���
		System.out.println(grade);
		*/
	}
}
/*
���� �������� ������ �ο��϶�. 
 98 �̻� A+
 94 �̻� A
 90 �̻� A-
 88 �̻� B+
 84 �̻� B
 80 �̻� B-
 80 �̸� C
 --
 
 ����: 100
 A+
*/