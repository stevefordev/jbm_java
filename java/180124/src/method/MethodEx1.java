package method;

public class MethodEx1 {

	/*
	 * 멤버필드의 선언
	 * 
	 * 접근제한자 (static) 자료형 필드형;
	 * 
	 * 
	 * 메서드의 선언
	 * 
	 * 접근제한자 (static) 리턴자료형 메서드명(인자,,,)
	 * 만약, 리턴자료형이 있다면 반드시 return 키워드가 필요함
	 * */

	/***
	 * 접근제한자가 디폴트이고 리턴 값이 없고, 인자도 없는 테스트 메서드
	 * 
	 * @Method Name: test
	 */
	void test() {
		System.out.println("msg");
	}
	
	/**
	 * 접근제한자가 퍼블릭이고 리턴 자료형이 기본 자료형 int 형인 인자가 없는 인스턴스 메서드
	 * @return
	 * @Method Name: test2
	 */
	public int test2() {
		return 0;
	}

	public static void main(String[] args) {

		System.out.println();
	}// main() end

}// MethodEx1
