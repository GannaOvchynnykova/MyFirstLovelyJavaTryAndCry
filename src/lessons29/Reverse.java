package lessons29;

public class Reverse {
    public static void main(String[] args) {
        System.out.println(simpleNumberRevers(546));
        System.out.println(simpleNumberRevers(5789));
        System.out.println(simpleNumberRevers(123));
    }

    private static int simpleNumberRevers(int number) {
        String temp = String.valueOf(number);
        String tempRevers = reverse(temp);
        int result = Integer.parseInt(tempRevers);
        return result;
    }

    private static String reverse(String input) {
        String output = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            output = output + input.charAt(i);
        }
        return output;
    }
}
