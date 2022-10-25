package com.startjava.lesson_1.finall;

import java.util.Scanner;

public class MyFirstGame {

	public static void main(String[] args) {
		System.out.println("Угадай число");
		Scanner scan = new Scanner(System.in);
		int randomNum = (int) (Math.random() * 100 + 1);
		int num;
		do {
			num = scan.nextInt();
			if (num < randomNum) {
				System.out.println("Число " + num + " меньше того, что загадал компьютер");
			} else if (num > randomNum) {
				System.out.println("Число " + num + " больше того, что загадал компьютер");
			}
		} while (num != randomNum);
		System.out.println("Вы победили!");
	}
}