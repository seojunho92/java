package ch07.ex07.case05;

public class Main {
	public static void main(String[] args) {
		Janitor<Building> janitor1 = a -> System.out.println(a + ", 청소합니다."); 
		//파라미터가 1개일경우 () 생략가능 / 파라미터명은 임의로 가능
		Janitor<Car> janitor2 = b -> System.out.println(b + ", 청소합니다.");
		
		janitor1.clean(new Building());
		janitor2.clean(new Car());
		
		//janitor1.clean(new Car());
	}
}
