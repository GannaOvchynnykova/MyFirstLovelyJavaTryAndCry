package lessons28;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Exercise {
    public static void main(String[] args) {
        prostoeChislo(1, 100);
        //2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89,.97..
        //myLovelyArray();
        int size = 10;
        int[] array = createArray(10);
        int max = findMax(array);
        int min = findMin(array);
        int sum = findSum(array);
        int middle = sum / array.length;
        System.out.println("Our array " + Arrays.toString(array));
        System.out.println("Max value " + max);
        System.out.println("Min value " + min);
        System.out.println("Sum element " + sum);
        System.out.println("Middle value " + middle);
    }

    private static int findSum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        return sum;
    }

    private static int findMin(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            min = Math.min(min, array[i]);
        }
        return min;
    }

    private static int findMax(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            max = Math.max(max, array[i]);
        }
        return max;
    }

    private static int[] createArray(int size) {
        int[] output = new int[size];
        for (int i = 0; i < size; i++) {
            output[i] = (int) (Math.random() * 100);
        }
        return output;
    }

    private static void prostoeChislo(int a, int b) {
        for (int i = a; i < b; i++) {
            if (primeNumber(i)) {
                System.out.print(i + ", ");
            }
        }
        System.out.println();
    }

    private static boolean primeNumber(int number) {
        if (number == 0) {
            return false;
        }
        if (number == 1) {
            return true;
        }
        //int count = 0;
        boolean flag = false;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                //count++;
                flag = true;
            }
        }
        //if (count > 0) {
        //return false;
        //}
        if (flag) {
            return false;
        }
        return true;
    }
}
