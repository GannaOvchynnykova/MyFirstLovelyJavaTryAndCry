package lessons16;

public class HomeWork02 {
    public static void main(String[] args) {
        //Given a string, return a string where for every char in the original, there are two chars.
        System.out.println(doubleChar("The"));// → "TThhee"
        System.out.println(doubleChar("AAbb"));// → "AAAAbbbb"
        System.out.println(doubleChar("Hi-There"));// → "HHii--TThheerree"
    }

    private static String doubleChar(String str) {
        String output = "";
        for (int i = 0; i < str.length(); i++) {
            //output = output + str.charAt(i) + str.charAt(i);
            output = output + nTimesRepeat(str.charAt(i), 2);
        }
        return output;
    }

    private static String nTimesRepeat(char symbol, int times) {
        String result = "";
        for (int i = 0; i < times; i++) {
            result = result + symbol;
        }
        return result;
    }
}
