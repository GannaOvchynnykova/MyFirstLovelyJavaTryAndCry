package lessons20;

public class HomeWork022 {
    public static void main(String[] args) {
        printSumRub(1, 5);
    }

    private static void printSumRub(int a, int b) {
        for (int i = a; i < b; i++) {
            System.out.println("polycheno " + i + formatRub(i));

        }
    }

    private static String formatRub(int rub) {
        String output = "";
        if (rub > 10 && rub < 15) {
            output = "rublei";
        } else if (rub % 10 == 1) {
            output = "rubl";
        } else if (rub % 10 == 2 || rub % 10 == 3 || rub % 10 == 4) {
            output = "rubly";
        } else {
            output = "rublei";
        }
        return output;
    }
}
