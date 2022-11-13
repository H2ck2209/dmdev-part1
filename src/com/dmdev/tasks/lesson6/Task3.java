package com.dmdev.tasks.lesson6;

/*
В 1626 году индейцы продали Манхэттэн за 24 доллара.
Написать программу рассчета суммы, получившейся в текущем году,
если бы индейцы положили эти деньги в банк под 5 % годовых.
 */

public class Task3 {
    public static void main(String[] args) {
        double startSum = 24;
        int startYear = 1626;
        double benefit = 0.05;
        int currentYear = 2022;
        double sum = sumMoney(startSum, startYear, benefit, currentYear);
        System.out.println(sum);
    }


    public static double sumMoney(double startSum, int startYear, double benefit, int currentYear) {
        for (int i = startYear + 1; i <= currentYear; i++) {
            startSum = startSum + startSum * benefit;
            System.out.println("В году " + i + " общая сумма равна " + startSum);
        }
        return startSum;
    }
}
