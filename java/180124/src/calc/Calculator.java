package calc;

//계산기 클래스
public class Calculator {

	/***
	 * 정수 2개를 받아서 더한 후 리턴하는 메서드
	 * 
	 * @param a
	 * @param b
	 * @return
	 * @Method Name: sum
	 */
	public int sum(int a, int b) {
		return a + b;
	}

	/***
	 * 정수 2개를 받아서 뺀 후 리턴하는 메서드
	 * 
	 * @param a
	 * @param b
	 * @return
	 * @Method Name: subtract
	 */
	public int subtract(int a, int b) {
		return a - b;
	}

	/***
	 * 정수 2개를 받아서 곱한 후 리턴하는 메서드
	 * 
	 * @param a
	 * @param b
	 * @return
	 * @Method Name: multiply
	 */
	public int multiply(int a, int b) {
		return a * b;
	}

	/***
	 * 정수 2개를 받아서 나눈 후 리턴하는 메서드
	 * 
	 * @param a
	 * @param b
	 * @return
	 * @Method Name: divide
	 */
	public double divide(int a, int b) {
		return a / (double) b;
	}
}
