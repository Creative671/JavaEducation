package main;

public class StartApp {
    public static void main(String[] args){
        /*Массивы*/
        int[] number; // объявление массива
        number = new int[10]; // выделение памяти массива на 10 элементов

        /*Массив value*/
        int[] value = new int[5];
        value[0] = 1;
        value[1] = 2;

        /*Вывод массива на экран*/
        for (int o : value) {
            System.out.print(o + ", ");
        }

        System.out.println();

        /*Массив textNumber*/
        int[] textNumber = {1, 2, 3, 4, 5};

        /*Массив myArray*/
        int[] myArray = new int[5];
        System.out.println("Размер массива: " + myArray.length);

    }
}