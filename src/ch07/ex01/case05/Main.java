package ch07.ex01.case05;

public class Main {
	public static void main(String[] agrs) {
		Car car = new FireEngine();
		car.run();
		//car.water();
		
		FireEngine fireEngine = (FireEngine)car;
		fireEngine.water();
		fireEngine.run();
		
		((Car)fireEngine).run();
	}
}
