package string;

public class StringBuilderEx {

	public static void main(String[] args) {

		/*
		 * String객체는 편집이 불가능하다.
		 * */

		// 100 번까지는 String 이 빠름
		// 1.4 이후 부터는 컴파일러가 자동으로 바꿔줌
		String str = "H";
		str += "E";
		str += "L";
		str += "L";
		str += "O";
		System.out.println(str);

		//편집이 가능한 객체
		// StringBuffer : java 1.1부터 (동기화 처리 되어있음, 속도가 느림), 
		// - 멀티스레드 상황에서는 빠름
		// StringBuilder : java 1.5 부터 (동기화 처리 되어있지 않음, 속도가 빠름)
		// - 싱글 스레드 상황에서 빠름
		//StringBuffer sb;
		StringBuilder sb = new StringBuilder("H");
		sb.append("E");
		sb.append("L");
		sb.append("L");
		sb.append("O");

		System.out.println(sb.toString());
	}
}
