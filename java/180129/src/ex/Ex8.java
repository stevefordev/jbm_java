package ex;

public class Ex8 {
	public static void main(String[] args) {
		Integer i1 = new Integer("5");
		Integer i2 = 5;
		Integer i3 = new Integer(5);
		Integer i4 = 5;

		System.out.println((i1 == i2));
		System.out.println((i2 == i4));
		System.out.println((i1 == i3));
		System.out.println(i2.equals(i4));
		System.out.println(i3.equals(i1));
	}
}
