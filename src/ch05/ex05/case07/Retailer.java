package ch05.ex05.case07;

public class Retailer {
	public Apple sell(Apple apple) {	//(Apple apple, int price)
		apple.setPrice(apple.getPrice() * 2);
		return apple;
	}
}
