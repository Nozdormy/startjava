package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumber {
    Scanner scan = new Scanner(System.in);
    private Player[] players;
    public static final int ATTEMPTS = 10;
    public static final int ROUNDS = 3;
    private int randomNum;

    public GuessNumber(Player... players) {
        this.players = players;
    }

    public void start() {
        castLots();
        for (int i = 1; i <= ROUNDS; i++) {
            randomNum = (int) (Math.random() * 100 + 1);
            System.out.println("\nРаунд - " + i);
            System.out.println("У каждого игрока по " + ATTEMPTS + " попыток" + randomNum);
            boolean winner = false;
            boolean attempt = true;
            while (!winner && attempt) {
                for (Player player : players) {
                    inputNum(player);
                    if (compareNumbers(player)) {
                        player.setNumWins();
                        winner = true;
                        break;
                    }
                    if (player.getAttempt() == ATTEMPTS) {
                        System.out.println("У " + player.getName() + " закончились попытки");
                        attempt = false;
                    }
                }
            }
            if (!attempt) {
                System.out.println("Никто не угадал число");
            }
            for (Player player : players) {
                printEnteredNums(player);
                player.clean();
            }
        }
        printNameWinner();
    }

    private void inputNum(Player player) {
        do {
            System.out.println(player.getName() + " введите число");
        } while (!player.addNum(scan.nextInt()));
    }

    private boolean compareNumbers(Player player) {
        if (player.getNumber() == randomNum) {
            System.out.println("Игрок " + player.getName() + " угадал число " + randomNum + " с "
                    + player.getAttempt() + " попытки");
            return true;
        }
        System.out.println("Число " + player.getNumber()
                + (randomNum < player.getNumber() ? " больше" : " меньше")
                + " того, что загадал компьютер");
        return false;
    }

    private void printEnteredNums(Player player) {
        System.out.print("Числа введенные игроком " + player.getName() + " - ");
        for (int num : player.getEnteredNums()) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    private void castLots() {
        System.out.println("Угадай число");
        for (int i = players.length - 1; i > 0; i--) {
            randomNum = (int) (Math.random() * i);
            Player temp = players[randomNum];
            players[randomNum] = players[i];
            players[i] = temp;
        }
        int i = 1;
        for (Player player : players) {
            System.out.println(i++ + "-ой игрок - " + player.getName());
        }
    }

    private void printNameWinner() {
        for (Player player : players) {
            if (player.getNumWins() >= 2) {
                System.out.println(player.getName() + " - победил");
                return;
            }
        }
        System.out.println("Ничья");
    }
}