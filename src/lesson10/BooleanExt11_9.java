package lesson10;

public class BooleanExt11_9 {
    public static void main(String[] args) {
        System.out.println(maxMod5(2, 3));// → 3
        System.out.println(maxMod5(6, 2));// → 6
        System.out.println(maxMod5(3, 2));// → 3
    }

    private static int maxMod5(int valueOne, int valueTwo) {
        int min = Math.min(valueOne, valueTwo);
        int max = Math.max(valueOne, valueTwo);

        if (valueOne > valueTwo){
            min = valueTwo;
            max = valueOne;
        }else {
            min = valueOne;
            max = valueTwo;
        }

        if (valueOne == valueTwo){
            return 0;
        }else if (valueOne % 5 == valueTwo % 5){
            return min;
        }else {
            return max;
        }
    }
}
