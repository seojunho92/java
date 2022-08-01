package ch07.ex07.case02;

public class Main {
	public static void main(String[] args) {
		Human human = () -> System.out.println("Human say.");
		human.say();	
		Human.walk();	
		//human.walk(); human 안에있는 메서드는 say()뿐이다.
		human.sleep();	// default 메서드는 상속취급으로 쓸수있다. (잘안씀)
		
		human = new Student();
		human.say();
		//human.walk();
		human.sleep();
	}
}
