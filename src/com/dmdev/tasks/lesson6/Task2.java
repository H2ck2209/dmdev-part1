package com.dmdev.tasks.lesson6;

//Дано число. Найти сумму цифр данного числа

import java.util.Arrays;
import java.util.PropertyResourceBundle;

public class Task2 {
    public static void main(String[] args) {
        int value = 156;
        System.out.println(sumNum(value));
    }

    private static int sumNum(int value) {
        int sum = 0;
        for (int i = 10; value % i > 0; ) {
            sum = sum + (value % i);
            value = value / 10;
        }
        return sum;
    }
}
