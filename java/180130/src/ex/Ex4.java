package ex;

import java.text.DateFormat;
import java.util.Date;
import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		System.out.println("당신의 주민등록번호 앞의 6자리를 입력하세요.");
		Scanner scan = new Scanner(System.in);
		String birth = scan.next();

		int month = Integer.parseInt(birth.substring(2, 4));
		int day = Integer.parseInt(birth.substring(4, 6));

		System.out.println(String.format("당신의 생일은 %d월 %d일 입니다.", month, day));
	}
}
