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
        if (BMI <= 16){
            System.out.println("Severe underweight");
        }
        if (BMI > 16 && BMI <= 18.5){
            System.out.println("Insufficient (deficiency) body weight");
        }
        if (BMI > 18.5 && BMI <= 25){
            System.out.println("Norm");
        }
        if (BMI > 25 && BMI <= 30){
            System.out.println("Overweight (pre-obesity)");
        }
        if (BMI > 30 && BMI <= 35){
            System.out.println("Obesity");
        }
        if (BMI > 35 && BMI <= 40){
            System.out.println("Obesity is sharp");
        }
        if (BMI > 40) {
            System.out.println("Very severe obesity");
        }
    }
}
