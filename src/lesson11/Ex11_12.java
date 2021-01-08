package lesson11;

public class Ex11_12 {


    public static void main(String[] args) {
        System.out.println(sortaSum(3, 4));// →7
        System.out.println(sortaSum(9, 4));// →20
        System.out.println(sortaSum(10, 11));// →21
    }

    private static int sortaSum(int a, int b) {
        if (a + b >= 10 && a + b <= 19) {
            return 20;
        } else {
            return a + b;
        }
    }
}
