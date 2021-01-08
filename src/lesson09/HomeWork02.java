package lesson09;

public class HomeWork02 {
    public static void main(String[] args) {
        System.out.println(nearTen(12));//true
        System.out.println(nearTen(17));//false
        System.out.println(nearTen(19));//true
    }

    private static boolean nearTen(int num) {
        int temp = num % 10;
        return temp <= 2 || temp >=8;
    }
}
