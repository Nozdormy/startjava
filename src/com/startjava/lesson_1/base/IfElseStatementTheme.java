package com.startjava.lesson_1.base;

public class IfElseStatementTheme {

	public static void main(String[] args) {
		System.out.println("1. Перевод псевдокода на язык Java (это название задачи)");
		int age = 16;
		if (age > 20) {
			System.out.println("Скорее всего вы уже закончили школу");
		} else {
			System.out.println("Вам ещё рано заходить на этот сайт");
		}
		boolean maleGender = true;
		if (!maleGender) {
			System.out.println("Вы не похожи на мужчину");
		} else {
			System.out.println("Вы похожи на мужчину");
		}
		double height = 2;
		if (height < 1.80) {
			System.out.println("Ваш рост меньше, чем у Брэда Питта");
		} else {
			System.out.println("Вы выше, чем Брэд Питт");
		}
		String name = "Ivan";
		char firstLatterName = name.charAt(0);
		if (firstLatterName == 'M') {
			System.out.println("Вы победили");
		} else if (firstLatterName == 'I') {
			System.out.println("Вы занимаете 2-ое место");
		} else {
			System.out.println("Сегодня удача отвернулась от вас");
		}

		System.out.println("\n2. Поиск max и min числа");
		int num1 = 111;
		int num2 = 10;
		if (num1 > num2) {
			System.out.println("Максимальное число - " + num1 + "\nМинимальное число - " + num2);
		} else if (num1 < num2) {
			System.out.println("Максимальное число - " + num2 + "\nМинимальное число - " + num1);
		} else {
			System.out.println("Числа равны");
		}

		System.out.println("\n3. Работа с числом");
		int randomNum = 35;
		System.out.println("Исходное число - " + randomNum);
		if (randomNum != 0) {
			if (randomNum > 0) {
				System.out.println("Число положительное");
			} else {
				System.out.println("Число отрицательное");
			}
		}
		if (randomNum % 2 == 0) {
			System.out.println("Число четное");
		} else {
			System.out.println("Число нечетное");
		}

		System.out.println("\n4. Поиск одинаковых цифр в числах");
		num1 = 456;
		num2 = 906;
		System.out.println("Исходные числа: " + num1 + " и " + num2);
		if (num1 / 100 == num2 / 100) {
			System.out.println(num1 / 100 + "\n" + "Цифры в первом разряде совпадают");
		}
		if (num1 % 100 / 10 == num2 % 100 / 10) {
			System.out.println(num1 % 100 / 10 + "\n" + "Цифры во втором разряде совпадают");
		}
		if (num1 % 10 == num2 % 10) {
			System.out.println(num1 % 10 + "\n" + "Цифры в третьем разряде совпадают");
		}

		System.out.println("\n5. Определение буквы, числа или символа по их коду");
		char codeChar = '\u0057';
		System.out.println(codeChar);
		if (codeChar > 96 && codeChar < 123) {
			System.out.println("Это маленькая буква");
		} else if (codeChar > 64 && codeChar < 91) {
			System.out.println("Это большая буква");
		} else if (codeChar > 47 && codeChar < 58) {
			System.out.println("Это цифра");
		} else {
			System.out.println("Это не буква и не число");
		}

		System.out.println("\n6. Определение суммы вклада и начисленных банком %");
		int total = 300_000;
		System.out.println("Сумма вклада - " + total);
		double percent = 0;
		if (total < 100_000) {
			percent = total * 0.05;
		} else if (total >= 100_000 && total <= 300_000) {
			percent = total * 0.07;
		} else if (total > 300_000) {
			percent = total * 0.1;
		}
		System.out.println("Начисленный процент - " + percent);
		System.out.println("Итоговая сумма - " + (total + percent));

		System.out.println("\n7. Определение оценки по предметам");
		int ratingHistory = 59;
		int ratingProgramming = 91;
		int ballHistory = 0;
		int ballProgramming = 0;
		if (ratingHistory <= 60) {
			ballHistory = 2;
		} else if (ratingHistory <= 73) {
			ballHistory = 3;
		} else if (ratingHistory <= 91) {
			ballHistory = 4;
		} else if (ratingHistory > 91) {
			ballHistory = 5;
		}
		System.out.println(ballHistory + " - История");
		if (ratingProgramming <= 60) {
			ballProgramming = 2;
		} else if (ratingProgramming <= 73) {
			ballProgramming = 3;
		} else if (ratingProgramming <= 91) {
			ballProgramming = 4;
		} else if (ratingProgramming > 91) {
			ballProgramming = 5;
		}
		System.out.println(ballProgramming + " - Программирование");
		double averageBall = (ballHistory + ballProgramming) / 2;
		System.out.println("Средний балл по предмету - " + averageBall);
		double averageMark = (ratingHistory + ratingProgramming) / 2;
		System.out.println("Средний % по предметам - " + averageMark + "\n");

		System.out.println("8. Расчет прибыли");
		int rent = 5_000;
		int averageProfit = 13_000;
		int costPrice = 9_000;
		int profitYear = (averageProfit - costPrice - rent) * 12;
		if (profitYear > 0) {
			System.out.println("Прибыль за год: +" + profitYear + " рублей");
		} else {
			System.out.println("Прибыль за год: " + profitYear + " рублей");
		}

		System.out.println("\n9. Подсчет количества банкнот");
		int cash = 567;
		int numHundreds = cash / 100;
		int numTens = cash % 100 / 10;
		int numUnits1 = cash % 10;
		if (numTens > 5) {
			numUnits1 = (numTens - 5) * 10 + numUnits1;
			numTens = 5;
		}
		System.out.println(numHundreds + " купюр номиналом 100$");
		System.out.println(numTens + " купюр номиналом 10$");
		System.out.println(numUnits1 + " купюр номиналом 1$");
		int check = (numHundreds * 100 + numTens * 10 + numUnits1);
		System.out.println("Посчитанная исходная сумма - " + check);
	}
}
