package ex;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {

		/*
		main 메서드가 가지고 있는 기본 자료형
		int 형 지역변수 i
		int i;
		*/

		/*
		 * Scanner 클래스를 가지고 만들어진 객체(인스턴스)의 
		 * 레퍼런스를 담을 수 있는 객체자료형 변수 scan을 선언
		 * */
		Scanner scan;
		// new 라는 키워드를 통해서 heap 메모리 영역안에 공간을 하나 할당받고 
		//스캐너 클래스이 생정자를 호출하여 스캐너 객체를 생성후 그 레퍼런스를 변수 scan 에 대입
		scan = new Scanner(System.in);

		// 콘솔에 출력
		System.out.println("점수를 입력하세요.");

		// main 메서드가 가지고 있는 기본자료형
		// int형 지역변수 score 을 선언하고
		int score;

		// 콘솔에서 유저가 입력한 숫자(int형)를
		// 입력받아서 변수 score에 대입
		score = scan.nextInt();

		String msg = "불합격";

		if (score >= 90) {
			msg = "합격";
		} //if~ end

		System.out.println(msg);

		msg = score >= 90 ? "합격" : "불합격";
	}// main() end

}// Ex1 end
