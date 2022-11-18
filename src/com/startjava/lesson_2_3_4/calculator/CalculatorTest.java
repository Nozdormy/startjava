package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String answer = "yes";
        do {
            if (answer.equals("yes")) {
                launchСalculate();
            }
            System.out.println("Хотите продолжить вычисления? Введите yes/no");
            answer = scan.nextLine();
        } while (!answer.equals("no"));
    }

    private static void launchСalculate() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите математическое выражение: ");
        try {
            System.out.println(Calculator.calculate(scan.nextLine()));
        } catch (NumberFormatException e) {
            System.out.println("Введите корректные значения");
        } catch (ArithmeticException e) {
            System.out.println("На 0 нельзя делить");
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }
    }
}