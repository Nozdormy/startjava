package com.startjava.lesson_1.base;

public class VariablesTheme {

	public static void main(String[] args) {
		System.out.println("1. Создание переменных и вывод их значений на консоль");
		byte core = 2;
		short ssd = 500;
		int ram = 3764;
		long deviceNumber = 1234567890987L;
		float screen = 12.65F;
		double cpuFrequency = 2.864;
		char logo = '&';
		boolean laptop = true;
		System.out.println("Мой компьютер:\nКоличество ядер - " + core + "\nРазмер накопителя - " + ssd
				+ "\nОперативная память - " + ram + "\nНомер устройства - " + deviceNumber + "\nДиагональ экрана - "
				+ screen + "\nЧастота процессора - " + cpuFrequency + "\nЛоготип - " + logo + "\nЭто ноутбук - "
				+ laptop + "\n");

		System.out.println("2. Расчет стоимости товара со скидкой");
		int pricePen = 100;
		int priceBook = 200;
		int sumTotal = priceBook + pricePen;
		double discountPrice = sumTotal * 0.89;
		System.out.println("Сумма скидки - " + (sumTotal - discountPrice));
		System.out.println("Общая стоимость товара со скидкой - " + discountPrice + "\n");

		System.out.println("3. Вывод на консоль слова JAVA");
		System.out.println("   J    a  v     v  a\n" + "   J   a a  v   v  a a\n" + "J  J  aaaaa  V V  aaaaa\n"
				+ " JJ  a     a  V  a     a" + "\n");

		System.out.println("4. Отображение min и max значений числовых типов данных");
		byte maxByte = 127;
		short maxShort = 32_767;
		int maxInt = 2_147_483_647;
		long maxLong = 9_223_372_036_854_775_807L;
		System.out.println("Первоначальное значение первой переменной - " + maxByte + "\nЗначение после инкремента - "
				+ ++maxByte + "\nЗначение после декремента - " + --maxByte);
		System.out.println("Первоначальное значение второй переменной - " + maxShort + "\nЗначение после инкремента - "
				+ ++maxShort + "\nЗначение после декремента - " + --maxShort);
		System.out.println("Первоначальное значение третьей переменной - " + maxInt + "\nЗначение после инкремента - "
				+ ++maxInt + "\nЗначение после декремента - " + --maxInt);
		System.out.println("Первоначальное значение четвертой переменной - " + maxLong
				+ "\nЗначение после инкремента - " + ++maxLong + "\nЗначение после декремента - " + --maxLong + "\n");

		System.out.println("5. Перестановка значений переменных");
		int num1 = 2;
		int num2 = 5;
		int tmp;
		System.out.println("Cпособ перестановки значений с помощью третьей переменной"
				+ "\nИсходные значения переменных: " + num1 + " " + num2);
		tmp = num1;
		num1 = num2;
		num2 = tmp;
		System.out.println("Новые значения переменных: " + num1 + " " + num2);
		System.out.println("Cпособ перестановки значений с помощью арифметических операций"
				+ "\nИсходные значения переменных: " + num1 + " " + num2);
		num1 += num2;
		num2 = num1 - num2;
		num1 -= num2;
		System.out.println("Новые значения переменных: " + num1 + " " + num2);
		System.out.println("Cпособ перестановки значений с помощью с помощью побитовой операции"
				+ "\nИсходные значения переменных: " + num1 + " " + num2);
		num1 ^= num2;
		num2 = num1 ^ num2;
		num1 ^= num2;
		System.out.println("Новые значения переменных: " + num1 + " " + num2 + "\n");

		System.out.println("6. Вывод символов и их кодов");
		char codeChar1 = 35;
		char codeChar2 = 38;
		char codeChar3 = 64;
		char codeChar4 = 94;
		char codeChar5 = 95;
		System.out.println("Код символа: 35 - " + codeChar1 + "\nКод символа: 38 - " + codeChar2 + "\nКод символа: 64 - "
						+ codeChar3 + "\nКод символа: 94 - " + codeChar4 + "\nКод символа: 95 - " + codeChar5 + "\n");

		System.out.println("7. Отображение количества сотен, десятков и единиц числа");
		int srcNum = 123;
		System.out.println("Число " + srcNum + " содержит:\n" + srcNum / 100 + " сотен\n" + srcNum % 100 / 10
				+ " десятков\n" + srcNum % 10 + " единиц" + "\n");

		System.out.println("8. Вывод на консоль ASCII-арт Дюка");
		char space = ' ';
		char underscore = '_';
		char slash = '/';
		char backSlash = '\\';
		char oParenthesis = '(';
		char cParenthesis = ')';
		System.out.println("" + space + space + space + space + slash + backSlash + space + space + space + space 
				+ space);
		System.out.println("" + space + space + space + slash + space + space + backSlash + space + space + space 
				+ space);
		System.out.println("" + space + space + slash + underscore + oParenthesis + space + cParenthesis + backSlash
				+ space + space + space);
		System.out.println("" + space + slash + space + space + space + space + space + space + backSlash + space 
				+ space);
		System.out.println("" + slash + underscore + underscore + underscore + underscore + slash + backSlash
				+ underscore + underscore + backSlash + space + "\n");

		System.out.println("9. Произведение и сумма цифр числа");
		srcNum = 345;
		int numHundreds = srcNum / 100;
		int numTens = srcNum % 100 / 10;
		int numUnits = srcNum % 10;
		System.out.println("Сумма цифр числа " + srcNum + " = " + (numHundreds + numTens + numUnits));
		System.out.println("Произведение цифр числа " + srcNum + " = " + numHundreds * numTens * numUnits + "\n");

		System.out.println("10. Преобразование секунд");
		int totalSec = 86399;
		int minute = 60 * 60;
		System.out.println(totalSec / minute + ":" + (totalSec % minute) / 60 + ":" + totalSec % 60);
	}
}
