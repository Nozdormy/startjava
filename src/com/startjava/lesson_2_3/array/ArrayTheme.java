package com.startjava.lesson_2_3.array;

public class ArrayTheme {
    public static void main(String[] args) {
        System.out.println("1. Реверс значений массива");
        int[] intArray = {1, 7, 2, 6, 3, 5, 4};
        int len = intArray.length;
        show(intArray);
        for (int i = 0; i < len / 2; i++) {
            int temp = intArray[i];
            intArray[i] = intArray[len - i - 1];
            intArray[len - i - 1] = temp;
        }
        show(intArray);

        System.out.println("\n2. Вывод произведения элементов массива");
        intArray = new int[10];
        len = intArray.length;
        for (int i = 0; i < len; i++) {
            intArray[i] = i;
        }
        show(intArray);
        int sum = 1;
        String str;
        for (int i = 1; i < len - 1; i++) {
            str = (i == 8 ? i + " = " : i + " * ");
            System.out.print(str);
            sum *= i;
        }
        System.out.println(sum);
        int sum2 = intArray[0] * intArray[9];
        System.out.println(sum2 + "\n");

        System.out.println("3. Удаление элементов массива");
        double[] doubleArray = new double[15];
        len = doubleArray.length;
        for (int i = 0; i < len; i++) {
            doubleArray[i] = Math.random();
        }
        show(doubleArray);
        int midleArray = len / 2;
        System.out.println("Индекс средней ячейки - " + midleArray);
        int count = 0;
        for (int i = 0; i < len; i++) {
            if (doubleArray[midleArray] < doubleArray[i]) {
                doubleArray[i] = 0;
                count++;
            }
        }
        show(doubleArray);
        System.out.println("Количество обнуленных ячеек - " + count + "\n");

        System.out.println("4. Вывод элементов массива лесенкой в обратном порядке");
        char[] alphabet = new char[26];
        len = alphabet.length;
        for (int i = 0; i < len; i++) {
            alphabet[i] = (char) ('A' + i);
        }
        str = "";
        for (int i = 25; i >= 0; i--) {
            str += alphabet[i];
            System.out.println(str);
        }

        System.out.println("\n5. Генерация уникальных чисел");
        intArray = new int[30];
        len = intArray.length;
        for (int i = 0; i < len; i++) {
            boolean uniqueNum;
            do {
                intArray[i] = (int) (Math.random() * (100 - 60) + 60);
                uniqueNum = true;
                for (int j = 0; j < i; j++) {
                    if (intArray[i] == intArray[j]) {
                        uniqueNum = false;
                        break;
                    }
                }
            } while (!uniqueNum);
        }
        for (int i = 0; i < len - 1; i++) {
            for (int j = 0; j < len - i - 1; j++) {
                if (intArray[j + 1] < intArray[j]) {
                    int temp = intArray[j];
                    intArray[j] = intArray[j + 1];
                    intArray[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < len; i++) {
            if (i % 10 == 0 && i != 0) {
                System.out.println();
            }
            System.out.print(intArray[i] + " ");
        }

        System.out.println("\n\n6. Сдвиг элементов массива");
        String[] stringArray = {"    ", "AA", "", "BBB", "CC", "D", "    ", "E", "FF", "G", ""};
        show(stringArray);
        len = stringArray.length;
        count = 0;
        for (String s: stringArray) {
            if(!s.isBlank()) {
                count++;
            }
        }
        String[] stringArray2 = new String[count];
        int srcPos = 0;
        int destPos = 0;
        int i = 0;
        while (i < len) {
            int newLen = 0;
            while (!stringArray[i].isBlank()) {
                newLen++;
                i++;
            }
            System.arraycopy(stringArray, srcPos, stringArray2, destPos, newLen);
            i++;
            srcPos = i;
            destPos += newLen;
        }
        show(stringArray2);
        System.out.println("Количество пустых строк - " + (len - count));
    }

    private static void show(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    private static void show(double[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i == 8) {
                System.out.printf("%n%11.3f ", array[i]);
            } else {
                System.out.printf("%.3f ", array[i]);
            }
        }
        System.out.println();
    }

    private static void show(String[] array) {
        for (String str : array) {
            System.out.print(str + ", ");
        }
        System.out.println();
    }
}