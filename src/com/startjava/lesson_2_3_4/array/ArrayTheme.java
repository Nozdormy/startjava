package com.startjava.lesson_2_3_4.array;

public class ArrayTheme {
    public static void main(String[] args) {
        System.out.println("1. Реверс значений массива");
        int[] intArray = {1, 7, 2, 6, 3, 5, 4};
        int len = intArray.length;
        show(intArray);
        for (int i = 0; i < len; i++) {
            int temp = intArray[i];
            intArray[i] = intArray[--len];
            intArray[len] = temp;
        }
        show(intArray);

        System.out.println("\n2. Вывод произведения элементов массива");
        intArray = new int[10];
        len = intArray.length;
        for (int i = 0; i < len; i++) {
            intArray[i] = i;
        }
        int mult = 1;
        for (int i = 1; i < len - 1; i++) {
            System.out.print(i + (i == 8 ? " = " : " * "));
            mult *= i;
        }
        System.out.println(mult);
        System.out.println(intArray[0] + "\n" + intArray[9] + "\n");

        System.out.println("3. Удаление элементов массива");
        double[] doubleArray = new double[15];
        len = doubleArray.length;
        for (int i = 0; i < len; i++) {
            doubleArray[i] = Math.random();
        }
        show(doubleArray);
        double middleNum = doubleArray[len / 2];
        int count = 0;
        for (int i = 0; i < len; i++) {
            if (middleNum > doubleArray[i]) {
                doubleArray[i] = 0;
                count++;
            }
        }
        System.out.println();
        show(doubleArray);
        System.out.println("Количество обнуленных ячеек - " + count + "\n");

        System.out.println("4. Вывод элементов массива лесенкой в обратном порядке");
        char[] alphabet = new char[26];
        len = alphabet.length;
        for (int i = 0; i < len; i++) {
            alphabet[i] = (char) ('A' + i);
        }
        StringBuilder builder = new StringBuilder();
        for (int i = 25; i >= 0; i--) {
            System.out.println(builder.append(alphabet[i]));
        }

        System.out.println("\n5. Генерация уникальных чисел");
        intArray = new int[30];
        len = intArray.length;
        int num = 60;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if (intArray[j] == num) {
                    num = (int) (Math.random() * (100 - 60) + 60);
                    j = -1;
                }
            }
            intArray[i] = num;
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
        String[] srcArray = {"    ", "AA", "", "BBB", "CC", "D", "    ", "E", "FF", "G", ""};
        show(srcArray);
        len = srcArray.length;
        count = 0;
        for (String str : srcArray) {
            if (!str.isBlank()) {
                count++;
            }
        }

        String[] destArray = new String[count];
        int srcPos = 0;
        int destPos = 0;
        int i = 0;
        while (i < len) {
            count = 0;
            while (!srcArray[i].isBlank()) {
                count++;
                i++;
            }
            System.arraycopy(srcArray, srcPos, destArray, destPos, count);
            i++;
            srcPos = i;
            destPos += count;
        }
        show(destArray);
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
                System.out.println();
            }
            System.out.printf("%.3f ", array[i]);
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