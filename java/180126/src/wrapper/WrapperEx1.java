package wrapper;

public class WrapperEx1 {

	public static void main(String[] args) {

		/*
		 * 랩퍼(Wrapper) 클래스들
		 * 
		 * 기본자료형 -> 객체자료형으로
		 * 
		 * 1) 기본자료형을 객체자료형처럼 사용하려고
		 * 2) 그 자료형에 필요한 상수나 메서드를 가지고 있음
		 * 
		 * Boolean, Character, Byte, Short, Integer, Long, 
		 * Float, Double
		 * 
		 * 생성자 : 해당자료형, or String
		 * */

		Boolean b = new Boolean("true");
		Boolean c = new Boolean(true);
		System.out.println(b);

		System.out.println(b == c);
		System.out.println(b.equals(c));

		Integer i = new Integer("3");

		System.err.println(Integer.MAX_VALUE);
		System.err.println(Long.MAX_VALUE);

		/*
		 * String 을 int 형으로 변경
		 * */

		int in = Integer.parseInt("4345");
		System.out.println(in);
	}
}
