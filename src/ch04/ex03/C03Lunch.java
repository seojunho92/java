package ch04.ex03;

public class C03Lunch {
	public static void main(String[] args) {
		int calorie = 0;
		int food = 0;
		
		while(calorie < 30) {
			food = (int)(Math.random() * 10) + 1;
			
			if(food % 5 == 0) {
				System.out.println("상한 음식을 뱉다.");
				break;	// break - if 블럭을 제외한 반복블럭을 빠져나온다.
			}
			
			calorie += food;
		}
		
		System.out.println(calorie + "cal.만큼 먹었습니다.");
	}
}
/*
배 부를 때까지 먹을거야.
배가 고프면 먹어야지.
*/