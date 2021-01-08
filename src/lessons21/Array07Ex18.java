package lessons21;

import lessons20.MassiveHowToPrint;

public class Array07Ex18 {
    public static void main(String[] args) {
        //Given an array of ints of even length,
        // return a new array length 2 containing the middle two elements from the original array.
        // The original array will be length 2 or more.
        int [] a1 = new int []{1, 2, 3, 4}; //2 3
        int [] a2 = new int []{7, 1, 2, 3, 4, 9}; //2 3
        int [] a3 = new int []{1, 2}; // 1 2
        MassiveHowToPrint.printArrayForEach(makeMiddle(a1));
        MassiveHowToPrint.printArrayForEach(makeMiddle(a2));
        MassiveHowToPrint.printArrayForEach(makeMiddle(a3));
    }

    private static int [] makeMiddle(int[] input) {
        int [] output = new int[2];
        output [0] = input [input.length/2 - 1];
        output [1] = input[input.length/2];
        return output;
    }
}
