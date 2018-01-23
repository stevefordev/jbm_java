package control;

public class WhileEx2 {

	public static void main(String[] args) {

		//while문을 이용해서 3단을 출력

		int idx = 1;

		while (idx < 10) {
			System.out.println("3 * " + idx + " = " + 3 * idx++);
		}

	}// main() end

}
