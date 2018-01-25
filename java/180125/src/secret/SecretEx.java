package secret;

//1. java.lang.*; 생략 가능

public class SecretEx {

	//2) 기본 생성자 생략 가능
	public SecretEx() {

	}

	static int a;
	int b;

	void test() {
		//3. SecretEx. 생략가능
		SecretEx.a = 10;
		
		// this 를 생략 가능
		// (같은 지역내에 같은 변수 명이 없다면)
		this.b = 10;
	}

	public static void main(String[] args) {

	}
}
