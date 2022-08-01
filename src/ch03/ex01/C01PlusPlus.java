package ch03.ex01;

public class C01PlusPlus {
	public static void main(String[] args) {
		int i = 0;
		++i;
		System.out.println(i);
		i++;
		System.out.println(i);
		
		i = 0;
		int j = ++i;
		System.out.printf("i: %d, j: %d\n", i , j);
		i = 0;
		j = i++;	// ++이 뒤에 있는경우 할당연산자가 먼저 계산됨 j = i -> i++
		System.out.printf("i: %d, j: %d\n", i , j);
	}
}
