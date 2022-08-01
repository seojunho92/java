package ch09.ex01;

public class C01Counter {
	public static void main(String[] args) {
		System.out.println("main start.");
		
		Thread thread1 = new Thread(() -> {
			for(int i = 0; i < 10; i++)
				System.out.print(i + " ");
		});
		
		Thread thread2 = new Thread(() -> {
			for(char c = 'a'; c <= 'z'; c++)
				System.out.print(c + " ");
		});
		
		thread1.start();	// main thread�� ��ɾ �� �����ϸ� thread1�� �״��� ����Ǿ� start()�Ѵ�.
		thread2.start();
		
		System.out.println("main end.");
	}
}
