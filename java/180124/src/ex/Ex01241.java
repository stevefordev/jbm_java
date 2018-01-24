package ex;

public class Ex01241 {
	int a;
	Ex01241 b;
	
	void test(Ex01241 a) {
		b = a;
	}
	void test2(int a) {
		a = a;
	}
	
	public static void main(String[] args) {
		Ex01241 a = new Ex01241();
		a.b = new Ex01241();
		Ex01241 b = a.b;
		a.test(new Ex01241());
		b.test(a);
		a.a = 10;
		b.a = 5;
		a.test2(4);
		b.test2(7);
		
		System.out.println(a.a);
		System.out.println(b.a);
		System.out.println(a.b.a);
		System.out.println(b.b.a);
		
	}
}
