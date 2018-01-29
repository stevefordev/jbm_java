package array;

public class ArrayEx3 {

	public static void main(String[] args) {
		int[] iArr = { 3, 6, 7, 9, 50 };

		//일반 for문
		for (int i = 0; i < iArr.length; i++) {
			System.out.println(iArr[i]);
		}
		System.out.println("");

		//for Each 문(향상된 for문) JAVA5 버전에 추가됨
		// for(각번지의 자료형 : 배열(혹은 컬렉션))
		for (int i : iArr) {
			System.out.println(i);
		}
	}
}
