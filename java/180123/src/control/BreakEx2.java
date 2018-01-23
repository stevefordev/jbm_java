package control;

import java.util.Scanner;

public class BreakEx2 {

	public static void main(String[] args) {

		//main 메서드 영역에 Scanner 클래스를 가지고 만들어진
		//객체(인스턴스)의 레퍼런스를 담을 수 있는 지역변수 scan을 선언
		Scanner scan;

		//스캐너객체를 생성하여 scan에 대입
		scan = new Scanner(System.in);

		while (true) {
			//유저에게 메세지 출력
			System.out.println("비밀번호를 입력하세요");

			int password = scan.nextInt();

			if (password == 123) {
				break;
			}
		}

		System.out.println("멋진 애플리케이션에 오신것을 환영합니다.");
	}// main() end

}
