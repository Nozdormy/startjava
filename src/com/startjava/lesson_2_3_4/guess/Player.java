package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {
    private String name;
    private int attempt;
    private int[] enteredNums = new int[GuessNumber.ATTEMPTS];

    public Player(String name) {
        this.name = name;
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

    public void addNum(int number) {
        enteredNums[attempt] = number;
        attempt++;
    }

    public void clean() {
        Arrays.fill(enteredNums, 0, attempt, 0);
        attempt = 0;
    }
}