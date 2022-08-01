package ch05.ex08.case04;

public class Deposit {
	private int balance;
	
	public Deposit() {
		//this.balance = 1000;
		this(1000);
	}
	
	public Deposit(int principal) {
		//this.balance = principal;
		this(principal, 0);
	}
	
	public Deposit(int principal, int interest) {
		this.balance = principal + interest + 100;
	}
	
	public int getBalance() {
		return this.balance;
		//return balance;
	}
}
