package ch02.home.ex02;

import java.time.LocalDate;
import java.util.Scanner;

public class Reservation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year,month,day;
		// �˻�
		System.out.println("���� ���ڸ� �Է��ϼ���.");
		System.out.print(">��: ");
		year = sc.nextInt();
		System.out.print(">��: ");
		month = sc.nextInt();
		System.out.print(">��: ");
		day = sc.nextInt();
		// ����
		LocalDate showDate = LocalDate.of(year, month, day);
		System.out.println();
		System.out.println(showDate + " ������ �����߽��ϴ�.");
		// ȯ��
		//showDate = showDate.minusDays(3);
		System.out.println(showDate.minusDays(3) + " ���� ȯ���� �����մϴ�.");
	}
}
/*
�����϶�. ȯ���� �����Ϸκ��� 3�� ������ �����ϴ�.
--

���� ���ڸ� �Է��ϼ���.
��: 2025
��: 7
��: 17

2025-07-17 ������ �����߽��ϴ�.
2025-07-14 ���� ȯ���� �����մϴ�.
*/