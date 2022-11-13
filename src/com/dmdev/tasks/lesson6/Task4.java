package com.dmdev.tasks.lesson6;

/*
Написать программу, определяющую, является ли данное число простым,
то есть делится без остатка только на само себя и единицу
 */

public class Task4 {
    public static void main(String[] args) {
        int testValue = 11;
        boolean result = isSimple(testValue);
        System.out.println(result);
    }

    public static boolean isSimple (int value) {
        boolean result = true;
        for (int i = 2; i < value; i++) {
            if (value % i == 0){
                result = false;
                break;
            }
        }

        return result;
    }
}
