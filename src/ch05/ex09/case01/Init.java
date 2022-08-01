package ch05.ex09.case01;

public class Init {
	private static int s;
	private int i;
	
	static {			// ����ƽ ���� ���ѹ��� ����ȴ�. (�ѹ��� �ϴ��۾��� ���)
		Init.s = 1;
		//this.i = 1;	// this ���� ������ �ȵǾ��ִ�.
		System.out.println("static{}");
	}
						
	{					// �ν��Ͻ� ���� ������ �� �����ڰ� �����ȴ�.
		Init.s = 1;		// �����ڿ� �ٸ��� ���쿡���� �����Ѵ�.(�� �����Ұ��)
		this.i = 1;     // �ν��Ͻ� ������ new �Ҷ����� ����ȴ�
		System.out.println("{}");
	}
	
	public Init() {		// ��Ȳ�� ���� �����Ұ�� ������ ���.
		Init.s = 1;
		this.i = 1;
		System.out.println("Init()");
	}
	
	public Init(int i) {
		Init.s = i;
		this.i = i;
		System.out.println("Init(int)");
	}
}
