package ch04.ex04;

import java.util.Scanner;

public class C05Calculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 0;
		int b = 0;
		String aStr = "";
		String bStr = "";
		String op = "";
		boolean isGood = false;
		int result = 0;
		String isRepeat = "";
		
		do {
			do {
				System.out.print("a: ");
				aStr = sc.nextLine();
				if(aStr.length()  == 1 && '0' < aStr.charAt(0) && aStr.charAt(0) <= '9') {
					isGood = true;
					a = Integer.parseInt(aStr); // String 타입 숫자를 int로 변환 , 숫자를 문자 = toString
				} else System.out.println("ERROR] 10미만의 자연수를 입력하세요.");
			} while(!isGood);
			
			do {
				isGood = false;
				System.out.print("op: ");
				op = sc.nextLine();
				if(op.length() == 1 && 
					(op.equals("+") || op.equals("-") || op.equals("*") || op.equals("/"))) {
					isGood = true;
				} else System.out.println("ERROR] +, -, *, / 중의 하나를 입력하세요.");
			} while(!isGood);
			
			do {
				isGood = false;
				System.out.print("b: ");
				bStr = sc.nextLine();
				if(bStr.length()  == 1 && '0' < bStr.charAt(0) && bStr.charAt(0) <= '9') {
					isGood = true;
					b = Integer.parseInt(bStr); // String 타입 숫자를 int로 변환 , 숫자를 문자 = toString
				} else System.out.println("ERROR] 10미만의 자연수를 입력하세요.");
			} while(!isGood);
			
			switch(op) {
			case "+": result = a + b; break;
			case "-": result = a - b; break;
			case "*": result = a * b; break;
			case "/": result = a / b; 
			}
			
			System.out.printf("%d %s %d = %d\n", a, op, b, result);
			
			do {
				isGood = false;
				System.out.print("계속할까요?(y/n)? ");
				isRepeat = sc.nextLine();
				if(isRepeat.length() == 1 &&
						(isRepeat.equalsIgnoreCase("y") || isRepeat.equalsIgnoreCase("n"))) {
					isGood = true;
				} else System.out.println("ERROR] y 혹은 n을 입력하세요.");
			} while(!isGood);
		} while(isRepeat.equalsIgnoreCase("y")); //equalsIgnoreCase 대소문자 구분없이 리턴
	}
}
