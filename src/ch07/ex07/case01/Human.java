package ch07.ex07.case01;

@FunctionalInterface
public interface Human {
	void say();	// say() 메서드의 데이터 타입은 Human이다.
	//void tell(); @FunctionalInterface 람다는 1개의 메서드만 사용가능하다.
}
