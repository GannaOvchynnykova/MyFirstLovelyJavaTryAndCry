package lessons17;

import java.util.Scanner;

public class HomeWork02 {
    public static void main(String[] args) {
        //Напишите программу, которая принимает из "сканера" возраст человека в строке и отдаёт его в вашу переменную
        //int. В четвёртой главе(char, String) мы коротко рассматривали один из способов передачи такой информации.
        System.out.println(verniVozrast());
    }
    public static String prinimaiVozrast(){
        Scanner input = new Scanner(System.in);
        System.out.println("How old are you?: ");
        String age;
        age = input.next();
        System.out.println("You are " + age);
        return age;
    }

    private static int verniVozrast() {
        int myAge = Integer.parseInt(prinimaiVozrast());
        return myAge;
    }

}
