package string;

public class APIEx1 {

	public static void main(String[] args) {
		String s = "가나다라마바사";

		/*
		 * substring 은 문자열을 자르는 메서드
		 * substring(시작인덱스)
		 * - 시작인덱스부터 끝까지
		 * 
		 * substring(시작인덱스, 끝인덱스)
		 * - 시작인덱스부터 끝인덱스 -1 까지
		 * 
		 * String 메서드의 특징
		 * 원본 분자열은 훼손시키지 않고
		 * 리턴값으로 잘린 문자열을 얻어옴
		 * */
		s = s.substring(0, 3);
		System.out.println(s);
	}

}
