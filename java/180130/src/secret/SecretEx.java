package secret;

//1) 생략가능
import java.lang.*;

//4) extends Object 생략 가능
public class SecretEx extends Object {

	//2) 기본 생성자 생략 가능
	public SecretEx() {
		//3) 부모 기본 생성자 호출 생략 가능
		super();
	}

	int a;
	static int b;

	void test() {
		//5) 인스턴스 멤버접근시 this.생략가능
		this.a = 10;

		//6) static멤버 접근시 SecretEx.생략가능
		SecretEx.b = 100;
	}

	public static void main(String[] args) {

		SecretEx e = new SecretEx();

	}
}
