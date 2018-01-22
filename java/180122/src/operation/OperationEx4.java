package operation;

public class OperationEx4 {

	public static void main(String[] args) {

		/*
		 * 논리연산자 (&&, ||)
		 * 
		 * 
		 * 논리곱 (&&) : true(1) false(0)
		 * - 전부 true 일때만 true
		 * true true = true
		 * true false = false
		 * false true = false
		 * false false = false
		 * 
		 * 논리합 (||) : true(1) false(0)
		 * - 둘 다 false 일때만 false
		 * true true = true
		 * true false = true
		 * false true = true
		 * false false = false
		 * 
		 * 비트연산자 : ^, |, &
		 * 
		 * 논리연산자와 비트연산자의 차이
		 * 논리연산자는 논리가 중요함!
		 * 
		 * 만약 && 일경우 앞의 항이
		 * false 면 뒤 항은 실행하지 않음
		 * || 일 경우 앞의 항이 true 면
		 * 뒤의 항은 실행하지 않음
		 * (비트연산자 앞뒤항 전부 실행함)
		 * 
		 * */

		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);
		System.out.println("----- -----");
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
	}// main() end

}// OperationEx4
