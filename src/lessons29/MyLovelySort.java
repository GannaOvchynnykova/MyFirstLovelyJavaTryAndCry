package lessons29;

import java.util.Arrays;

public class MyLovelySort {
    public static void main(String[] args) {
        int[] arr = new int[]{45, 12, 0, 56, -5, 100, 1000, 7, 4};
        System.out.println(Arrays.toString(arr));
        bubbleSortCount(arr);
        System.out.println(Arrays.toString(arr));
        bubbleSortSwap(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void bubbleSortSwap(int[] input) {
        //boolean swap;
        boolean unsorted = true;
        while (unsorted) {
            unsorted = false;
            for (int i = 0; i < input.length - 1; i++) {
                if (input[i] > input[i + 1]) {
                    int temp = input[i];
                    input[i] = input[i + 1];
                    input[i + 1] = temp;
                    unsorted = true;
                }
            }
        }
    }

    private static void bubbleSortCount(int[] input) {

        int count = 1;
        while (count > 0) {
            count = 0;
            for (int i = 0; i < input.length - 1; i++) {
                if (input[i] > input[i + 1]) {
                    int temp = input[i];
                    input[i] = input[i + 1];
                    input[i + 1] = temp;
                    count++;
                }
            }
        }
    }

}
