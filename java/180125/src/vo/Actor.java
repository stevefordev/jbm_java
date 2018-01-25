package vo;

public class Actor {

	private String name;
	private int height, weight;

	/*
	 * 접근제한자 클래스명(인자...) {
	 * 
	 * }
	 * 
	 * 기본 생성자 (리턴 자료형 자체가  없다. - void도 아님)
	 * - 클래스명고 반드시 같아야 한다.
	 * - 생성자는 멤버필드의 **초기화**때문에 사용
	 * - 개발자가 생성자를 하나라도 만들었으면
	 * 	컴파일러가 기본 생성자를 만들지 않으므로 
	 *  생성자를 만드려고 할 경우 기본 생성자는 반드시 존재 해야한다.
	 * */

	public Actor() {

	}

	public Actor(String name, int height, int weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

}
