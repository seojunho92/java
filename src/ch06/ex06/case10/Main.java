package ch06.ex06.case10;

public class Main {
	public static void main(String[] args) {
		BusCard card = new BusCard() {	// {}이름없는 클래스
			@Override
			public void tagOn() {
				System.out.println("tag On.");
			}
			
			@Override
			public void tagOff() {
				System.out.println("tag Off.");
			}
		};	// = (할당연산자)가 포함된 명령문이기 때문에 {} 이후에 ;을 사용한다.
		
		card.tagOn();
		card.tagOff();
	}
}
