package ch04.home.ex02;

import java.util.Scanner;

public class H03Kawibawibo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int playerChoice = 0;
		int appChoice = 0;
		String result = "";
		String choice = "";
		
		System.out.print("1.����, 2.����. 3.��\n> ");
		playerChoice = sc.nextInt();
		appChoice = (int)(Math.random() * 3) + 1;
		
		if(1 <= playerChoice && playerChoice <= 3) {
			switch (playerChoice - appChoice) {
			case -2: case 1:
				result = "You win."; break;
			case -1: case 2:
				result = "You lose"; break;
			case 0:
				result = "Fair";
			}
			
			switch(playerChoice) {	// ���ڵ�
			case 1: choice = "����"; break;
			case 2: choice = "����"; break;
			case 3:	choice = "��";
			}
			System.out.println("You: " + choice);
			
			switch(appChoice) {	// ���ڵ�
			case 1: choice = "����"; break;
			case 2: choice = "����"; break;
			case 3:	choice = "��";
			}
			System.out.println("Me: " + choice);
		} else {
			result = "ERROR] 1, 2, 3 ���� �ϳ��� �Է��ϼ���.";
		}
		
		System.out.println(result);
		
		/* ���� ���� �ڵ�
		int player = 0;
		int com = 0;
		String you = "";
		String me = "";
		String result = "";
		
		Scanner sc = new Scanner(System.in);
		System.out.print("1.����, 2.����. 3.��\n> ");
		player = sc.nextInt();
		com = (int)(Math.random() * 3 + 1);
		
		if(player == com) result = "Fair";
		else if(com >= 2 && player > com || player == 1 && com == 3 ) result ="You Win";
		else if(player < com || player == 3 && com == 1 ) result ="You lose";

		switch(player) {
		case 1: you = "����"; break;
		case 2: you = "����"; break;
		case 3: you = "��";
		}
		
		switch(com) {
		case 1: me = "����"; break;
		case 2: me = "����"; break;
		case 3: me = "��";
		}
		
		System.out.printf("You: %s\nMe: %s\n%s", you, me, result);
		*/
	}
}
/*
����] �۰� ������������ �϶�.
���� ����� �˷��ش�.
�����
You win.
You lose.
Fair.
���� �ϳ��̴�.
--

1.����, 2.����, 3.��
> 1
You: ����
Me: ��

You win.
*/