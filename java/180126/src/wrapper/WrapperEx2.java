package wrapper;

public class WrapperEx2 {

	public static void main(String[] args) {

		/*
		 *
		 * 		Integer j = 4;//오토박싱 (암시적 객체 생성)
		 * 		int i = j;//언박싱
		 * */

		Integer i = new Integer(3);
		Integer i2 = new Integer("3");

		Integer i3 = 3;
		Integer i4 = 3;
		Integer i5 = 4;
		int a = i;

	}
};