package string;

public class EqualEx {

	public static void main(String[] args) {

		EqualEx e1 = new EqualEx();
		EqualEx e2 = new EqualEx();

		//객체를 출력한다는 것은 객체를 String 으로 바꾼다는 것이고
		//그래서 toString() 메서드를 호출합니다.
		System.out.println(e1);

		//toString()메서드
		//패키지명.클래스명@해쉬코드 16진수
		System.out.println(e1.toString());
		System.out.println(e2);
		System.out.println(e1 == e2);
		System.out.println(e1.equals(e2));

		String s1 = new String("LOVE");
		String s2 = new String("LOVE");

		System.out.println(s1.equals(s2));

		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());

		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));

	}
}
