package com.dmdev.tasks.lesson6;

//Дано число. Найти сумму цифр данного числа

public class Task2Original {
    public static void main(String[] args) {
        int value = 222 ;
        int sum = sum(value);
        System.out.println(sum);
        int sumFor = sumFor(value);
        System.out.println(sumFor);
    }

    public static int sumFor(int value) {
        int result = 0;
        for (int currentValue = value; currentValue !=0 ; currentValue /=10) {
        result += currentValue % 10;
        }
        return result;
    }

    public static int sum(int value) {
        int result = 0;
        int currentValue = value;
        while (currentValue != 0) {
            result += currentValue % 10;
            currentValue /= 10;
        }
        return result;
    }

}


