package main;

import java.util.Arrays;

public class StartApp {
    public static void main(String[] args) {
        /*Массивы*/
        int[] number; // объявление массива
        number = new int[10]; // выделение памяти массива на 10 элементов

        /*Массив value*/
        int[] value = new int[5];
        value[0] = 1;
        value[1] = 2;

        System.out.println();

        /*Массив textNumber*/
        int[] textNumber = {1, 2, 3, 4, 5};
        int[][] textNumberArrays = {{1, 1}, {2, 2}, {5, 5}};
        System.out.println("Вывод двойного массива " + Arrays.toString(textNumberArrays));
        System.out.println("Вывод массива " + Arrays.toString(textNumber));
        /*Массив myArray*/
        int[] myArray = new int[5];
        System.out.println("Размер массива: " + myArray.length);

        String[] season = new String[4];
        season[0] = "Winter";
        season[1] = "Spring";
        season[2] = "Summer";
        season[3] = "Autumn";

        /*Вывод массива на экран через цикл foreach*/
        for (int o : value) {
            System.out.print(o + ", ");
        }

        System.out.println();

        /*Вывод массива на экран через цикл for*/

        for (int i = 0; i < season.length; i++) {
            System.out.print(season[i] + ", ");
        }

        System.out.println();

        /*Двумерный массив*/
        int[][] arrays = new int[8][8];

        /*Поле из двумерного массива*/
        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays.length; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();

        /*Пример - сортировка массива*/
        System.out.println("Пример - сортировка массива");
        int[] arrayNumber = {1, 4, 9, 2, 3, 10, 34, 18, 0};
        System.out.println("Массив до сортировки " + Arrays.toString(arrayNumber)); // Вывод массива без использования цикла
        Arrays.sort(arrayNumber, 0, 9); // Сортировка массива
        System.out.println("Массив после сортировки " + Arrays.toString(arrayNumber));
        int searchNumber = Arrays.binarySearch(arrayNumber, 34); // Поиск числа
        System.out.println("Индекс числа в поиске " + searchNumber);
        System.out.println(Arrays.binarySearch(arrayNumber, 78));

        System.out.println("Задача 1: ");
        for (int i = 0; i < 10; i++) {
            int a = (int) (Math.random() * 10);
            int b = (int) (Math.random() * 10);
            System.out.println(a + " + " + b + " = " + twoNumberSum(a, b));
        }

        System.out.println("Задача 2: ");
        int[] numberValue = {-1, 2, 65, -2, 3, -10, 3, 0};
        for (int i = 0; i < numberValue.length; i++) {
            System.out.println(numberValue[i] + " = " + checkNumber(numberValue[i]));
        }

        System.out.println("Задача 3: ");
        printTextValue("Test", 3);
    }

//    Написать метод, принимающий на вход два целых числа и проверяющий,
//    что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true,
//    в противном случае – false.

    public static boolean twoNumberSum(int a, int b) {
        if ((a + b) >= 10 && (a + b) <= 20) {
            return true;
        } else {
            return false;
        }
    }

//    Написать метод, которому в качестве параметра передается целое число,
//    метод должен напечатать в консоль, положительное ли число передали или отрицательное.
//    Замечание: ноль считаем положительным числом.

    public static boolean checkNumber(int a) {
        if (a >= 0) {
            return true;
        } else {
            return false;
        }
    }

//    Написать метод, которому в качестве аргументов передается строка и число,
//    метод должен отпечатать в консоль указанную строку, указанное количество раз;

    public static void printTextValue(String text, int number){
        int a = 0;
        while (a < number){
            System.out.println(text);
            a++;
        }
    }
}