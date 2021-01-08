package lesson08;

public class HomeWork02 {
    public static void main(String[] args) {
        //Даны целые числа A и B, где B > 0. Вывести B раз число A
        int a = 10;
        int b = 20;
        printA(a, b);
        printA(7, 8);
    }
    public static void printA (int a, int b){
        System.out.println();
        for (int i = 0; i < b; i++){
            System.out.print(a + " ");
        }
    }
}
