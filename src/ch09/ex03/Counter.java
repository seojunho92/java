package ch09.ex03;

public class Counter {
	private int val;
	
	public synchronized void increase() {	// synchronized 먼저 사용하면 사용하는동안 락을 건다.
		val++;
	}
	
	public synchronized void decrease() {
		val--;
	}
	
	public synchronized void print() {
		System.out.print(val + " ");
	}
}
