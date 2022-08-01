package ch05.home.ex05.case06;

public class User {
	private String name;
	private Phone phone;
	
	public void message() {
		phone.message();
	}
	
	public void call() {
		phone.call();
	}
	
	public void game() {
		phone.game();
	}

	public String getName() {
		return name;
	}

	public Phone getPhone() {
		return phone;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPhone(Phone phone) {
		this.phone = phone;
	}
}