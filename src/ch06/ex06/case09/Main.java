package ch06.ex06.case09;

public class Main {
	public static void main(String[] args) {
		Console console = new Console();
		Browser browser = new Browser();
		
		console.out();
		browser.out();
		
		UI.in();
		
		System.out.println();
		Chrome chrome = new Chrome();
		//chrome.in;
		chrome.out();
		
		chrome.play();
		Chrome.play();  // �����ڵ�
		Browser.play(); 
	}
}
