package lesson10;

public class HomeWork02 {
    public static void main(String[] args) {
            //Напишите программу, которая находит not чётные числа*.
            notEvenNumbers(10, 100);
        }
        private static void notEvenNumbers(int a, int b) {
            for (int i = a; i < b; i++) {
                if (i % 2 > 0) {
                    System.out.print(" " + i);
                }
            }
        }
    }

