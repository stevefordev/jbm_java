package wrapper;

import java.util.Scanner;

public class WrapperEx {

	public static void main(String[] args) {

		Scanner scan;
		Integer i = new Integer(4);

		// valueOf 이용하면 내부적으로 암시적 객체생성
		Integer j = Integer.valueOf("4");
		Integer k = Integer.valueOf(4);
		Integer l = 4;

		System.out.println(j == k || k == l);
	}
}
