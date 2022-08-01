package ch07.ex04.case06;

public class Main {
	public static void main(String[] args) {
		Animal[] animals = new Animal[3];	// 인터페이스로 객체를 만드는것이 아닌 배열객체를 만드는것
		
		animals[0] = new Cat("헤롱이");
		animals[1] = new Dog("왈왈이");
		animals[2] = new Dog("성큼이");
		
		for(Animal animal: animals) 
			System.out.println(animal);
		
		Object[] objs = new Object[3];
		objs[0] = new Cat("헤롱이");
		objs[1] = new Dog("왈왈이");
		objs[2] = new Dog("성큼이");
		
		for(Object obj: objs)
			System.out.println(obj);
	}
}
