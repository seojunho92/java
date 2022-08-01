package ch05.ex09.case01;

public class Init {
	private static int s;
	private int i;
	
	static {			// 스태틱 블럭은 딱한번만 실행된다. (한번만 하는작업에 사용)
		Init.s = 1;
		//this.i = 1;	// this 변수 선언이 안되어있다.
		System.out.println("static{}");
	}
						
	{					// 인스턴스 블럭이 생성된 후 생성자가 생성된다.
		Init.s = 1;		// 생성자와 다르게 어떤경우에서든 실행한다.(꼭 실행할경우)
		this.i = 1;     // 인스턴스 변수는 new 할때마다 실행된다
		System.out.println("{}");
	}
	
	public Init() {		// 상황에 따라 실행할경우 생성자 사용.
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
