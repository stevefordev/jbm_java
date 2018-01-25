package ex;

public class ConTest {

	ConTest() {
		this(3);
	}

	void ConTest(int a) {
		System.out.println("A");
	}

	ConTest(char c) {
		this("");
		System.out.println("B");
	}

	private ConTest(int a) {
		this('a');
		System.out.println("C");
	}

	private ConTest(String str) {
		System.out.println("D");
	}

	public static void main(String[] args) {
		ConTest con1 = new ConTest("ConTest");
		ConTest con2 = new ConTest();

		//D,D,B,C
	}

}
