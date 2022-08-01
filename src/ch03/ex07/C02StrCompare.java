package ch03.ex07;

public class C02StrCompare {
	public static void main(String[] args) {
		boolean b = false;
		
		String s  = "a";
		b = s == "a";	//true
		
		s = new String("a");
		b = s == "a";	//false - new String으로 만들경우 다름
		
		b = s.equals("a");	// 문자는 .equals로 비교 -> true
		
		System.out.println(b);
	}
}
