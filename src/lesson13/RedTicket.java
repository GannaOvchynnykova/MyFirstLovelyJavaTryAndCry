package lesson13;

public class RedTicket {
    public static void main(String[] args) {
        System.out.println(redTicket(2, 2, 2));// → 10
        System.out.println(redTicket(2, 2, 1));// → 0
        System.out.println(redTicket(0, 0, 0));// → 5
        System.out.println(redTicket(0, 1, 2));// → 1
    }

    private static int redTicket(int a, int b, int c) {
        if (a == b && b == c && c == 2){
            return 10;
        }else if (a == b && b == c && c != 2){
            return 5;
        }else if (a != b && a != c){
            return 5;
        }else {
            return 0;
        }
    }
}
