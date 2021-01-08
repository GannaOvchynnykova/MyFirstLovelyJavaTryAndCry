package lesson10;

public class HomeWork01 {
    public static void main(String[] args) {
        //Напишите программу, которая находит чётные числа*.
        evenNumbers(10, 100);
    }
    private static void evenNumbers(int a, int b) {
        for (int i = a; i < b; i++) {
            if (i % 2 == 0) {
                System.out.print(" " + i);
            }
        }
    }
}