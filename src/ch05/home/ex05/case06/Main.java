package ch05.home.ex05.case06;

public class Main {
	public static void main(String[] args) {
		Phone phone = new Phone();
		User user = new User();
		
		phone.setMakerName("�Ｚ");
		phone.setPrice(1_000_000);
		
		user.setName("���Ѽ�");
		
		user.setPhone(phone);
		
		user.message();
		user.call();
		user.game();
	}
}
/*
���Ѽ��� �Ｚ���� 1�鸸�� �ְ� ����ϴ�.
�տ� �� ���� ���� �幵�մϴ�.

�޼����� ���� ���ϴ�.
������ ����, ��ȭ�� �ɾ��, ������ �ȵǳ׿�.
��� �ڿ� �ٽ� ������ ���ƴϴ�.
��ٸ��� ���� ������ ������ �մϴ�.
*/