package main;

import java.util.Scanner;

public class Start {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int a = 10;
        long b = 100_920_203_923L;
        double s = 23.32d;

        int a2 = 10;
        int b2 = 4;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        System.out.println(sum(a2, b2));

        printMyText("Java");

        int age;
        boolean ok = true;

        /*цикл while*/
        while (!ok){
            age = scanner.nextInt();
            /*Оператор switch*/
            switch (age){
                case 20:
                    System.out.println("20");
                    break;
                case 30:
                    System.out.println("30");
                    break;
                case 31:
                    System.out.println("31");
                    break;
                default:
                    System.out.println("15");
                    ok = false;
            }
        }
        /*цикл for*/
        for (int i = 0; i <= 5; i++){
            System.out.println("i = " + i);
        }
        System.out.println("Цикл for с шагом \"+ 5\"");
        for (int i = 0; i <= 10; i = i + 5){
            System.out.println("i = " + i);
        }
        System.out.println("Цикл for с оператором break");
        for (int i = 0; i < 10; i++){
            if (i > 4){
                break;
            }
            System.out.println("i = " + i);
        }

        /*массив*/
        String[] name = {"A", "B", "C", "D"};
        int count = 0;
        for (String o: name) {
            count++;
            System.out.print(o + " - значение " + count + " ");
        }

        System.out.println();

        /*цикл do while*/
        int count1 = 0;
        do {
            System.out.println("Привет");
            count1++;
        }
        while (count1 < 5);

        System.out.println();

        System.out.println("Поле №1");
        for (int i = 0; i < 6; i++){
            for (int j = 0; j < 6; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();

        System.out.println("Поле №2");
        for (int i = 0; i < 6; i++){
            for (int j = 0; j < 6; j++){
                if (j < 3){
                    System.out.print("* ");
                }
                else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }

        System.out.println();

        System.out.println("Поле №3");
        for (int i = 0; i < 6; i++){
            for (int j = 0; j < 6; j++){
                if (i == 0 || i == 5 || j == 0 || j == 5){
                    System.out.print("0 ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }

        System.out.println();

        System.out.println("Поле №4");
        for (int i = 0; i < 6; i++){
            for (int j = 0; j < 6; j++){
                if ((i % 2 == 0 && j % 2 != 0) || (i % 2 != 0 && j % 2 == 0)){
                    System.out.print("0 ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }

    public static int sum(int a, int b){
        int sum;
        sum = a + b;
        return sum;
    }

    public static void printMyText(String text){
        System.out.println(text);
    }
}