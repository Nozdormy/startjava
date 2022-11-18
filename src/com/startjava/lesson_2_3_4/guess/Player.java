package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {
    private String name;
    private int attempt;
    private int[] numbersArray = new int[GuessNumber.attempts];

    public Player(String name) {
        this.name = name;
    }

    public int[] getNumbersArray() {
        return Arrays.copyOf(numbersArray, numbersArray.length);
    }

    public int getAttempt() {
        return attempt;
    }

    public void setAttempt(int attempt) {
        this.attempt = attempt;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return numbersArray[attempt - 1];
    }

    public void fillArray(int number) {
        numbersArray[attempt] = number;
    }

    public void clean() {
        Arrays.fill(numbersArray, 0, attempt, 0);
        attempt = 0;
    }
}