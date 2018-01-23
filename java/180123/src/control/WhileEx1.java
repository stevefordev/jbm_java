package control;

import java.util.Iterator;

public class WhileEx1 {

	public static void main(String[] args) {

		/*
		 * 반복문 : for, while 문
		 * 
		 * while (조건식) {
		 * 		반복구문
		 * }
		 * 
		 * for (초기식; 조건식; 증감식) {
		 * 		반복구문
		 * }
		 * */

		for (int i = 1; i < 6; i++) {
			System.out.println(i);
		} // for end

		System.out.println("-----");

		int i = 1;

		while (i < 6) {
			System.out.println(i);
			i++;
		}

	}// main() end

}
