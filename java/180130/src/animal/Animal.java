package animal;

/*
 * 추상클래스 : abstract
 * 
 * 추상클래스는 일반클래스와 똑같음
 * (생성자도 있고, 멤버필드도 있고, 메서드도 있고)
 * 
 * new Animal() : 객체를 생성할 수 없음.
 * 
 * ************* 단 한개라도 추상 메서드를 가지고 있다면
 * 클래스는 추상 클래스로 선언 해야만 한다 ******************
 * */
public abstract class Animal {

	public String type;
	public int age, height, weight;

	public Animal() {

	}

	/*
	public void cry() {
		System.out.println("???????????????");
	}
	*/
	// 추상 메서드란 body(본체)가 없음
	public abstract void cry();
}
