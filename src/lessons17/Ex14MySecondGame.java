package lessons17;

import java.util.Scanner;

public class Ex14MySecondGame {
    public static void main(String[] args) {
        //generiryet number ot 1 do n
        //business logic of the game
        //add Scaner

        //System.out.println(generationNumber());
        //compareNumber();
        game();
    }
    private static void game() {
        Scanner input = new Scanner(System.in);
        int digit = generationNumber();
        System.out.println("Kakoe chislo oz 0 do 100");
        int number = input.nextInt();
        System.out.println(compareNumber(number, digit));
        while (number != digit){
            number = input.nextInt();
            System.out.println(compareNumber(number, digit));
        }
        System.out.println("Kaif");
    }
    private static String compareNumber(int number, int digit) {
        if (number == digit) {
            return "bingo";
        } else if (number > digit) {
            return "number>digit";
        } else {
            return "number<digit";
        }
    }

    public static int generationNumber() {
        return (int) (Math.random() * 100);
        // (max-min)+1+min
    }
}
