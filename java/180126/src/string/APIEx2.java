package string;

import java.util.Scanner;

public class APIEx2 {

	public static void main(String[] args) {

		System.out.println("당신의 이메일을 입력하세요.");
		System.out.println("예) gooda84@daum.net");

		Scanner scan = new Scanner(System.in);

		String email = scan.nextLine();
		int at = email.indexOf("@");

		System.out.println("당신의 아이디는 " + email.substring(0, at) + " 입니다.");
	}
}
