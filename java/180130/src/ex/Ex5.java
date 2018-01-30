package ex;

import java.util.Scanner;

/***
 * 
 * while문과 break를 이용하여 다음과 같은 프로그램을 만들어 보세요 ('끝'이라는 글자를 입력하지 않으면 무한이 반복되는 프로그램)
 * 
 * @author Administrator
 *
 */
public class Ex5 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.println("'끝' 이라고 입력하면 종료됩니다.");
			String msg = scan.nextLine();

			if (!msg.equals("끝")) {
				System.out.println(String.format("당신이 입력한 글자는 %s \r\n종료가 안되네요", msg));

			} else {
				System.out.println("끝이라고 입력하셔쎈요~^^ 종료!");
				break;
			}
			System.out.println("");
		}
	}

}
