package constructor;

public class A {

	private A() {
		this(3);
	}

	public A(int a) {
		// 생성자에서 다른 생성자를 호출할때
		// this();

	}

	public A(boolean b) {
		this();
	}

}
