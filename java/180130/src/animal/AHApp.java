package animal;

public class AHApp {

	public static void main(String[] args) {

		Animal[] animals = new Animal[5];

		animals[0] = new Cat();
		animals[1] = new Bear();
		animals[2] = new Dog();
		animals[3] = new Giraffe();
		animals[4] = new Giraffe();

		for (Animal animal : animals) {
			animal.cry();
		}

		/*
		 * Animal 클래스가 추상 클래스이므로 new Animal() 객체를 생성할 수 없음
		 * Animal a = new Animal();
		 * */
	}
}
