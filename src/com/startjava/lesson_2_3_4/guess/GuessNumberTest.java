package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Player[] players = new Player[3];
        for (int i = 1; i <= players.length; i++) {
            System.out.println("Введите имя " + i + " игрока");
            players[i - 1] = new Player(scan.nextLine());
        }
        GuessNumber game = new GuessNumber(players);
        String answer = "yes";
        do {
            if (answer.equals("yes")) {
                game.start();
            }
            System.out.println("Хотите продолжить игру?");
            answer = scan.nextLine();
        } while (!answer.equals("no"));
    }
}