package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        GuessNumber game = new GuessNumber(createPlayer(3));
        String answer = "yes";
        do {
            if (answer.equals("yes")) {
                game.start();
            }
            System.out.println("Хотите продолжить игру?");
            answer = scan.nextLine();
        } while (!answer.equals("no"));
    }

    private static Player[] createPlayer(int totalPlayer) {
        Scanner scan = new Scanner(System.in);
        Player[] players = new Player[totalPlayer];
        for (int i = 1; i <= totalPlayer; i++) {
            System.out.println("Введите имя " + i + " игрока");
            players[i - 1] = new Player(scan.nextLine());
        }
        return players;
    }
}