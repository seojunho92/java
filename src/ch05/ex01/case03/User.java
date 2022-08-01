package ch05.ex01.case03;

// encapsulation
public class User {
	private String name;	// name : (�ɹ�����) ��ü�̱� ������ heap �� ����
	private int age;	// ĸ��ȭ�� ��� = private(�����) �������
	
	// setter - set���� �����ϴ� �޼���
	public void setName(String name) { // name : ���������̱� ������ stack�� ����
		this.name = name;	// stack -> heap / this ���
		// name = name; // stack -> stack
	}
	
	public void setAge(int age) {	// public(����<->private)
		this.age = age;
	}
	
	// getter - get���� �����ϴ� �޼���
	public String getName() { // �б�� �о���� ������()�� ���� 
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
}