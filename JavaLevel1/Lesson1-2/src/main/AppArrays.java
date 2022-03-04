package main;

import java.util.Arrays;

public class AppArrays {
    public static void main(String[] args){
//        1. Задать целочисленный массив, состоящий из элементов 0 и 1.
//        Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
//        С помощью цикла и условия заменить 0 на 1, 1 на 0;
        System.out.println("Задание 1: ");
        int [] a = new int[10];
        for (int i = 0; i < a.length; i++){
            a[i] = (int)(Math.random() * 2);
        }
        System.out.println("Исходный массив: " + Arrays.toString(a));
        for (int i = 0; i < a.length; i++){
            if (a[i] == 0){
                a[i] = 1;
            } else {
                a[i] = 0;
            }
        }
        System.out.println("Преобразованный массив: " + Arrays.toString(a));

        //    2. Задать пустой целочисленный массив размером 8.
        //    С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
        System.out.println("Задание 2: ");
        int [] b = new int [8];
        int count = 0;
        System.out.println("Исходный массив " + Arrays.toString(b));
        for (int i = 0; i < b.length; i++){
            b[i] = count;
            count = count + 3;
        }
        System.out.println("Полученный массив " + Arrays.toString(b));

//        3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом,
//        и числа меньшие 6 умножить на 2;
        System.out.println("Задание 3: ");
        int [] c = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("Исходный массив " + Arrays.toString(c));
        for (int i = 0; i < c.length; i++){
            if (c[i] < 6){
                c[i] = c[i] * 2;
            }
        }
        System.out.println("Полученный массив: " + Arrays.toString(c));

//        4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
//        и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
        System.out.println("Задание 4: ");
        int[][] arrays = new int[4][4];
        int count2 = arrays.length - 1; // счётчик для побочной диагонали
        for (int i = 0; i < arrays.length; i++){
            for (int j = 0; j < arrays.length; j++){
                if (i == j) {
                    arrays[i][j] = 1;
                } else if (j == count2) {
                    arrays[i][j] = 1;
                    count2--;
                } else {
                    arrays[i][j] = 0;
                }
            }
        }
        printArrays(arrays);
    }

    /*Метод для вывода массива*/
    public static void printArrays(int [][] arrays){
        for (int i = 0; i < arrays.length; i++){
            for (int j = 0; j < arrays.length; j++){
                System.out.print(arrays[i][j] + " ");
            }
            System.out.println();
        }
    }
}