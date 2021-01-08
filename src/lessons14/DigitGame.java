package lessons14;

public class DigitGame {
    public static void main(String[] args) {
        myMagicSum (456);

    }
    private static int myMagicSum(int number) {

        String input = String.valueOf(number);
        System.out.println("Pereveli int v string " + input);
        int size = input.length();
        int result = 0;
        for (int i = 0; i < size; i++){
            int temp = Integer.parseInt(input.substring(0,1));
            System.out.println("Neponytnii int temp " + temp);
            result = result + temp;
            input = input.substring(1);
        }
        return result;
    }
}
