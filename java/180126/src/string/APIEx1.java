package string;

public class APIEx1 {

	public static void main(String[] args) {

		/*
		 * String의 주요 API
		 * 
		 * 1) charAt 메서드 
		 * 	- 인자 : int형(인덱스)
		 * 	- 리턴 자료형 : char 형
		 * 	- 의미 : 인자로 넣은 인덱스에 해당하는 
		 * 		char 형 글자 하나를 리턴해주는 메서드
		 * */

		String s = "안녕? 자바야?";
		char c = s.charAt(1);
		System.out.println(c);

		/*
		 * 2) indexOf 메서드
		 *	- 인자(String, char)
		 *	- 리턴 자료형 : int
		 *	- 인자의 글자가 몇번째 인덱스인지
		 * */

		int index = s.indexOf(' ');
		System.out.println(index);
	}
}
