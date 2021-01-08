package lesson12;

public class HomeWork02 {
    public static void main(String[] args) {
        //a b c, верните true, если одно из них на 10 или более меньше, чем одно из других.
        System.out.println(lessBy10(1, 7, 11));// → true
        System.out.println(lessBy10(1, 7, 10)); //→ false
        System.out.println(lessBy10(11, 1, 7));// → true

    }

    /*private static boolean lessBy10(int a, int b, int c) {
        if (a <= b - 10 || a <= c - 10) {
            return true;
        }else if (b<= a - 10 || b <= c - 10){
            return true;
            } else if (c <= a - 10 || c <= b - 10){
            return true;
        }
        return false;
    }
    }*/
    private static boolean lessBy10(int a, int b, int c) {
        return Math.abs(a-b) >= 10 || Math.abs(b - c) >= 10 || Math.abs(c - a) >= 10;
    }
}
