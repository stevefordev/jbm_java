/**
 * 
 */
package ex;

import access.*;

/**
 * @author Administrator
 *
 */
public class AccessApp {

	/**
	 * @param args
	 * @Method Name: main
	 */
	public static void main(String[] args) {

		/*
		 * 클래스 Z를 가지고 만들어진 객체의 레퍼런스를 담을 수 있는
		 * 객체자료형 지역변수 z를 선언
		 * */
		Z z;

		/*
		 * new 라는 키워드를 통해 heap 메모리 영역에 공간을 할당받고
		 * 클래스 Z의 기본 생성자를 호출하여
		 * 객체를 생성후 그 레퍼런스를 지역변수 z에 대입
		 * */
		z = new Z();

		System.out.println(z.b );
	}

}
