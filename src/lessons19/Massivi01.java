package lessons19;

public class Massivi01 {
    public static void main(String[] args) {
        //Дан массив int.
        //Верните true, если цифра 6 является значением в первом или последнем элементе массива.
        //Массив будет длиной больше, либо равной единице.

        int []array1 = new int[]{1, 2, 6};
        System.out.println(firstLast6(array1));// → true
        int []array2 = new int[]{6, 1, 2, 3};
        System.out.println(firstLast6(array2));// → true
        int []array3 = new int[]{13, 6, 1, 2, 3};
        System.out.println(firstLast6(array3));// → false
    }

    private static boolean firstLast6(int[] input) {
        return input[0] == 6 || input[input.length - 1] == 6;
    }
}
