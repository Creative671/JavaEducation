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
        
    }
}