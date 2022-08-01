package ch05.home.ex06.case02;

import java.util.Scanner;

public class Console {
	private static Scanner sc;
	private static String str;
	private static int num;
	private static boolean isGood;
	
	static {
		sc = new Scanner(System.in);
	}
	
	private static void inMsg(String msg) {
		System.out.print(msg + "\n> ");
	}
	
	public static String inStr(String msg) {
		isGood = false;
		do {
			Console.inMsg(msg);
			str = sc.nextLine().trim();
			if(str.length() > 0) {
				isGood = true;
			} else {
				Console.err("�ѱ��� �̻� �Է��ϼ���.");
			}
		} while(!isGood);
		return str;
	}								
	
	public static int inNum(String msg) {
		isGood = false;
		do {
			Console.inMsg(msg);
			str = sc.nextLine();
			if(str.length() == 1 && '0' < str.charAt(0) && str.charAt(0) <= '9') {
				num = Integer.parseInt(str);
				isGood = true;
			} else {
				Console.err("���ڸ� ���ڸ� �Է��ϼ���.");
			}
		} while(!isGood);
		return num;
	}
	
	public static void info(String msg) {
		System.out.println(msg);
	}
	
	public static void err(String msg) {
		System.out.println("ERROR] " + msg);
	}
}
