package ch05.home.ex05.case06;

public class Phone {
	private int price;
	private String makerName;
	
	public void message() {}	
	public void call() {}
	public void game() {}
	
	public int getPrice() {
		return price;
	}
	
	public String getMakerName() {
		return makerName;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void setMakerName(String makerName) {
		this.makerName = makerName;
	}
}