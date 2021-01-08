package lessons16;

public class HomeWork04 {
    public static void main(String[] args) {
        //Реализовать метод, который принимает целое положительное число. Метод должен выводить на экран все
        //положительные числа, на которые заданное число делится без остатка и отображает количество найденных
        //делителей.
        positivNumber(32);
    }
    public static void positivNumber(int number) {
        int count = 0;
        //for (int i = number; i > 0; i--) {  v obratnom porydke
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
                System.out.println(i + "");
            }
        }
        System.out.println();
        System.out.println("количество найденных делителей: " + count);
    }
}

