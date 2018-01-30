package ex;

/**
 * 10,9,8,7,6 이 출력되는 프로그램을 작성하세요
 * 
 * @author Administrator
 *
 */
public class Ex1 {

	public static void main(String[] args) {

		int[] numbers = { 10, 9, 8, 7, 6 };

		for (int number : numbers) {
			System.out.println(number);
		}

		for (int i = 10; i > 5; i--) {
			System.out.println(i);
		}
	}
}
