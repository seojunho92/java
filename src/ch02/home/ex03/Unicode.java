package ch02.home.ex03;

import java.util.Scanner;

public class Unicode {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char c;
		int x;
		// �Է�
		System.out.print("���� : ");
		c = sc.nextLine().charAt(0);
		x = c;
		// ���
		System.out.printf("%c �� unicode�� %d �Դϴ�.", c, x);
	}
}
/*
����] �Է��� ������ unicode �� ����϶�.
--\
���� : A
A�� unicode�� 65�Դϴ�.
*/