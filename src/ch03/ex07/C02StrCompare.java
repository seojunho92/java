package ch03.ex07;

public class C02StrCompare {
	public static void main(String[] args) {
		boolean b = false;
		
		String s  = "a";
		b = s == "a";	//true
		
		s = new String("a");
		b = s == "a";	//false - new String���� ������ �ٸ�
		
		b = s.equals("a");	// ���ڴ� .equals�� �� -> true
		
		System.out.println(b);
	}
}
