package oop;

import ex.*;

public class ExApp {

	public static void main(String[] args) {

		ExA a = new ExA();
		ExB b = new ExB();

		a = b;

		Object o = a;
		a = (ExA)o;
		//b = a;
	}
}
