package ch07.ex01.case09;

public class Shooter {
	private Gun gun;	// Ȯ�强�� ���� dependency�� Ÿ���� �������̽��� ����Ѵ�.
	
	public void fire() {
		this.gun.fire();
	}
	
	public void setGun(Gun gun) {
		this.gun = gun;
	}
}
