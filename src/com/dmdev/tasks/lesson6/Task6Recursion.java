package com.dmdev.tasks.lesson6;

public class Task6Recursion {

    public static void main(String[] args) {
        int value = 5;
    int factorial = factorial(value);
        System.out.println(factorial );
    }

    public static int factorial (int value) {
        if (value == 1) {
            return 1;
        }
        return value * factorial(value - 1);

    }


}
