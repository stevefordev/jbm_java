package ex;

import java.util.Scanner;

/***
 * 좋아하는 색상을 문자열로 입력받아 다음과 같이 출력되게 작성하세요.
 * 
 * @author Administrator
 *
 */
public class Ex2 {

	public static void main(String[] args) {
		System.out.println("당신이 좋아하는 색상은?");
		Scanner scan = new Scanner(System.in);
		String color = scan.nextLine();

		System.out.println(String.format("당신은 %s 을(를) 좋아하네요.^-^", color));
	}
}
