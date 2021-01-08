package lessons17;

import java.util.Scanner;

public class HomeWork01 {
    //Напишите программу, которой надо представиться. Данные, которые спрашивает машина: имя, фамилия, пол,
    //возраст, e-mail. Для считывания данных типа String используйте метод next(): input.next()
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your name?: ");
        String customerName;
        customerName = input.next();

        System.out.println("What is your last name?: ");
        String customerLastName;
        customerLastName = input.next();
        System.out.println("What gender are you?: ");
        String gender;
        gender = input.next();
        int age;
        System.out.println("How old are you?: ");
        age = input.nextInt();
        System.out.println("What´s your email?: ");
        String email;
        email = input.next();
        System.out.println("Thank you " + customerName + " " + customerLastName + "! " + "\n" +
                "You are " + gender + " and you are " + age + "\n" + "Your email " + email);

    }
}
