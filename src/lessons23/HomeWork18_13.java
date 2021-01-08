package lessons23;

public class HomeWork18_13 {
    public static void main(String[] args) {
        //Given an array of ints,
        // return a new array length 2 containing the first and last elements from the original array.
        // The original array will be length 1 or more.
        //вернуть новый массив длиной 2, содержащий первый и последний элементы из исходного массива.
        // Исходный массив будет иметь длину 1 или более.
        int[] a1 = new int[]{1, 2, 3}; //1 3
        int[] a2 = new int[]{1, 2, 3, 4}; //1 4
        int[] a3 = new int[]{7, 4, 6, 2}; // 7 2
        int[] output1 = makeEnds(a1);
        print(output1);
        int[] output2 = makeEnds(a2);
        print(output2);
        int[] output3 = makeEnds(a3);
        print(output3);
    }

    private static int[] makeEnds(int[] array) {
        int[] output = new int[2];
        output[0] = array[0];
        output[1] = array[array.length - 1];
        return output;
    }

    private static void print(int[] array) {
        System.out.print("[ ");
        for (int i = 0; i < array.length - 1; i++) {
            System.out.print((array[i]) + ", ");
        }
        System.out.print((array[array.length - 1]));
        System.out.println(" ]");
    }
}
