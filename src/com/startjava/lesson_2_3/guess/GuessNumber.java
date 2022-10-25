package com.startjava.lesson_2_3.guess;

import java.util.Scanner;

public class GuessNumber {
	Scanner scan = new Scanner(System.in);
	private Player player1;
	private Player player2;

	public GuessNumber(Player player1, Player player2) {
		this.player1 = player1;
		this.player2 = player2;
	}

	public void start() {
		int randomNum = (int) (Math.random() * 100 + 1);
		System.out.println("Угадай число");
		do {
			System.out.println(player1.getName() + " введите число");
			player1.setNumber(scan.nextInt());
			if (player1.getNumber() == randomNum) {
				System.out.println(player1.getName() + " вы выиграли");
				break;
			}
			if (player1.getNumber() < randomNum) {
				System.out.println("Число " + player1.getNumber() + " меньше того, что загадал компьютер");
			} else {
				System.out.println("Число " + player1.getNumber() + " больше того, что загадал компьютер");
			}

			System.out.println(player2.getName() + " введите число");
			player2.setNumber(scan.nextInt());
			if (player2.getNumber() == randomNum) {
				System.out.println(player2.getName() + " вы выиграли");
				break;
			}
			if (player2.getNumber() < randomNum) {
				System.out.println("Число " + player2.getNumber() + " меньше того, что загадал компьютер");
			} else {
				System.out.println("Число " + player2.getNumber() + " больше того, что загадал компьютер");
			}
		} while (true);
	}
}