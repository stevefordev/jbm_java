package operation;

public class OperationEx1 {

	public static void main(String[] args) {
		/*
		 * 기본적인 연산자
		 * 1) + : 덧셈 / 문자열합침 연산
		 * 2) - : 뺄셈
		 * 3) * : 곱셈
		 * 4) / : 나눗셈
		 * 5) % : 나머지
		 * */
		System.out.println(3 - 5 + "3" + 7);

		// int 형 변수 a 를 선언
		int a = 12;
		// int 형 변수 b 를 선언
		int b = 5;

		int result = a + b;
		System.out.println(String.format("a+b=%d", result));

		result = a - b;
		System.out.println(String.format("a-b=%d", result));

		result = a * b;
		System.out.println(String.format("a*b=%d", result));

		result = a / b;
		System.out.println(String.format("a/b=%d", result));

		double resultDouble = (double) a / b;
		System.out.println(String.format("a/b=%.2f", resultDouble));

		result = a % b;
		System.out.println(String.format("a %% b = %d", result));

		/*
		 * 나머지 활용법
		 * 홀수 : x % 2 == 1
		 * 짝수 : x % 2 == 0		 
		 * */
		System.out.println(5 % 2);
	}// main() end

}
