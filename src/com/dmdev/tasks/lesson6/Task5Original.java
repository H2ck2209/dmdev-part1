package com.dmdev.tasks.lesson6;

/*
написать програаму, которая циклом проходит по английскому алфавиту начиная с "b",
и выводит каждую букву до тех пор, пока не встретит гласную (т.е. вывести согласные на консоль)
 */

public class Task5Original {
    public static void main(String[] args) {
        printLetters();
        printLettersWhile();
    }

    public static void printLettersWhile () {
        char letter = 'b';
        while (!isVowel(letter)) {
            System.out.println(letter);
            letter++;
        }
    }

    public static void printLetters() {
        for (char letter = 'b'; !isVowel(letter); letter++) {
            System.out.println(letter);
        }
    }

    public static boolean isVowel(char value) {
        return value == 'a' || value == 'e' || value == 'i' || value == 'o' || value == 'u' || value == 'y';
    }

}
