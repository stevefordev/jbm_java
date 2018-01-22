package scanner;

import java.util.Scanner;

public class ScannerEx2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("정수 2개 입력");

		/*
		 * 스캐너 객체가 가진 주요메서드
		 * 1) nextLine() : 문자열 한 줄을 얻어오는 메서드
		 * 2) netxInt() : int 형 정수 한 개를 얻어오는 메서드
		 * */

		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();

		System.out.println(String.format("정수1: %d /정수2: %d", num1, num2));

	}// main() end

}// ScannerEx2 end
