package ch05.home.ex01.case04;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LocalDate memberDate = LocalDate.now();
		Member member = new Member();
		
		System.out.print("�̸�: ");
		member.setName(sc.nextLine());
		System.out.print("����: ");
		member.setAge(sc.nextInt());
		member.setMemberDate(memberDate.toString());
		
		System.out.println();
		System.out.printf("�̸�:%s\n����:%d\n������:%s\n", member.getName(), member.getAge(), member.getMemberDate());
	}
}
/*
����] ����ڸ� �����϶�.
������� �̸�, ���̸� ���� �Է� �޴´�.
�������� ���� ��¥�� �ڵ� �Է� �޴´�.
--

�̸�: gambit
����: 25

�̸�: gambit
����: 25
������: 2022-06-21
*/