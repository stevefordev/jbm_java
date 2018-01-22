package control;

import java.util.Scanner;

public class IfEx1 {

	public static void main(String[] args) {

		/*
		 * if(조건식) {
		 * 	조건식이 true 일때
		 * } else {
		 * 	조건식이 false 일때
		 * }
		 * 
		 * */
		System.out.println("당신의 나이는?");

		Scanner scanner = new Scanner(System.in);
		int age = scanner.nextInt();

		String result = "";
		if (age >= 20) {
			result = "입";
		} else {
			result = "이 아닙";
		}

		System.out.println("당신은 성인" + result + "니다.");
	}// main() end

}// IfEx1
