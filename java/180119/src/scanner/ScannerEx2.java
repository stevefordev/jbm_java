package scanner;

import java.util.Scanner;

public class ScannerEx2 {

	public static void main(String[] args) {

		// 스캐너 객체 생성
		Scanner scanner = new Scanner(System.in);

		// 메세지 출력
		System.out.println("당신이 좋아하는 영화는?");

		// 유저가 입력한 영화이름 받음
		String movieName = scanner.nextLine();

		// 출력
		// 당신이 좋아하는 영화는 xxx 입니다.
		System.out.println(String.format("당신이 좋아하는 영화는 %s 입니다", movieName));
	}
}
