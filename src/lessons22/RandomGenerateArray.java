package lessons22;

import lessons21.MidThreeArrayHome2021;

public class RandomGenerateArray {
    public static void main(String[] args) {
        int[] array = generateIntArray();
        MidThreeArrayHome2021.myColorPrintIntArray(generateIntArray());

    }

    private static int[] generateIntArray() {
        int randomLength = randomGenerate(25);//(int) (Math.random() * 25); //naprimer 25
        System.out.println(randomLength);
        int [] output = new int[randomLength];

        for (int i = 0; i < output.length; i++) {
            output [i] = randomGenerate(25);
        }

        return output;
    }

    private static int randomGenerate(int size) {
        int myValue = (int) (Math.random() * size);
        if (myValue < 5){
            myValue = 4;
        }
        return myValue;
    }
}
