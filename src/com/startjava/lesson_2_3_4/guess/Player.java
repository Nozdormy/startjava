package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {
    private String name;
    private int attempt;
    private int numWins = 0;
    private int[] enteredNums = new int[GuessNumber.ATTEMPTS];

    public Player(String name) {
        this.name = name;
    }

    public int getNumWins() {
        return numWins;
    }

    public void setNumWins() {
        numWins++;
    }

    public int[] getEnteredNums() {
        return Arrays.copyOf(enteredNums, attempt);
    }

    public int getAttempt() {
        return attempt;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return enteredNums[attempt - 1];
    }

    public boolean addNum(int number) {
        if (number < 0 || number >= 100) {
            System.out.println("Введите число от 1 до 100");
            return false;
        }
        enteredNums[attempt] = number;
        attempt++;
        return true;
    }

    public void clean() {
        Arrays.fill(enteredNums, 0, attempt, 0);
        attempt = 0;
    }
}