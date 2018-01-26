package array;

public class ArrayEx1 {

	public static void main(String[] args) {

		/*
		 * 배열은 같은 자료형 변수의 묶음
		 * 
		 * 배열도 객체자료형이다.
		 * 
		 * 배열의 선언
		 * 자료형[] 변수명;
		 * */

		//int 배열형의 선언
		int[] i;

		//int 배열객체의 생성
		i = new int[3];

		//배열번지에 접근
		i[1] = 5;

		System.out.println(i[0]);
		System.out.println(i[1]);
	}
}
