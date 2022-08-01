package ch07.ex01.case09;

public class Shooter {
	private Gun gun;	// 확장성을 위해 dependency의 타입은 인터페이스로 사용한다.
	
	public void fire() {
		this.gun.fire();
	}
	
	public void setGun(Gun gun) {
		this.gun = gun;
	}
}
