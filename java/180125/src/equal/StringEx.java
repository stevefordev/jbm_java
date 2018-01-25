package equal;

public class StringEx {
	public static void main(String[] args) {

		//명시적 객체생성
		String s = new String("A");

		//암시적 객체 생성
		String s1 = "A";
		String s2 = "A";

		System.out.println(s == s1);
		System.out.println(s1.equals(s2));
		System.out.println(s1 == s2);
		System.out.println(s1 == "A");
		
		System.out.println("LOVE" == "LOVE");
		System.out.println("LOVE" == "Love");
		System.out.println("LOVE".equals("Love"));
		
	}
}
