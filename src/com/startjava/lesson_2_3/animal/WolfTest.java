package com.startjava.lesson_2_3.animal;

public class WolfTest {

	public static void main(String[] args) {
		Wolf one = new Wolf();
		one.setGender("Женский");
		one.setNickName("Элла");
		one.setWeight(25.32);
		one.setAge(12);
		one.setColor("Зеленый");
		System.out.println("Пол " + one.getGender() + ", кличка " + one.getNickName() + ", вес " 
				+ one.getWeight() + ", возраст " + one.getAge() + ", цвет " + one.getColor());
		one.go();
		one.sit();
		one.run();
		one.howl();
		one.hunt();
	}
}