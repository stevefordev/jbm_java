package type;

/**
 * @author Administrator
 *
 */
public class TypeEx1 {

	/**
	 * @param args
	 * @Method Name: main
	 */
	public static void main(String[] args) {
		/*
		 * 자바의 자료형
		 * 
		 * 1. 기본 자료형 2. 객체 자료형 (== 클래스)
		 * 
		 * 3. 기본자료형 : 8가지 - 논리형 : boolean(true, false) - 기본값 : false
		 * 
		 */

		/*
		 * 자바스크립트의 변수 선언 var a;
		 * 
		 * 자바는 자료형이 진짜 중요함 변수선언 : 자료형 변수명;
		 * 
		 * 기본자료형 boolean 형 변수 a를 선언
		 */
		boolean a;

		/*
		 * boolean형 기본자료형 변수 a에 true 값을 대입
		 */
		a = true;
		a = false;

		System.out.println(a);

		/*
		 * 기본자료형 boolean형 변수 b를 선언
		 */
		boolean b;

		// 변수 b에 true를 대입
		b = true;

		// 자바의 지역변수는 초기화(첫번째 대입) 를 대입하지 않고서는 사용불가
		System.out.println(b);

	}
}