package ex;

public class Ex1 {

	public static void test(String str) {
		System.out.println(str);
	}

	public static void main(String[] args) {

		StringBuilder sb = new StringBuilder("안녕");
		sb.append("하세요");
		test(sb.toString());

		int[] iArr = { 2, 4, 6 };
		iArr[2] = 5;

		for (int i = 0; i < iArr.length; i++) {
			System.out.println(iArr[i]);
		}
	}
}
