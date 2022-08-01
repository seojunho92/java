package ch05.ex01.case03;

// encapsulation
public class User {
	private String name;	// name : (맴버변수) 객체이기 떄문에 heap 에 생성
	private int age;	// 캡슐화의 방법 = private(비공개) 멤버변수
	
	// setter - set으로 시작하는 메서드
	public void setName(String name) { // name : 지역변수이기 때문에 stack에 생성
		this.name = name;	// stack -> heap / this 사용
		// name = name; // stack -> stack
	}
	
	public void setAge(int age) {	// public(공개<->private)
		this.age = age;
	}
	
	// getter - get으로 시작하는 메서드
	public String getName() { // 읽기는 읽어오는 데이터()가 없다 
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
}