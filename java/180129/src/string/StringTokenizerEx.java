package string;

import java.util.StringTokenizer;

public class StringTokenizerEx {

	public static void main(String[] args) {

		String twice = "쯔위,사나,미나,,나연";
		StringTokenizer s = new StringTokenizer(twice, ",");

		/*
		 * 문자열을 쪼갤때
		 * 1) String 의 split() 메서드 이용
		 * 2) StringTokenizer 객체 이용
		 * 
		 * */

		String[] members = twice.split(",");

		for (String member : members) {
			System.out.println(member);
		}

		System.out.println("");
		/*
		 * StringTokenizer 클래스
		 * ' ' (default)
		 * */
		StringTokenizer stok = new StringTokenizer(twice, ",");

		while (stok.hasMoreTokens()) {
			System.out.println(stok.nextToken());

		}

	}//main() end
}//StringTokenizerEx End
