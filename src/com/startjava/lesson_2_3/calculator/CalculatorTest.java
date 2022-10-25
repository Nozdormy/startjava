package com.startjava.lesson_2_3.calculator;

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
		
		System.out.print("Введите первое число: ");
		// Считываю первое число с консоли и записывает его в num1
		calculator.setNum1(scan.nextInt());
		
		System.out.print("Введите знак математической операции: ");
		// Считываю знак математической операции и записывает его в sign
		calculator.setSign(scan.next().charAt(0));
		
		System.out.print("Введите второе число: ");
		// Считываю второе число с консоли и записывает его в num2
		calculator.setNum2(scan.nextInt());
		/* Вызываю метод который принимает 2 значения из консоли и производит вычисления 
		 * в зависимости от знака мат. операции
		 */
		calculator.calculate();
	}
}