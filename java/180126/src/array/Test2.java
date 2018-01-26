package array;

public class Test2 {

	public static void main(String[] args) {
		String[] str = new String[3];
		str[0] = "Love";
		String s = "Love";
		str[2] = s;
		str[0] = str[1].substring(0, 1);

		for (String i : str) {
			System.out.println(i);
		}
	}

}
