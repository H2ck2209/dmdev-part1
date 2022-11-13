package com.dmdev.tasks.lesson7;

/*

Написать программу, которая печатает массив сначала в обычном порядке, потом в обратном

 */

public class Task1 {

    public static void main(String[] args) {
        int[] values = {1, 5, 7, 9, 11};
        printArray(values);
        printArrayForeach(values);
        printArrayReverse(values);
    }


    public static void printArrayForeach(int[] values) {
        for (int value : values) { // справа - интересующая нас структура данных, слева - единица структуры данных
            System.out.print(value + " ");
        }
    }

    public static void printArray(int[] values) {
        for (int i = 0; i < values.length; i++) {
            System.out.print(values[i] + " ");
        }
        System.out.println();
    }

    public static void printArrayReverse(int[] values) {
        for (int i = values.length - 1; i >= 0; i--) {
            System.out.print(values[i] + " ");
        }
        System.out.println();
    }

}

