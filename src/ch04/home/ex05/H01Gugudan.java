package ch04.home.ex05;

public class H01Gugudan {
	public static void main(String[] args) {
		for(int x = 2; x < 10; x++) {
			for(int y = 1; y < 10; y++) {
				System.out.printf("%d * %d = %d\n", x, y, x*y);
			}
			System.out.println();
			System.out.println();
		}
	}
}
/*
과제] 구구단을 출력하라.
--

2 * 1 = 2
2 * 2 = 4
...
2 * 9 = 18


3 * 1 = 3
...
9 * 9 = 81
*/