package equal;

public class A {

	int a;

	public A(int a) {
		this.a = a;
	}

	public static void main(String[] args) {
		A a = new A(5);
		A b = new A(5);

		System.out.println(a == b);

		System.out.println(a.equals(b));
		/*
		 * 객체의 항등비교 (==)는
		 * 레퍼런스 비교 입니다.
		 * 
		 * (String등 일부객체를 제외)
		 * 객체의 equals() 메서드 비교도
		 * 레퍼런스 비교입니다.
		 * */
	}
}
