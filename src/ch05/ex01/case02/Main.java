package ch05.ex01.case02;

public class Main {
	public static void main(String[] args) {
		String name = "���Ѽ�";
		int age = 35;
		System.out.printf("%s�� %d���Դϴ�.\n", name, age);
		
		User user = new User();
		user.name = "���Ѽ�";
		user.age = 35;
		System.out.printf("%s�� %d���Դϴ�.", user.name, user.age);
	}
}
