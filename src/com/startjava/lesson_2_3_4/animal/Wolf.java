package com.startjava.lesson_2_3_4.animal;

public class Wolf {
	private String gender = "мужской";
	private String nickName = "Старый";
	private double weight = 42.2;
	private int age = 14;
	private String color = "Серый";

	public void go() {
		System.out.println("Идёт");
	}

	public void sit() {
		System.out.println("Сидит");
	}

	public void run() {
		System.out.println("Бежит");
	}

	public void howl() {
		System.out.println("Воет");
	}

	public void hunt() {
		System.out.println("Охотится");
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age > 8) {
			System.out.println("Некорректный возраст");
		} else {
			this.age = age;
		}
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}