package oop;

public class Atest {

	public static void main(String[] args) {

		int c = 7;
		AA a = new AA();
		a.b = c;

		BB b = new BB();
		b.c = a.b;
		c = 10;
		AA d = new AA();
		a = d;
		a.a = a;

		a.a.a.a.a.a.a.a.a.a.a.a.a.a.a.b = 10;

		System.out.println(a.b);
		
		b.b = new BB();

		try {
			b.b.b.b.b.b = b;
		} catch (Exception e) {
			System.out.println("error");
			System.out.println(e.getMessage());
		}

	}// main() end

}

class AA {
	AA a;
	int b;
}

class BB {
	AA a;
	BB b;
	int c;
}
