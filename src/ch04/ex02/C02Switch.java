package ch04.ex02;

public class C02Switch {
	public static void main(String[] args) {
		String grade = "silver";
		String coupon = "";
		
		switch(grade) {
		case "gold" : coupon += "10,000�� ";
		case "silver" : coupon += "5,000�� ";
		case "copper" : coupon += "1,000�� ";
		}
		System.out.println(coupon);
	}
}
