package oop;

import javax.management.monitor.Monitor;

import animal.Cat;
import animal.Dog;
import animal.Lion;
import animal.Monkey;

public class AnimalApp {

	public static void main(String[] args) {

		Dog d = new Dog();
		d.name = "프로도";
		d.age = 10;
		d.height = 100;
		d.weight = 50;

		Cat c = new Cat();
		c.name = "야옹이";
		c.age = 11;
		c.height = 100;
		c.weight = 60;

		Lion l = new Lion();
		l.name = "사짜";
		l.age = 12;
		l.height = 1100;
		l.weight = 90;

		Monkey m = new Monkey();
		m.name = "몬키";
		m.age = 5;
		m.height = 500;
		m.weight = 100;

		System.out.println(m.toString());

	}
}
