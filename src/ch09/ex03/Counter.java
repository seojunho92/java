package ch09.ex03;

public class Counter {
	private int val;
	
	public synchronized void increase() {	// synchronized ���� ����ϸ� ����ϴµ��� ���� �Ǵ�.
		val++;
	}
	
	public synchronized void decrease() {
		val--;
	}
	
	public synchronized void print() {
		System.out.print(val + " ");
	}
}
