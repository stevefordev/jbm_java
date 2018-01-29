package oop;

class ExA {
	int a = 3;
}

class ExB extends ExA {
	int a = 5;
	int b = 10;
}

class ExC extends ExA {
	int a = 7;
	int c = 20;
}

public class ExApp2 {
	public static void main(String[] args) {
		ExA a = new ExA();
		ExB b = new ExB();
		ExC c = new ExC();
		//b = c;
		Object o = a;
		//c = a;
		//b = a;

	}
}
