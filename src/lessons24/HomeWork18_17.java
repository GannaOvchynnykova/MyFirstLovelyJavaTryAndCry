package lessons24;

public class HomeWork18_17 {
    public static void main(String[] args) {
        //Given an array of ints of odd length,
        // look at the first, last, and middle values in the array
        // and return the largest.
        // The array length will be a least 1.
        //Учитывая массив целых чисел нечетной длины,
        // посмотрите на первое, последнее и среднее значения в массиве и верните наибольшее.
        // Массив длина будет не меньше 1.

        int[] a1 = new int[]{1, 2, 3};
        int[] a2 = new int[]{1, 5, 3};
        int[] a3 = new int[]{5, 2, 3};
        System.out.println(maxTriple(a1)); //3
        System.out.println(maxTriple(a2)); //5
        System.out.println(maxTriple(a3)); //5
    }

    private static int maxTriple(int[] array) {
        if (array[array.length / 2] > array[0] && array[array.length / 2] > array[array.length - 1]) {
            return array[array.length / 2];
        } else if (array[0] > array[array.length - 1] && array[0] > array[array.length / 2]) {
            return array[0];
        } else {
            return array[array.length - 1];
        }
    }
}
