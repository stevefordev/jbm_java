package animal;

public class Snake extends Animal {

	/*
	 * 추상메서드를 상속받으면 무조건
	 * 해당 메서드 구현 해야 합니다.
	 * */
	@Override
	public void cry() {
		System.out.println("hiss~~~~");
	}
}
