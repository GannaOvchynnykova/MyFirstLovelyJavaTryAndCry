package lessons25;

import java.util.Arrays;

public class MultiArrays {
    public static void main(String[] args) {
        int[][][][][] myLovelyArr = new int[5][][][][];
        //intro();
        //introTwo();
        //introThree();
        //introFour();
        intro5();
    }

    private static void intro5() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        String myTestString = Arrays.toString(arr);
        System.out.println(myTestString);

        // System.out.println(Arrays.toString(arr));
    }

    private static void introFour() {
        int[][] example = {
                {1},
                {1, 2},
                {1, 2, 3},
                {1, 2, 3, 4},
                {1, 2, 3, 4, 5},
        };
        printTwoArray(example);
    }

    private static void printTwoArray(int[][] input) {
        int[][] var = new int[5][]; // eto 2mernii array s 5 strokami
        var[0] = new int[1];
        var[1] = new int[2];
        var[2] = new int[3];
        var[3] = new int[4];
        var[4] = new int[5];

        for (int[] myLineArray : input) {
            for (int lineElement : myLineArray) {
                System.out.print(lineElement + " ");
            }
            System.out.println();
        }
    }

    private static void introTwo() {
        int[][][] arr = new int[5][10][1000];
        int[] myLovelyArray = {1, 2, 3, 4, 5};
        byte[][][] byteArray = {
                {
                        {0, 1, 2},
                        {0, 1, 2},
                        {0, 1, 2},
                },
                {
                        {0, 1, 2},
                        {0, 1, 2},
                        {0, 1, 2},
                }
        };
    }

    private static void intro() {
        String[][] myArray = new String[5][3];

        myArray[0][0] = "1";
        myArray[0][1] = "Mitenka";
        myArray[0][2] = "%48759879";

        myArray[1][0] = "2";
        myArray[1][1] = "Sidor";
        myArray[1][2] = "%68765765";

        myArray[2][0] = "3";
        myArray[2][1] = "Vasechkin";
        myArray[2][2] = "&875945";

        myArray[3][0] = "4";
        myArray[3][1] = "Petenkin";
        myArray[3][2] = "&6768775";

        myArray[4][0] = "5";
        myArray[4][1] = "Ivanov";
        myArray[4][2] = "%675765";
        printTwoDString(myArray);
    }

    private static void printTwoDString(String[][] table) {
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                System.out.print(table[i][j] + "  \t");
            }
            System.out.println();
        }
    }
}
