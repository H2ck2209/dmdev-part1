package lesson4;

import java.util.Random;

public class Part4 {
     public static void main(String[] args) {
          Random random = new Random();
          String portoTossResult;
          int value = random.nextInt(1, 8);
          portoTossResult = switch (value) {
               case 1 -> "Borussia Dortmund";
               case 2 -> "Liverpool";
               case 3 -> "Inter";
               case 4 -> "Milan";
               case 5 -> "Eintracht";
               case 6 -> "PSG";
               case 7 -> "RB Leipzig";
               default -> "Toss result";
          };
          System.out.println(portoTossResult);


     }
}
