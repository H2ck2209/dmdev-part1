package com.dmdev.tasks.lesson6;

//Дано число. Найти факториал числа

//КАК ИЗБЕЖАТЬ NULL?

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число, для которого рассчитываем факториал");
        int value = scanner.nextInt();
//        System.out.println("Факториал числа " + value + " равен " + whileFactorial(value));
        System.out.println("Факториал числа " + value + " равен " + factorial(value));
    }

    private static Integer factorial(int value) {
        Integer result = 1;
        if (value > 0) {
            for (int i = 1; i <= value; i++) {
                result = result * i;
            }
        } else if (value == 0) {
            result = 1;
        } else {
            System.out.println("Факториал можно рассчитать только для неотрицательного числа");
            result = null;
        }
        return result;
    }

    private static void voidFactorial(int value) {
        int result = 1;
        if (value > 0) {
            for (int i = 1; i <= value; i++) {
                result = result * i;
            }
            System.out.println("Факториал числа " + value + " равен " + result);
        } else if (value == 0) {
            result = 1;
            System.out.println("Факториал нуля равен " + result);
        } else {
            System.out.println("Факториал можно рассчитать только для неотрицательного числа");
        }
    }

    private static int whileFactorial(int value) {
        int result = 1;
        while (true) {
            if (value > 0) {
                for (int i = 1; i <= value; i++) {
                    result = result * i;
                }
            } else if (value == 0) {
                result = 1;
            } else {
                System.out.println("Факториал можно рассчитать только для неотрицательного числа");
            }
            break;
        }
        return result;
    }
}
