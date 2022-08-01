package ch05.home.ex01.case04;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LocalDate memberDate = LocalDate.now();
		Member member = new Member();
		
		System.out.print("이름: ");
		member.setName(sc.nextLine());
		System.out.print("나이: ");
		member.setAge(sc.nextInt());
		member.setMemberDate(memberDate.toString());
		
		System.out.println();
		System.out.printf("이름:%s\n나이:%d\n가입일:%s\n", member.getName(), member.getAge(), member.getMemberDate());
	}
}
/*
과제] 사용자를 생성하라.
사용자의 이름, 나이를 수동 입력 받는다.
가입일은 오늘 날짜를 자동 입력 받는다.
--

이름: gambit
나이: 25

이름: gambit
나이: 25
가입일: 2022-06-21
*/