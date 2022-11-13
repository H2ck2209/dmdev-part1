package com.dmdev.tasks.lesson6;

//Дано число. Найти факториал числа

public class Task1Original {

    public static void main(String[] args) {
        int value = 7;
        long result = factorial(value); // для больших значений поменял тип переменной на long
        System.out.println(result);
        long result2 = whileFactorial(value);
        System.out.println(result2);
    }

    public static long whileFactorial (int value) {
        long result = 1;
        int i = 1;
        while (i <= value) {
            result *= i;
            i++;
        }

        return result;
    }


    public static long factorial (int value) {
        long result = 1;
        for (int i = 1; i <= value ; i++) {
            result *= i;
        }
        return result;
    }
}
