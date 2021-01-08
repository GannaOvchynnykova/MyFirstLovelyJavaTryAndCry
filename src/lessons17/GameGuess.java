package lessons17;

import java.util.Scanner;
import java.util.SortedMap;

public class GameGuess {
    public static void main(String[] args) {
        game();
    }

    public static void game() {
        int range = customerRange();
        int attempts = customerAttemps();
        int secretCompNumber = generateDigit(range);

         // Viigral esli ygadal
        // proigral; esli ne ygadal
        int countAttemps = 0;
        System.out.println("Davai start");
        //while (number!=digit)

        int customerNumber;
        Scanner scr = new Scanner(System.in);
        customerNumber = scr.nextInt();
        while (customerNumber != secretCompNumber){
            System.out.println();
            System.out.println(compare(customerNumber, secretCompNumber));
            System.out.println("Vvedite number snova");
            customerNumber = scr.nextInt();
            countAttemps++;
            if (attempts == countAttemps){
                attemptsDone (countAttemps);
            }
        }
        System.out.println("Igra okonchena, spasibo!");
    }

    private static String compare(int customerNumber, int secretCompNumber) {
        if (customerNumber == secretCompNumber){
            return "Ygadal";
        }else if (customerNumber>secretCompNumber){
            return "Vashe number bol#she ";
        }else {
            return "Vashe number menshe";
        }
    }

    private static void attemptsDone(int countAttemps) {
        System.out.println("You proigral");
    }

    private static int customerAttemps() {
        Scanner scr = new Scanner(System.in);
        System.out.println("I rekomendy ot 0 do 100 ne menee 5 popitok");
        System.out.println("Sa ckolko popitok ti hochesch otdat moe chislo");
        return scr.nextInt();
    }

    private static int generateDigit(int diapason) {
        return (int) (Math.random() * diapason);
        //(max-min)+1+min
    }
    private static int customerRange() {
        Scanner scr = new Scanner(System.in);
        System.out.println("Tell me number v diaposone kotorogo i doljen sagadat");
        return scr.nextInt();
        //return 10;
    }
}
