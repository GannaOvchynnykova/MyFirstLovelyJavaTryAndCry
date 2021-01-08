package lessons23;

public class HomeWork18_14 {
    public static void main(String[] args) {
        //Given an int array,
        // return a new array with double the length
        // where its last element is the same as the original array,
        // and all the other elements are 0.
        // The original array will be length 1 or more. Note: by default, a new int array contains all 0’s.
        int[] a1 = new int[]{4, 5, 6}; //0 0 0 0 0 6
        int[] a2 = new int[]{1, 2}; //0 0 0 2
        int[] a3 = new int[]{3}; // 0 3
        int[] output1 = makeLast(a1);
        print(output1);
        int[] output2 = makeLast(a2);
        print(output2);
        int[] output3 = makeLast(a3);
        print(output3);
    }

    private static int[] makeLast(int[] array) {
        int[] output = new int[array.length * 2];
        output[output.length-1] = array[array.length-1];
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
