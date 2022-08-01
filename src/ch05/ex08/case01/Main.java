package ch05.ex08.case01;

public class Main {
	public static void main(String[] args) {
		Baby baby = new Baby();
		baby.setName("초롱이");

		Baby baby2 = new Baby("튼튼이");
	}
}	
// Class.메서드 - 스태틱 메서드
// 객체.메서드 - 인스턴스 메서드
// new 메서드 - 생성자