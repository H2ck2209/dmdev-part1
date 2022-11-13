package com.dmdev.lessons.lesson4;

import java.util.Random;

public class Part2 {
    public static void main(String[] args) {
        Random random = new Random();
        int tossResult = random.nextInt(1, 6);

        switch (tossResult) {
            case 1 -> System.out.println("Bayern");
            case 2 -> System.out.println("Real Madrid");
            case 3 -> System.out.println("Porto");
            case 4 -> System.out.println("Benfica");
            default -> System.out.println("YNWA");
        }
    }
}