package main;

import java.util.Arrays;

public class AppArrays {
    public static void main(String[] args){
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
    }
}
