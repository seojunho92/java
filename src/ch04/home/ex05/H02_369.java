package ch04.home.ex05;

public class H02_369 {
	public static void main(String[] args) {
		int tens = 0;
		int ones = 0;
		
		for(int i = 1; i <= 99; i++) {
			tens = i / 10;
			ones = i % 10;
			
			System.out.print(" " + i);
			if(tens != 0 && tens % 3 == 0) System.out.print("Â¦");
			if(ones != 0 && ones % 3 == 0) System.out.print("Â¦");
			
			if(i % 10 == 0) System.out.println();			
		}
		/* ³»°¡ ÇÑ ÄÚµå
		for(int x = 1; x < 10; x++) {
			System.out.print(" " + x);
			if(x % 3 == 0) System.out.print(" Â¦");
		}
		System.out.println();
		for(int i = 1; i < 10; i++) {
			for(int j = 0; j < 10; j++) {
				System.out.printf(" %d%d", i, j);
				if(i % 3 == 0) System.out.print("Â¦");
				if(j % 3 == 0 && j != 0) System.out.print("Â¦");
			}
			System.out.println();
		}
		*/
	}
}
/*
°úÁ¦] 369 °ÔÀÓÀ» ÇÏ¶ó.
¼ýÀÚ´Â 1ÀÌ»ó 99ÀÌÇÏÀÌ´Ù.
10´ÜÀ§ ÁÙ¹Ù²ÞÀ» ÇÑ´Ù.
--

1 2 3 Â¦ 4 5 6 Â¦ 7 8 9 Â¦
11 12 13Â¦ 14 15 16Â¦ 17 18 19Â¦ 20
21 ...
91Â¦ 92Â¦ 93Â¦Â¦ 94Â¦ 96Â¦Â¦ 97Â¦ 98Â¦ 99Â¦Â¦
*/