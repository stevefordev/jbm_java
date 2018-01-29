package ex;

public class Ex4 {
	public static void main(String[] args) {
		String[] sArr = new String[4];
		sArr[0] = "TEST";
		sArr[1] = "test";

		for (String s : sArr) {
			System.out.println(s);
		}

		Integer[] iArr = new Integer[4];

		iArr[0] = 3;
		iArr[2] = 5;

		for (Integer i : iArr) {
			System.out.println(i);
		}
	}
}
