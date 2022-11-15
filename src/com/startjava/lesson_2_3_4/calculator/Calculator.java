package com.startjava.lesson_2_3_4.calculator;

public class Calculator {

    public static void mathExpression(String str) {
        String[] expression = str.split(" ");
        int num1 = Integer.parseInt(expression[0]);
        char sign = expression[1].charAt(0);
        int num2 = Integer.parseInt(expression[2]);
        if (num1 >= 0 && num2 >= 0) {
            switch (sign) {
                case '+' -> System.out.println(Math.addExact(num1, num2));
                case '-' -> System.out.println(Math.subtractExact(num1, num2));
                case '*' -> System.out.println(Math.multiplyExact(num1, num2));
                case '/' -> System.out.println(Math.floorDiv(num1, num2));
                case '%' -> System.out.println(Math.floorMod(num1, num2));
                case '^' -> System.out.println((int) Math.pow(num1, num2));
                default -> System.out.println("Неверный символ математической операции");
            }
        } else {
            System.out.println("Введите положительные числа");
        }
    }
}