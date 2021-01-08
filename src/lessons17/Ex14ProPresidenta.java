package lessons17;

import java.util.Scanner;

public class Ex14ProPresidenta {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int quantity;
        System.out.println("Vvedite kolvo golosov");
        quantity = input.nextInt();
        if (quantity >50){
            System.out.println("Pobeda");
        }else {
            System.out.println("Proigral");
        }
    }
}
