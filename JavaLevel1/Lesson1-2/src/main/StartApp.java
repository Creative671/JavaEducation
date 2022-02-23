package main;

import java.util.Arrays;

public class StartApp {
    public static void main(String[] args){
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
        int [][] textNumberArrays = {{1, 1}, {2, 2}, {5, 5}};
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

        for (int i = 0; i < season.length; i++){
            System.out.print(season[i] + ", ");
        }

        System.out.println();

        /*Двумерный массив*/
        int[][] arrays = new int[8][8];

        /*Поле из двумерного массива*/
        for (int i = 0; i < arrays.length; i++){
            for (int j = 0; j < arrays.length; j++){
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
    }
}