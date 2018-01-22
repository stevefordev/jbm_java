package type;

public class CalculationEx {

	public static void main(String[] args) {

		/*
		 * 같은 영역 안에 같은 이름의 변수는 두번이상 사용 할 수 없다.
		 * 
		 * */

		byte a = 3;
		byte b = 1;

		/*
		 * int 혹은 int 보다 작은 자료형간의 계산의 결과 : int 형
		 * 
		 * int 보다 큰 자료형의 경우
		 * 계산의 결과 큰 자료형으로 
		 * 
		 * ex) int + long = long
		 * 		float + long = float
		 * 		double + float = double
		 * */
		byte c = (byte) (a + b);
		int d = a + b;

		int i = 2147483647;
		int j = 2147483647;

		int k = i + j;
		System.out.println(k);

		long l = (long) i + j;
		System.out.println(l);
	}// main () end

} // CalculationEx end
