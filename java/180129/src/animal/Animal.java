package animal;

public class Animal {

	/*
	 * 상속이란 부모의 클래스가 가진
	 * 멤버를 자식클래스가 가지는 것
	 * 
	 * 부모클래스 = 슈퍼클래스
	 * 자식클래스 = 서브클래스
	 * 
	 * 자식들이 가진 공통적인 속성(필드, 메서드)을 
	 * 부모에 선언하고(추상화) 자식들은 상속을 받음
	 * 
	 * 상속의 키워드는 extends
	 * */

	public String name;
	public int age, height, weight;

	public void cry() {
		System.out.println("animal");
	}
	public String toString() {
		String msg = String.format("이름:%s, 나이:%d, 키:%d, 무게:%d", name, age, height, weight);
		return msg;
	}

}
