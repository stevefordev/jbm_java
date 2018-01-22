package operation;

public class OperationEx5 {

	public static void main(String[] args) {

		/*
		 * 삼항연산자 (if ~ else 문으로 가능!!)
		 * 
		 * - 조건식 ? 식1 : 식2
		 * - 조건식이 true 일때 식1, 조건식이 false 일때 식2	
		 *
		 * */

		int num = 0;
		if (5 > 3) {
			num = 100;
		} else {
			num = 50; 
		}

		System.out.println(num);

	}// main() end

}// OperationEx5
