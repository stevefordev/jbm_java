package ex;

/*
 * 직접 입력한 상속이 없다면 Object 상속이 생략 되어있다*/
public class ExA extends Object {

	int a = 5;

	public ExA() {
		super(); // 부모의 기본 생성자를 호출 // 생략 가능
	}
}
