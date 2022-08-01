package ch08.ex03.case01;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class C03Try {
	public static void main(String[] args) {
		PrintWriter out = null;
		int[] arr = {1, 2, 3};
		
		try {
			out = new PrintWriter(new FileWriter("c:/DEV/a.txt"));
			
			for(int i: arr) out.println("arr[" + i + "]: " + arr[i]);
		} catch(IOException e) {
			System.out.println("IO 예외 발생했습니다.");
		} catch(ArrayIndexOutOfBoundsException e) {
			out.println("배열 예외가 발생했습니다.");
		} finally {	// try문에서 성공,실패 관계없이 실행
			if(out != null) out.close();
		}
		
		System.out.println("끝.");
	}
}
