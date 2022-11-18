package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumber {
    Scanner scan = new Scanner(System.in);
    private Player player1;
    private Player player2;
    public static int attempts = 10;
    private int randomNum;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        randomNum = (int) (Math.random() * 100 + 1);
        System.out.println("Угадай число");
        System.out.println("У каждого игрока по " + attempts + " попыток");
        do {
            inputNum(player1);
            if (compareNumbers(player1)) {
                break;
            }
            inputNum(player2);
            if (compareNumbers(player2)) {
                break;
            }
        } while (player2.getAttempt() < attempts);
        show(player1);
        show(player2);
        player1.clean();
        player2.clean();
    }

    private void inputNum(Player player) {
        System.out.println(player.getName() + " введите число");
        player.fillArray(scan.nextInt());
        player.setAttempt(player.getAttempt() + 1);
        if (player.getAttempt() == attempts) {
            System.out.println("У " + player.getName() + " закончились попытки");
        }
    }

    private boolean compareNumbers(Player player) {
        if (player.getNumber() == randomNum) {
            System.out.println("Игрок " + player.getName() + " угадал число " + randomNum + " с " + player.getAttempt()
                    + " попытки");
            return true;
        }
        if (player.getNumber() < randomNum) {
            System.out.println("Число " + player.getNumber() + " меньше того, что загадал компьютер");
        } else {
            System.out.println("Число " + player.getNumber() + " больше того, что загадал компьютер");
        }
        return false;
    }

    private void show(Player player) {
        System.out.print("Числа введенные игроком " + player.getName() + " - ");
        for (int num : player.getNumbersArray()) {
            if (num != 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }
}