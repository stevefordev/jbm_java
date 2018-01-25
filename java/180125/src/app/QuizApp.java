package app;

import java.util.Scanner;

public class QuizApp {

	public static void main(String[] args) {

		System.out.println("===영화퀴즈===");

		System.out.println("쿠데타 발생 직후 최정예요원 '엄철우'(정우성)는 치명상을 입은 북한 1호와 함께 남한으로 내려온다.\r\n" + 
				"그 사이 북한은 대한민국과 미국을 상대로 선전포고를, 남한은 계엄령을 선포한다");

		System.out.println("다음 영화는??");

		Scanner scan = new Scanner(System.in);

		String name = scan.nextLine();

		if (name.equals("강철비")) {
			System.out.println("정답입니다");
		} else {
			System.out.println("오답입니다");
		}
	}

}
