package lesson11;

public class Ex11_14 {
    public static void main(String[] args) {
        System.out.println(old35(3));// → true
        System.out.println(old35(10));// → true
        System.out.println(old35(15));// → false
        split();
        System.out.println(teenSum(3, 4));// → 7
        System.out.println(teenSum(10, 13));// → 19
        System.out.println(teenSum(13, 2));// → 19
    }
    private static int teenSum(int a, int b) {
        if ((a >= 13 && a <= 19) || (b > 12 && b < 20)) {
            return 19;
        }else{
            return a + b;
        }
    }
    public static void split() {
        System.out.println("________________________");
    }
    private static boolean old35(int number) {
        return number % 3 == 0 ^ number % 5 == 0;
    }

}
