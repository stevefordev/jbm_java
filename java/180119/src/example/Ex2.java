package example;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("점수를 입력하세요.");
		
		String score = scanner.nextLine();
		
		if (Integer.parseInt(score) < 90) {
			System.out.println("불합격");
		} else {
			System.out.println("합격");
		}
	}
}
