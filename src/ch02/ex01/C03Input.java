package ch02.ex01;

import java.util.Scanner;

public class C03Input {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		System.out.print("���ڿ��� �Է��ϼ���.\n>");
		String inVal = sc.nextLine();
		// ���� ] <�Էµ�����>�� �Է��߽��ϴ�. �� Ȯ�� �޼����� ����Ѵ�
		//System.out.printf("<%s>�� �Է��߽��ϴ�.", inVal);
		System.out.println("<"+inVal+">"+"�� �Է��߽��ϴ�.");
		*/
		
		/*
		System.out.print("���ڸ� �Է��ϼ���.\n>");
		int i = sc.nextInt();                       // nextLine():StringŸ�� , nextInt():IntŸ��
		System.out.println(i+"�� �Է��߽��ϴ�.");
		
		System.out.print("���ڸ� �Է��ϼ���.\n>");
		int x = sc.nextInt();                     
		System.out.println(x+"�� �Է��߽��ϴ�.");
		
		sc.nextLine();	// nextLine() ����� �ʱ�ȭ
		System.out.print("���ڿ��� �Է��ϼ���.\n>");
		String inVal = sc.nextLine();
		System.out.printf("<%s>�� �Է��߽��ϴ�.", inVal);
		*/
		System.out.print("���ڸ� �Է��ϼ���.\n");
		char c = sc.nextLine().charAt(4);
		System.out.println(c);
	}
}