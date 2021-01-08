package lesson10;

public class BooleanEx11_8 {
    public static void main(String[] args) {
        System.out.println(lastDigit(23, 19, 13));// → true
        System.out.println(lastDigit(23, 19, 12));// → false
        System.out.println(lastDigit(23, 19, 3)); //→ true
    }

    private static boolean lastDigit(int a, int b, int c) {
        return a % 10 == b % 10 || b % 10 == c % 10 || c % 10 == a % 10;
    }
    public static void split (){
        System.out.println("=================");
    }

}
