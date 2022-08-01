package ch07.ex06.case08;

import java.util.ArrayList;
import java.util.List;

public class Ship {
	private List<Container<?>> containers;	// 제너릭을 유지하고싶을떄 wildcard사용
	
	public Ship() {
		containers = new ArrayList<>();
	}
	
	public void put(Container<?> container) {
		containers.add(container);
	}
}
