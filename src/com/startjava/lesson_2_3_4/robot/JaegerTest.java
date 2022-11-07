package com.startjava.lesson_2_3_4.robot;

public class JaegerTest {

	public static void main(String[] args) {
		Jaeger strikerEureka = new Jaeger();
		strikerEureka.setModelName("Striker Eureka");
		strikerEureka.setMark("Mark-5");
		strikerEureka.setOrigin("Australia");
		strikerEureka.setHeight(76.2f);
		strikerEureka.setWeight(1850);
		strikerEureka.setStrength(10);
		strikerEureka.setArmor(9);

		System.out.println("Model - " + strikerEureka.getModelName() + "\nMark - " + strikerEureka.getMark()
				+ "\nOrigin - " + strikerEureka.getOrigin() + "\nHeight - " + strikerEureka.getHeight() 
				+ "\nWeight - " + strikerEureka.getWeight() + "\nStrength - " + strikerEureka.getStrength() 
				+ "\nArmor - " + strikerEureka.getArmor());
		strikerEureka.move(strikerEureka.getModelName());

		Jaeger chernoAlpha = new Jaeger("Cherno Alpha", "Mark-1", "Russia", 85.34f, 2412, 10, 10);
		System.out.println("Your " + strikerEureka.getModelName() + strikerEureka.scanKaiju()
				+ " the enemy and transmitting the data: " + chernoAlpha);
		System.out.println(chernoAlpha.getModelName() + " use the Vortex Cannon ");
		chernoAlpha.useVortexCannon();
		if (chernoAlpha.getStrength() <= strikerEureka.getArmor()) {
			System.out.println("Nothing happens");
		} else {
			System.out.println(strikerEureka.getModelName() + " falling");
		}
	}
}