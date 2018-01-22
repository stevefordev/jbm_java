package operation;

public class OperationEx2 {

	public static void main(String[] args) {

		/*
		 * 1항 연산자
		 * 
		 * 1) ! : 부정연산자(논리값 부정)
		 * 2) ++ / -- : (증*감 연산자)
		 *	증감 연산자
		 *		선위형 /  후위형
		 *		++변수 / 변수++
		 *		- 선위형은 우선순위 높음
		 *		- 후위형은 우선순위 엄청 낮음
		 *
		 * a++;(후위 증가 연산자)
		 * ++a;(선위 증가 연산자)
		 * a--;(후위 감소 연산자)
		 * --a;(선위 감소 연산자)
		 * */

		// boolean 형 변수 b를 선언 후 false 값 대입(초기화)
		boolean b = false;
		System.out.println(b);
		System.out.println(!b);
		System.out.println(!!b);
		System.out.println(!!!b);

		int c = 4;
		int d = 4;
		System.out.println(c++);
		System.out.println(c);
		System.out.println(++d);

	}// main() end

}// OperationEx2
