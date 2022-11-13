package com.dmdev.tasks.lesson6;

/*
написать програаму, которая циклом проходит по английскому алфавиту начиная с "b",
и выводит каждую букву до тех пор, пока не встретит гласную (т.е. вывести согласные на консоль)
 */

import org.w3c.dom.ls.LSOutput;

public class Task5Original {
    public static void main(String[] args) {
        printAllConsonants();
        System.out.println("*****");
        printBeforeVowel();
    }

    public static void printBeforeVowel() {
        char letter = 'b';
        while (!isVowel(letter)) {
            System.out.println(letter);
            letter++;
        }
    }

    public static void printAllConsonants() {
        for (char letter = 'b'; ; letter++) {
            var temp = 'z';
            temp++;
            if (isVowel(letter)) {
                continue;
            } else if (letter == temp) {
                break;
            }
            System.out.println(letter);
        }
    }

    public static boolean isVowel(char value) {
        return value == 'a' || value == 'e' || value == 'i' || value == 'o' || value == 'u' || value == 'y';
    }
}
