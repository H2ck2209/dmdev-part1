package com.dmdev.lessons.lesson7;

public class Part1Arrays {

    public static void main(String[] args) {

        int[] values = new int[10]; // создание массива с указанием количества его элементов

        values[4] = 9;
        values[7] = 98;

        for (int i = 0; i < values.length; i++) {
            System.out.println(i + ": " + values[i]);
        }


    }

    private static void test() {
        int value = 10;
        //              0  1  2  3  4  values.length = 5;
        int values[] = {1, 5, 6, 8, 9}; // инициализация массива при его  создании
        System.out.println(values[2]);
        values[3] = 18;
        System.out.println(values[3]);
    }

}

