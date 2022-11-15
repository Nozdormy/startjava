package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String answer = "yes";
        do {
            if (answer.equals("yes")) {
                calculate();
            }
            System.out.println("Хотите продолжить вычисления? Введите yes/no");
            answer = scan.nextLine();
        } while (!answer.equals("no"));
    }

    private static void calculate() {
        Scanner scan = new Scanner(System.in);
        try {
            System.out.print("Введите математическое выражение: ");
            Calculator.mathExpression(scan.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Введите корректные значения");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Введите корректные значения");
        } catch (ArithmeticException e) {
            System.out.println("На 0 нельзя делить");
        }
    }
}