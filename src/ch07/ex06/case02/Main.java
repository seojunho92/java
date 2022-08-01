package ch07.ex06.case02;

public class Main {
	public static void main(String[] args) {
		Life alien1 = new Alien();
		Alien alien2 = new Alien();
		
		alien1.eat();
		alien2.eat();
		
		alien1.shout();	//메서드가 있어야 호출할수있다.
		alien2.shout(); //둘다 shout이 있지만 override로 인해 부모의 메서드도 자식메서드가 사용된다.
		
		Life.eat();
		Alien.eat();
	}
}
