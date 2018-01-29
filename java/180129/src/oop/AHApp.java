package oop;

import animal.*;

public class AHApp {

	public static void main(String[] args) {

		Animal[] rooms = new Animal[3];

		rooms[0] = new Cat();
		rooms[1] = new Dog();
		rooms[2] = new Lion();

		for (Animal animal : rooms) {
			animal.cry();
		}
	}
}
