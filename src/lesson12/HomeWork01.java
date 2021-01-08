package lesson12;

public class HomeWork01 {
    public static void main(String[] args) {
        //Даны три целых числа, a b c, вернуть true, если b больше a,
        // а c больше b.
        // Однако, за исключением того, что если "bOk" правда, b не обязательно должно быть больше a.
        System.out.println(inOrder(1, 2, 4, false));// → true
        System.out.println(inOrder(1, 2, 1, false));// → false
        System.out.println(inOrder(1, 1, 2, true));// → true
    }

    private static boolean inOrder(int a, int b, int c, boolean bOk) {
        return (b > a && c > b) ^ bOk;
    }
}
