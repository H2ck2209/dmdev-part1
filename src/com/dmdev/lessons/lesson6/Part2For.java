package com.dmdev.lessons.lesson6;

public class Part2For {
    public static void main(String[] args) {
        for (int i = 10; i > 0; i--) {
            if (i == 5) {
                continue;
            }
            System.out.println(i);
        }
    }

    private static void forExample() {
        for (int value = 10; value > 0; value--) {
            System.out.println(value);
        }
    }
}
