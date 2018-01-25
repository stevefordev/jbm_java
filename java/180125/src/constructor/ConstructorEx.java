package constructor;

import vo.Actor;

public class ConstructorEx {

	public static void main(String[] args) {

		/*
		 * Actor 클래스를 가지고 만들어진 객체의 레퍼런스를
		 * 담을 수 있는 객체자료형 지역변수
		 * a1을 선언하고
		 * new 라는 키워드를 통해서 heap 메모리의 영역을 할당받고
		 * Actor 클래스의 기본 생성자를 호출하여
		 * 객체를 생성후 그 레퍼런스를 a1에 대입
		 * */
		Actor a1 = new Actor();
		a1.setName("차승원");
		a1.setHeight(188);
		a1.setWeight(80);

		System.out.println("이름:" + a1.getName());
		System.out.println("키:" + a1.getHeight());
		System.out.println("몸무게:" + a1.getWeight());

		System.out.println("----------------------------------");

		Actor a2 = new Actor();
		a2.setName("이나영");
		a2.setHeight(172);
		a2.setWeight(48);

		System.out.println("이름:" + a2.getName());
		System.out.println("키:" + a2.getHeight());
		System.out.println("몸무게:" + a2.getWeight());

		Actor a3 = new Actor("차승원", 188, 80);
	}
}
