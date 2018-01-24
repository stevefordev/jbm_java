package ex;

import access.Z;

public class StaticEx {

	//접근 제한자가 default 인 기본자료형 int형인 인스턴스 멤버 필드 a
	int a;

	static int b;

	public static void main(String[] args) {

		StaticEx ex = new StaticEx();
		ex.a = 10;

		StaticEx.b = 11;
		System.out.println(ex.toString());

		System.out.println(StaticEx.b);

		ex.test();

		System.out.println(Z.z);

		Z.z = 10;

		Z z = new Z();
		System.out.println(z.z);

	}//main() end

	public void test() {

		System.out.println(StaticEx.b);
	}
}
