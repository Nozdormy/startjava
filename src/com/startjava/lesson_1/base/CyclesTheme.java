package com.startjava.lesson_1.base;

public class CyclesTheme {

	public static void main(String[] args) {
		System.out.println("1. Подсчет суммы четных и нечетных чисел");
		int counter = -10;
		int sumEven = 0;
		int sumOdd = 0;
		do {
			if (counter % 2 == 0) {
				sumEven += counter;
			} else {
				sumOdd += counter;
			}
			counter++;
		} while (counter <= 21);
		System.out.println("В промежутке [-10, 21] сумма четных чисел = " + sumEven 
				+ ", а нечетных = " + sumOdd + "\n");

		System.out.println("2. Вывод чисел в интервале (min и max) в порядке убывания");
		int num1 = 10;
		int num2 = 5;
		int num3 = -1;
		int max = num1;
		int min = num1;
		if (num2 > max) {
			max = num2;
		}
		if (num3 > max) {
			max = num3;
		}
		if (num2 < min) {
			min = num2;
		}
		if (num3 < min) {
			min = num3;
		}
		while (--max > min) {
			System.out.print(max + " ");
		}

		System.out.println("\n\n3. Вывод реверсивного числа и суммы его цифр");
		int num4 = 1234;
		int sumDigits = 0;
		while (num4 > 0) {
			int digit = num4 % 10;
			num4 /= 10;
			System.out.print(digit);
			sumDigits += digit;
		}
		System.out.println(" - Исходное число в обратном порядке" + "\n" + sumDigits + " - Сумма его цифр\n");

		System.out.print("4. Вывод чисел на консоль в несколько строк");
		int countElements = 0;
		for (int i = 1; i < 24; i += 2) {
			if (countElements % 5 == 0) {
				System.out.println();
			}
			System.out.printf("%3d", i);
			countElements++;
		}
		for (; countElements % 5 != 0;) {
			System.out.printf("%3d", 0);
			countElements++;
		}

		System.out.println("\n\n5. Проверка количества единиц на четность");
		int num5 = 3_141_591;
		System.out.print("Число " + num5);
		int countOnes = 0;
		while (num5 > 0) {
			int digit = num5 % 10;
			if (digit == 1) {
				countOnes++;
			}
			num5 /= 10;
		}
		if (countOnes % 2 == 0) {
			System.out.println(" содержит " + countOnes + " четное количество единиц\n");
		} else {
			System.out.println(" содержит " + countOnes + " нечетное количество единиц\n");
		}

		System.out.println("6. Отображение фигур в консоли");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		int row = 5;
		countElements = 5;
		while (row > 0) {
			System.out.println();
			int i = countElements;
			while (i > 0) {
				System.out.print("#");
				i--;
			}
			countElements--;
			row--;
		}
		System.out.println("\n");

		row = 0;
		countElements = 0;
		do {
			int i = 0;
			do {
				System.out.print("$");
			} while (++i <= row);
			if (++countElements <= 2) {
				row++;
			} else {
				row--;
			}
			System.out.println();
		} while (row >= 0);

		System.out.println("\n7. Отображение ASCII-символов");
		System.out.printf("%2s%10s", "Dec", "Char");
		for (int i = 0; i < 48; i++) {
			if (i % 2 == 1) {
				System.out.printf("\n%2d%10c", i, (char) i);
			}
		}
		for (int i = 97; i < 122; i++) {
			if (i % 2 == 0) {
				System.out.printf("\n%3d%9c", i, (char) i);
			}
		}

		System.out.println("\n\n8. Проверка, является ли число палиндромом");
		num1 = 1_234_321;
		int num1Copy = num1;
		int reverseNum = 0;
		while (num1Copy > 0) {
			reverseNum = reverseNum * 10 + num1Copy % 10;
			num1Copy /= 10;
		}
		if (reverseNum == num1) {
			System.out.println("Число " + num1 + " является палиндромом\n");
		} else {
			System.out.println("Число " + num1 + " не является палиндромом\n");
		}

		System.out.println("9. Определение, является ли число счастливым");
		int luckyNum = 999_999;
		int sum1 = 0;
		int sum2 = 0;
		while (luckyNum > 0) {
			if (luckyNum / 1000 != 0) {
				sum1 += luckyNum % 10;
			} else {
				sum2 += luckyNum % 10;
			}
			luckyNum /= 10;
		}
		System.out.println("Сумма первых трёх цифр = " + sum2);
		System.out.println("Сумма последних трёх цифр = " + sum1);
		if (sum1 == sum2) {
			System.out.println("Число является счастливым\n");
		} else {
			System.out.println("Число не является счастливым\n");
		}

		System.out.println("10. Вывод таблицы умножения Пифагора");
		System.out.println("    ТАБЛИЦА	ПИФАГОРА");
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				if (j == 1) {
					System.out.printf("%3d |", i * j);
				} else {
					System.out.printf("%3d", i * j);
				}
			}
			if (i == 1) {
				System.out.printf("\n ----------------------------\n");
			} else {
				System.out.println();
			}
		}
	}
}