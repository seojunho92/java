package ch07.ex07.case04;

public class Smith {
	public Gun makeGun() {	// 람다 이기 때문에 데이터는 메서드
		return () -> System.out.println("드르륵.");
	}
}
