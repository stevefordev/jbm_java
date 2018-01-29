package oop2;

/*
 * 오버라이딩 '번복하다'
 * 메서드 재정의
 * 
 * 부모에서 메서드를 호출해도
 * 최하위 자식의 메서드가 실행됨
 * */
class A {
	int a = 5;

	void test() {
		System.out.println("A");
	}
}

class B extends A {
	int a = 10;

	@Override
	void test() {
		System.out.println("B");
	}

}

public class OverridingEx {
	public static void main(String[] args) {
		/*Object o = new A();
		A a = (A) o;
		System.out.println(a.a);*/

		Object o = new B();
		A a = (A) o;
		System.out.println(a.a);
		a.test();
		B b = (B) o;
		System.out.println(b.a);
		b.test();
	}
}
