package ch06.ex06.case08;

public interface Animal {
	default void eat() {	// default �޼��� : �������̽� �ȿ��� �ٵ� �ִ� �޼���
		System.out.println("������ �Դ�.");
	}
	
	void move();
}
