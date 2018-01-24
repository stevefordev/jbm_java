package access;

public class AccessApp {

	public static void main(String[] args) {
		/*
		 * 클래스 Z 를 가지고 만들어진 객체의 레퍼런스를 담을 수 있는
		 * 객체자료형 변수 z를 선언
		 * */
		Z z;

		// new 라는 키워드를 통해서 heap 메모리에 영역을 하나 할당받고
		// Class Z 의 기본 생성자를 호출하여 그 객체를 생성후
		// 그 객체의 레퍼런스를 변수 z에 대입
		z = new Z();
		

	}// main() end

} //AccessApp end
