package ch07.ex07.case02;

@FunctionalInterface
public interface Human {	//람다는 추상메서드는 1개뿐이지만 다른메서드는 사용가능.
	void say();
	
	static void walk() {
		System.out.println("Human walk.");
	}
	
	default void sleep() {
		System.out.println("Human sleep.");
	}
}
