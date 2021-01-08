package lesson12;

public class HomeWork05 {
    public static void main(String[] args) {
        System.out.println(middleThree("Candy"));// → "and"
        System.out.println(middleThree("and"));// → "and"
        System.out.println(middleThree("solving"));// → "lvi"
    }

    private static String middleThree(String input) {
        int middle = input.length() / 2;
        String output = input.substring(middle -1, middle +2);
        return output;
    }
}
