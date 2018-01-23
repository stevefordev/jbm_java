package control;

public class BreakEx {

	public static void main(String[] args) {

		/*
		 * break 문
		 * switch, for, while 문에서 사용
		 * 
		 * break 문을 만나면 구문을 벗어남
		 * */
		for (int i = 1; i < 11; i++) {

			if (i == 5) {
				break;
			}

			System.out.println(i);
		}

	}// main() end

}
