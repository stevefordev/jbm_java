package control;

public class ForEx1 {

	public static void main(String[] args) {

		/*
		 * 제어문
		 * 1. 분기문 : if, switch
		 * 2. 반복문 : for, while
		 * 
		 * 반복문은 반복하는 문장
		 * */

		/*
		 * for 문의 문법
		 * 
		 * for(초기식; 조건식; 증감식) {
		 * 	반복 구문
		 * }
		 * */

		for (int i = 0; i < 10; i++) {
			System.out.println("i:" + i);
		}

		System.out.println("----- -----");

		for (int i = 5; i <= 10; i++) {
			System.out.println("i:" + i);
		}

		int[] index = { 1, 2, 3, 4, 5, 6 };
		for (int idx : index) {
			System.out.println("idx:" + idx);
		}

		String star = "";
		for (int i = 1; i <= 5; i++) {
			star += "*";
			System.out.println(star);
		}
		star = "";
		for (int i = 1; i <= 5; i++) {
			star = "";
			for (int j = 0; j < 5 - i; j++) {
				star += " ";
			}
			for (int k = 0; k < i; k++) {
				star += "*";
			}

			for (int l = 1; l < i; l++) {
				star += "*";
			}

			System.out.println(star);
		}

	}// main() end

}// ForEx1 end
