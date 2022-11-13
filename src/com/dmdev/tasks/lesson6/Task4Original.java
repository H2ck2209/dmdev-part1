package com.dmdev.tasks.lesson6;

/*
Написать программу, определяющую, является ли данное число простым,
то есть делится без остатка только на само себя и единицу
 */

public class Task4Original {
    public static void main(String[] args) {
        int value = 37;
        boolean result = isSimple(value);
        System.out.println(result);

        boolean resultWhile = isSimpleWhile(value);
        System.out.println(resultWhile);
    }

    public static boolean isSimpleWhile(int value) {
        boolean result = true;
        int i = 2;
        while (i < value) {
            if (value % i == 0) {
                result = false;
                i++;
                break;
            }
            i++;
        }
        return result;
    }


    public static boolean isSimple(int value) {
        boolean result = true;
        for (int i = 2; i < value; i++) {
            if (value % i == 0) {
                result = false;
                break;
            }
        }
        return result;
    }

}
