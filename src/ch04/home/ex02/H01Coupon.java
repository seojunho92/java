package ch04.home.ex02;

public class H01Coupon {
	public static void main(String[] args) {
		int grade = 2;
		String coupon = "";
		
		if(grade == 3) coupon = "10,000원";
		else if(grade == 2) coupon = "5,000원";
		else coupon = "1,000원";	
		
		System.out.println(coupon);
	}
}
/*
과제] ch04.ex02.C03Swith 를 if 로 refactoring 하라
*/