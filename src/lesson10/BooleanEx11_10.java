package lesson10;

public class BooleanEx11_10 {


    public static void main(String[] args) {
        System.out.println(blueTicket(9, 1, 0));// → 10
        System.out.println(blueTicket(9, 2, 0));// → 0
        System.out.println(blueTicket(6, 1, 4));// → 10
    }

    private static int blueTicket(int a, int b, int c) {
    int ab = a + b;
    int bc = b + c;
    int ac = a + c;
    if (ab == 10 || bc == 10 || ac == 10){
        return 10;
    }else if (ab == bc + 10 || ab == ac + 10){
        return 5;
    }else {
        return 0;
    }
    }
    }
