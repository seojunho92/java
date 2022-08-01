package ch08.ex03.case02;

public class Main {
	public static void main(String[] args) {
		String userId = "hello";
		
		try {
			if(userId.length() > 3)
				throw new LengthException("ID 길이가 초과되었습니다.");
				// throw 사용시 try catch가 강제된다.
		} catch(LengthException e) {
			e.printStackTrace();
		}	
		
		throw new NumberException("숫자가 아닙니다.");
		// RuntimeException을 상속받으면 try catch가 없어도 사용가능하다.
	}
}
