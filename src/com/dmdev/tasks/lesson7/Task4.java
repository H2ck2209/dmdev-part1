package com.dmdev.tasks.lesson7;

/*
Определить сумму элементов целочисленного массива, расположенных между минимальным и максимальным значением
 */


public class Task4 {

    /*
    разбиваем задачу на подзадачи:
    1. Поиска индекса элемента с минимальным значением.
    2. Поиска индекса элемента с максимальным значением.
    3. Определение суммы элементов, заключенных между максимальным и минимальным значениями
     */

    public static void main(String[] args) {
        //              0  1  2  3  4  5   6  7
        int[] values = {1, 0, 2, 5, 6, 4, 10, 3};
        System.out.println("max index:" + findMaxIndex(values));
        System.out.println("min index:" + findMinIndex(values));

        System.out.println(sum(values));
    }

    public static int findMinIndex(int[] values) {
        int minIndex = 0;
        int minValue = values[minIndex];
        for (int i = 0; i < values.length; i++) {
            if (minValue > values[i]) {
                minValue = values[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    public static int findMaxIndex(int[] values) {
        int maxIndex = 0;
        int maxValue = values[maxIndex];
        for (int i = 0; i < values.length; i++) {
            if (maxValue < values[i]) {
                maxValue = values[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    public static int sum(int[] values) {
        int maxIndex = findMaxIndex(values);
        int minIndex = findMinIndex(values);
        if (minIndex > maxIndex) {
            int temp = minIndex;
            minIndex = maxIndex;
            maxIndex = temp;
        }

        int result = 0;
        for (int i = minIndex + 1; i < maxIndex; i++) {
            result += values[i];
        }
        return result;
    }


}
