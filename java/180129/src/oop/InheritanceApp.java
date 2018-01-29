package oop;

/*
 * extends 키워드가 없을 경우
 * extends Object가 생략되어 있음
 * (모든 클래스의 최상위 조상은 Object 클래스: 단군 할아버지)
 * 
 * */
class A extends Object {
	int a = 5;

	/*
	 * 개발자가 단 하나라도 생성자를
	 * 선언하지 않으면 컴파일러가 컴파일시
	 * 기본생성자를 하나 선언*/
	public A() {
		/*
		 * super() 생략
		 * 부모의 기본 생성자 호출
		 * */
		super();
	}
}

class B extends A {
	int a = 7;
	int b = 10;

	public B() {
		super();
	}

}

public class InheritanceApp {

	public static void main(String[] args) {

		A a = new A();
		a = new B();

		B b = (B) a;

		Object o = b;
		a = (A) o;
		//A c = "TEST";

		o = new String("TEST");
		//A d = (A) o;

		/*
		 * instanceof 연산자
		 * 해당 인스턴스내부에 그 클래스의 
		 * 객체가 있는지 확인하는 연산자
		 * */
		System.out.println(o instanceof String);
		System.out.println(o instanceof A);

	}
}
