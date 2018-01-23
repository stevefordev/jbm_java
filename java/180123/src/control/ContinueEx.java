package control;

public class ContinueEx {

	public static void main(String[] args) {

		/*
		 * continue 키워드
		 * - 반복문(for, while)에서 사용가능
		 * - 반복 한번을 넘김
		 * */

		for (int i = 1; i < 11; i++) {

			if (i == 5) {
				continue;
			}
			System.out.println(i);
		}
	}// main() end

}
