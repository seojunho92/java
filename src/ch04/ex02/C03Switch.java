package ch04.ex02;

public class C03Switch {
	public static void main(String[] args) {
		int grade = 2;
		String coupon = "";
		
		switch(grade) {
		case 3: coupon = "10,000원"; break; // break - 블럭 빠져나오기/switch문이랑 별개의 명령어
		case 2: coupon = "5,000원"; break;
		case 1: coupon = "1,000원"; 
		}
		
		System.out.println(coupon);
	}
}
