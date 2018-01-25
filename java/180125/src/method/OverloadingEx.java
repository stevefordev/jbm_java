package method;

public class OverloadingEx {

	/*
	 * 오버로딩이란?
	 * 
	 * 메서드(혹은 생성자)의 이름이 같고
	 * 인자가 다른것
	 * 
	 * 1) 자료형이 다른다.
	 * 2) 갯수가 다르다.
	 * 3) 갯수나 자료형이 같더라도 순서가 다르다.
	 * */

	static void test() {
		System.out.println("★");
	}

	static void test(int a) {
		System.out.println("●");
	}

	static void test(boolean a) {
		System.out.println("◆");
	}

	public static void main(String[] args) {

		test();
		test(23);
		test(true);
	}
}
