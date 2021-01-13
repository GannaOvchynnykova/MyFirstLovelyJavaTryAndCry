package lessons27;

public class HomeWorkLessons27 {
    public static void main(String[] args) {
        //Given 2 int values greater than 0, return whichever value is nearest to 21 without going over.
        // Return 0 if they both go over.
        //Учитывая 2 значения типа int больше 0, верните любое значение, ближайшее к 21, не переходя за него.
        // Верните 0, если они оба перейдут.
        System.out.println(blackjack(19, 21));// → 21
        System.out.println(blackjack(21, 19));// → 21
        System.out.println(blackjack(19, 22));// → 19
        System.out.println(blackjack(22, 22));// → 0
        //Return a version of the given string, where for every star
        // () in the string the star and the chars immediately to its left and right are gone.
        // So "abcd" yields "ad" and "ab**cd" also yields "ad".
        System.out.println(starOut("ab*cd"));// → "ad"
        System.out.println(starOut("ab**cd"));// → "ad"
        System.out.println(starOut("sm*eilly"));// → "silly"
        //Return the number of times that the string "hi" appears anywhere in the given string.
        System.out.println(countHi("abc hi ho"));// → 1
        System.out.println(countHi("ABChi hi"));// → 2
        System.out.println(countHi("hihi"));// → 2
        //Given 3 int values, a b c, return their sum.
        // However, if one of the values is the same as another of the values, it does not count towards the sum.
        System.out.println(loneSum(1, 2, 3));// → 6
        System.out.println(loneSum(3, 2, 3));// → 2
        System.out.println(loneSum(3, 3, 3));// → 0
    }

    private static int loneSum(int a, int b, int c) {
        int sum = a + b + c;
        if (a == b && b == c) sum = 0;
        else if (a == b) sum = c;
        else if (a == c) sum = b;
        else if (c == b) sum = a;
        return sum;
    }

    private static int countHi(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == 'h' && str.charAt(i + 1) == 'i') {
                count++;
            }
        }
        return count;
    }

    private static String starOut(String input) {
        String output = "";
        char star = '*';
        if (input.charAt(0) != star && input.charAt(1) != star) {
            output += input.charAt(0);
        }
        for (int i = 1; i < input.length() - 1; i++) {
            if (input.charAt(i) != star && input.charAt(i - 1) != star && input.charAt(i + 1) != star) {
                output += input.charAt(i);
            }
        }
        if (input.charAt(input.length() - 1) != star &&
                input.charAt(input.length() - 2) != star) {
            output += input.charAt(input.length() - 1);
        }
        return output;
    }

    private static int blackjack(int a, int b) {
        if (a > 21) a = 0;
        if (b > 21) b = 0;
        return Math.max(a, b);
    }
}
