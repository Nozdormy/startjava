package com.startjava.lesson_2_3_4.person;

public class Person {
	String gender = "мужской";
	String name = "Иван";
	int height = 155;
	double weight = 60.8;
	int age = 12;

	void go() {
		System.out.println(name + " Пошел");
	}

	void sit() {
		System.out.println(name + " Сел");
	}

	void run() {
		System.out.println(name + " Побежал");
	}

	void speak() {
		System.out.println("Меня зовут " + name);
	}

	void learnJava() {
		System.out.println(name + " Учит Java");
	}
}