package ch08.ex03.case02;

public class Main {
	public static void main(String[] args) {
		String userId = "hello";
		
		try {
			if(userId.length() > 3)
				throw new LengthException("ID ���̰� �ʰ��Ǿ����ϴ�.");
				// throw ���� try catch�� �����ȴ�.
		} catch(LengthException e) {
			e.printStackTrace();
		}	
		
		throw new NumberException("���ڰ� �ƴմϴ�.");
		// RuntimeException�� ��ӹ����� try catch�� ��� ��밡���ϴ�.
	}
}
