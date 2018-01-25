package ex;

public class Homework2 {

	private String str;

	public Homework2() {
		this("Chupa Chups!");
		System.out.println("★");
	}

	private Homework2(String str) {
		this.str = str;
		System.out.println("●");
	}

	private void test(String str) {
		str = "Hello World!";
	}

	public static void main(String[] args) {
		Homework2 ho = new Homework2();
		ho.test(ho.str);

		String str = ho.str.substring(2, 3);

		System.out.println(str);
		System.out.println(ho.str);

	}
}
