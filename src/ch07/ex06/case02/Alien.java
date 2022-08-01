package ch07.ex06.case02;

public class Alien extends Life {
	// @Override static은 상속이 불가능하다 따라서 오버라이드 불가능
	public static void eat() {
		System.out.println("Alien 먹다.");
	}
	
	@Override
	public void shout() {
		System.out.println("Alien 소리치다.");
	}
}
