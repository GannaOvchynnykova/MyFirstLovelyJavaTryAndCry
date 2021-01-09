package lessons25;

import java.util.Scanner;

public class BMI_Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        double weight;
        System.out.println("Enter your body weight in kg: ");
        weight = input.nextInt();
        double height;
        System.out.println("Enter your height in m: ");
        height = input.nextInt();
        System.out.println("Your body mass index: ");
        bodyMassIndex(weight, height);
    }

    private static void bodyMassIndex(double weight, double height) {
        double BMI = (weight / (height * height)) * 1000000;
        BMI = (int) BMI;
        BMI = BMI / 100;
        System.out.println("≈ " + BMI + " kg/m²");
    }
}
