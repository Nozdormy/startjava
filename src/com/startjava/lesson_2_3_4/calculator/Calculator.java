package com.startjava.lesson_2_3_4.calculator;

public class Calculator {

    public static int calculate(String expression) {
        String[] partsExpression = expression.split(" ");
        int num1 = Integer.parseInt(partsExpression[0]);
        char sign = partsExpression[1].charAt(0);
        int num2 = Integer.parseInt(partsExpression[2]);
        if (num1 < 1 || num2 < 1) {
            throw new IllegalStateException("Введите положительные числа");
        }
        return switch (sign) {
            case '+' -> Math.addExact(num1, num2);
            case '-' -> Math.subtractExact(num1, num2);
            case '*' -> Math.multiplyExact(num1, num2);
            case '/' -> Math.floorDiv(num1, num2);
            case '%' -> Math.floorMod(num1, num2);
            case '^' -> (int) Math.pow(num1, num2);
            default -> throw new IllegalStateException("Неверный символ математической операции");
        };
    }
}