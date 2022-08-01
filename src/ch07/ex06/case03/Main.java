package ch07.ex06.case03;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Animal> zoo = new ArrayList<>();
		zoo.add(new Tiger());
		zoo.add(new Falcon());
		
		zoo.clear();	// clear() 리스트를 초기화하는 메서드
		zoo.add(Cosmos.getAnimal("호랑이"));
		zoo.add(Cosmos.getAnimal("매"));
		
		for(Animal animal: zoo) {
			animal.eat();
			animal.move();
		}
	}
}
