package ex;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {

		System.out.println("시작수를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int startNumber = scan.nextInt();

		System.out.println("끝수를 입력하세요(시작수 보다 크게)");
		int endNumber = scan.nextInt();

		for (int i = startNumber; i < endNumber + 1; i++) {
			System.out.print(i + "\t");
		}
	}
}
