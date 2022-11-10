package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String answer = "yes";
		do {
			if (answer.equals("yes")) {
				start();
			}
			System.out.println("Хотите продолжить вычисления?");
			answer = scan.nextLine();
		} while (!answer.equals("no"));
	}

	private static void start() {
		Scanner scan = new Scanner(System.in);
		Calculator calculator = new Calculator();
		System.out.print("Введите математическое выражение: ");
		String str = scan.nextLine();
		String[] words = str.split(" ");
		calculator.setNum1(Integer.parseInt(words[0]));
		calculator.setSign(words[1].charAt(0));
		calculator.setNum2(Integer.parseInt(words[2]));
		System.out.println(calculator.calculate());
	}
}