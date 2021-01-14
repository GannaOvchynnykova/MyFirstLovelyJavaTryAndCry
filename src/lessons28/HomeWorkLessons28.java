package lessons28;

import java.util.Arrays;

public class HomeWorkLessons28 {
    public static void main(String[] args) {
        System.out.println(roundSum(16, 17, 18));// → 60
        System.out.println(roundSum(12, 13, 14));// → 30
        System.out.println(roundSum(6, 4, 4));// → 10

        System.out.println(endOther("Hiabc", "abc"));// → true
        System.out.println(endOther("AbC", "HiaBc"));// → true
        System.out.println(endOther("abc", "abXabc"));// → true

        int[] array = makePI(3);
        System.out.println("Our array " + Arrays.toString(array));
    }

    private static int[] makePI(int size) {
        int[] output = new int[size];
        output[0] = (int) (Math.PI);
        output[1] = (int) (((Math.PI * 100)) / 10) % 10;
        output[2] = (int) ((Math.PI * 100)) % 10;
        return output;
    }

    private static boolean endOther(String word, String end) {
        return (word.toLowerCase().endsWith(end.toLowerCase())
                || (end.toLowerCase().endsWith(word.toLowerCase())));
    }

    private static int roundSum(int a, int b, int c) {
        return round10(a) + round10(b) + round10(c);
    }

    private static int round10(int num) {
        int temp = num % 10;
        if (temp < 5) {
            num = num - temp;
        } else {
            num = num - temp + 10;
        }
        return num;
    }
}
