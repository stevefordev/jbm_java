package example;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("점수를 입력하세요.");

		int a = scanner.nextInt();
		int b = scanner.nextInt();

		if (a > b) {
			System.out.println(String.format("%d > %d", a, b));
		} else {
			System.out.println(String.format("%d < %d", a, b));
		}
	}
}
