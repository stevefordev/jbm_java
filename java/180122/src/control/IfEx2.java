package control;

import java.util.Scanner;

public class IfEx2 {

	public static void main(String[] args) {

		/*
		 * if (조건식1) {
		 * 	조건식1 이 true 일때
		 * } else if (조건식2) {
		 * 	조건식1 false 이고 조건식2 가 true 일때
		 * } else {
		 * 	조건식이 전부 false 일때
		 * }
		 * */

		System.out.println("---학점 추출 프로그램 v0.99---");
		System.out.println("당신의 점수는?");

		Scanner scanner = new Scanner(System.in);

		// 점수를 입력받음(0~100까지의 수입력)
		// 

		int score = scanner.nextInt();
		char level = 'F';

		if (score >= 91) {
			level = 'A';
		} else if (score >= 81) {
			level = 'B';
		} else if (score >= 71) {
			level = 'C';
		} else if (score >= 61) {
			level = 'D';
		} else {
			
		}

		System.out.println(String.format("당신은 %s학점 입니다.", level));
	}// main() end

	
}
