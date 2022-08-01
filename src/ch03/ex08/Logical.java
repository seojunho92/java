package ch03.ex08;

public class Logical {
	public static void main(String[] args) {
		boolean b = false;
		
		b = true && true;	//true
		b = (2 > 1) && (2 > 1);	//true 
		b = 2 < 1 && 2 > 1; // false - 비교와 논리가 같이있으면 비교가 먼저 실행된다.
		b = 2 < 1 || 2 > 1; // true
		b = 2 < 1 || 2 < 1; // false
		System.out.println(b);
		
		int x = 0;
		int y = 0;
		b = ++x < 0 && ++y < 0;	// &&는 처음이 false이면 뒤는 계산을 안한다. 따라서, ++y < 0은 계산을 안해서 y=0 이다.
		
		x = 0;
		y = 0;
		b = ++x < 0 & ++y <0;
		
		x = 0;
		y = 0;
		b = ++x < 0 || ++y < 0;	
		
		x = 0;
		y = 0;
		b = ++x > 0 || ++y < 0; // ||는 처음이 true이면 뒤는 계산을 안한다. 따라서, ++y < 0은 계산을 안해서 y=0 이다.
		
		x = 0;
		y = 0;
		b = ++x > 0 | ++y < 0;
		
		System.out.printf("x: %d, y: %d, b: %b", x , y , b);
	}
}
