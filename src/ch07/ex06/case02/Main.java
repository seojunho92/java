package ch07.ex06.case02;

public class Main {
	public static void main(String[] args) {
		Life alien1 = new Alien();
		Alien alien2 = new Alien();
		
		alien1.eat();
		alien2.eat();
		
		alien1.shout();	//�޼��尡 �־�� ȣ���Ҽ��ִ�.
		alien2.shout(); //�Ѵ� shout�� ������ override�� ���� �θ��� �޼��嵵 �ڽĸ޼��尡 ���ȴ�.
		
		Life.eat();
		Alien.eat();
	}
}
