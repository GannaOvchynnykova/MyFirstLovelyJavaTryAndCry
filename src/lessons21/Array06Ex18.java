package lessons21;

import lessons20.MassiveHowToPrint;

public class Array06Ex18 {
    public static void main(String[] args) {
        //Given an int array length 3,
        // if there is a 2 in the array immediately followed by a 3, set the 3 element to 0.
        // Return the changed array.
        int [] a1 = new int []{1, 2, 3}; //1 2 0
        int [] a2 = new int []{2, 3, 5}; //2 0 5
        int [] a3 = new int []{1, 2, 1}; // 1 2 1

        MassiveHowToPrint.printArrayForEach(fix23(a1));
        MassiveHowToPrint.printArrayForEach(fix23(a2));
        MassiveHowToPrint.printArrayForEach(fix23(a3));
    }

    private static int[] fix23(int[] input) {
        if (input [0] == 2 && input [1] == 3){
            input [1] = 0; // prisvoit
        } else if (input[1] == 2 && input [2] == 3){
            input [2] = 0;
        }
        return input;
    }
}
