package lessons21;

import lessons20.MassiveHowToPrint;

public class MidThreeArrayHome2021 {
    public static void main(String[] args) {
        //Given an array of ints of odd length,
        // return a new array length 3 containing the elements from the middle of the array.
        // The array length will be at least 3.
        int[] a1 = new int[]{1, 2, 3, 4, 5}; //2 3 4
        int[] a2 = new int[]{8, 6, 7, 5, 3, 0, 9}; //7 5 3
        int[] a3 = new int[]{1, 2, 3}; // 1 2 3
        final String ANSI_PURPLE = "\u001B[35m";
        final String ANSI_RED = "\u001B[31m";
        final String ANSI_BLUE = "\u001B[34m";
        final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
        System.out.println(ANSI_GREEN_BACKGROUND);
        System.out.println(ANSI_BLUE);
        myColorPrintIntArray(midThree(a1));// [2, 3, 4]
        System.out.println(ANSI_PURPLE);
        myColorPrintIntArray(midThree(a2));//[7, 5, 3]
        System.out.println(ANSI_RED);
        myColorPrintIntArray(midThree(a3));// [1, 2, 3]
    }

    private static int[] midThree(int[] input) {
        int[] output = new int[3];
        output[0] = input[input.length / 2 - 1];
        output[1] = input[input.length / 2];
        output[2] = input[input.length / 2 + 1];
        return output;
    }

    public static void myColorPrintIntArray (int[] input){
        System.out.print("[ ");
        for (int i = 0; i < input.length - 1; i++) {
            System.out.print(input [i] + ", ");
        }
        System.out.println(input[input.length-1] + " ]");
    }
}
