package ch06.ex06.case08;

public interface Animal {
	default void eat() {	// default 메서드 : 인터페이스 안에서 바디가 있는 메서드
		System.out.println("입으로 먹다.");
	}
	
	void move();
}
