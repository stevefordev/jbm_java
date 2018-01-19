package scanner;

import java.util.Scanner;

public class ScannerEx1 {

	public static void main(String[] args) {

		int i = 100;
		long l = 100;

		// 자동 형변환
		l = i;

		System.out.println(l);
		System.out.println(i);

		// 강제 형변환
		i = (int) l;

		System.out.println(l);
		System.out.println(i);

		/*
		 * 우리가 콘솔에 입력하는 데이터(문자열)을 스캐닝하는 방법
		 * 
		 * Scanner 객체를 이용
		 * */

		Scanner scanner = new Scanner(System.in);

		// 유저에게 메세지를 출력

		System.out.println("당신의 이름은??");

		// 유저에게 문자열을 입력받아서
		// 변수 name 에 대입
		String name = scanner.nextLine();

		System.out.println("당신의 이름은:" + name);

	}
}
