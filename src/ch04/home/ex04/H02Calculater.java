package ch04.home.ex04;

import java.util.Scanner;

public class H02Calculater {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 0;
		int b = 0;
		char op = 0;
		int result = 0;
		char isRepeat = 0;	// 토글변수는 is로 시작하는게 좋다.(isTrue/isFalse - boolean 타입)
		
		do {
			System.out.print("a: ");
			a = sc.nextInt(); sc.nextLine();
			System.out.print("op: ");
			op = sc.nextLine().charAt(0);
			System.out.print("b: ");
			b = sc.nextInt(); sc.nextLine();	// sc.nextLine();문자입력 쓰레기처리
			
			switch(op) {
			case '+': result = a + b; break;
			case '-': result = a - b; break;
			case '*': result = a * b; break;
			case '/': result = a / b; 
			}
			
			System.out.printf("%d %c %d = %d\n", a, op, b, result);
			System.out.print("계속할까요(y/n)? ");
			isRepeat = sc.nextLine().charAt(0);
		} while(isRepeat == 'y');
		
		System.out.println("끝.");
		
		/* 내가 한 코드
		Scanner sc = new Scanner(System.in);
		int a = 0;
		int b = 0;
		int result = 0;
		String calc = "";
		boolean next = false;
		
		do {
			System.out.print("a: ");
			a = sc.nextInt();
			System.out.print("op: ");
			calc = sc.next();
			System.out.print("b: ");
			b = sc.nextInt();
			
			if(calc.equals("+")) result = a + b;
			else if((calc.equals("-"))) result = a - b;
			else if((calc.equals("*"))) result = a * b;
			else if((calc.equals("/"))) result = a / b;
			
			System.out.printf("%d %s %d = %d\n", a, calc, b, result);
			while(!next) {
				System.out.print("계속 하시겠습니까(y/n)?");
				calc = sc.next();
				if(calc.equals("y")) break;
				else if(calc.equals("n")) next = true;
				else next = false;
			}
		} while(!next);
		*/
	}
}
/*
과제] 계산기를 만들어라.
연산자는 +,-,*,/ 이다.
/는 몫만을 얻는다.
--

a: 1
op: +
b: 2
1 + 2 = 3
계속 하시겠습니까(y/n)?  
*/