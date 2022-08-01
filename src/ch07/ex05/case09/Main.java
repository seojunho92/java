package ch07.ex05.case09;

public class Main {
	public static void main(String[] args) {
		C c = new C();
		String msg = "";
		if(c instanceof C) msg += "C ";
		if(c instanceof B) msg += "B ";
		if(c instanceof A) msg += "A ";
		if(c instanceof Object) msg +="Object ";
		System.out.println(msg);
		
		B b = new B();
		msg = "";
		if(b instanceof C) msg += "C ";
		if(b instanceof B) msg += "B ";
		if(b instanceof A) msg += "A ";
		if(b instanceof Object) msg +="Object ";
		System.out.println(msg);
		
		//if(b instanceof F)	관계가 있는 클래스만 instanceof를 사용가능하다.
		//if(c instanceof F)	아니면 에러. 인터페이스는 에러x
		
		F f = new F();
		msg = "";
		//if(f instanceof C)
		if(f instanceof A) msg += "A "; //instanceof에 인터페이스는 자유롭게 사용가능
		System.out.println(msg);		//결과는 true 또는 false
	}
}
