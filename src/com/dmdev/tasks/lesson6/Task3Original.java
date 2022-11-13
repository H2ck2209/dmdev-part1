package com.dmdev.tasks.lesson6;

/*
В 1626 году индейцы продали Манхэттэн за 24 доллара.
Написать программу рассчета суммы, получившейся в текущем году,
если бы индейцы положили эти деньги в банк под 5 % годовых.
 */

public class Task3Original {
    public static void main(String[] args) {

        double sourceSum = 24;
        double result = sum(sourceSum);

        double whileResult = whileSum(sourceSum);

        boolean isEqual = result == whileResult;
        System.out.println(isEqual);
    }

    public static double whileSum (double sourceSum) {
        double result = sourceSum;
        int year = 1626 + 1;
        while (year <= 2020) {
            double percent = result  * 0.05;
            result += percent;
            System.out.println(year + ": " + result);
            year ++;
        }
        return result;
    }


    public static double sum(double sourceSum) {
        double result = sourceSum;
        for (int year = 1626 + 1; year <= 2020; year++) {
            double percent = result  * 0.05;
            result += percent;
            System.out.println(year + ": " + result);
        }
        return result;
    }

}

