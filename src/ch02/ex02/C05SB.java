package ch02.ex02;

public class C05SB {
	public static void main(String[] args) {
		StringBuffer src = new StringBuffer("�츮 ���� ");
		
		int len = src.length();
		System.out.println("length: " + len);
		
		src.append("¢�´�.");
		src.replace(3, 4, "�����");
		
		String str = src.toString();
		
		System.out.println(src);
		System.out.println(str);
	}
}
