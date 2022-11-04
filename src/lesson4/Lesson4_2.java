package lesson4;

import java.util.Random;

public class Lesson4_2 {
    public static void main(String[] args) {
        Random random = new Random();
        int tossResult = random.nextInt(1, 6 );

        switch (tossResult) {
            case 1:
                System.out.println("Bayern");
                break;
            case 2:
                System.out.println("Real Madrid");
                break;
            case 3:
                System.out.println("Porto");
                break;
            case 4:
                System.out.println("Benfica");
                break;
            default:
                System.out.println("YNWA");
        }
    }
}