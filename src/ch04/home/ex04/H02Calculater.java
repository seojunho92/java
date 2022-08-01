package ch04.home.ex04;

import java.util.Scanner;

public class H02Calculater {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 0;
		int b = 0;
		char op = 0;
		int result = 0;
		char isRepeat = 0;	// ��ۺ����� is�� �����ϴ°� ����.(isTrue/isFalse - boolean Ÿ��)
		
		do {
			System.out.print("a: ");
			a = sc.nextInt(); sc.nextLine();
			System.out.print("op: ");
			op = sc.nextLine().charAt(0);
			System.out.print("b: ");
			b = sc.nextInt(); sc.nextLine();	// sc.nextLine();�����Է� ������ó��
			
			switch(op) {
			case '+': result = a + b; break;
			case '-': result = a - b; break;
			case '*': result = a * b; break;
			case '/': result = a / b; 
			}
			
			System.out.printf("%d %c %d = %d\n", a, op, b, result);
			System.out.print("����ұ��(y/n)? ");
			isRepeat = sc.nextLine().charAt(0);
		} while(isRepeat == 'y');
		
		System.out.println("��.");
		
		/* ���� �� �ڵ�
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
				System.out.print("��� �Ͻðڽ��ϱ�(y/n)?");
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
����] ���⸦ ������.
�����ڴ� +,-,*,/ �̴�.
/�� ���� ��´�.
--

a: 1
op: +
b: 2
1 + 2 = 3
��� �Ͻðڽ��ϱ�(y/n)?  
*/