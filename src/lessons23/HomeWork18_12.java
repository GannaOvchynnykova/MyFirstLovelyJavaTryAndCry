package lessons23;

public class HomeWork18_12 {
    public static void main(String[] args) {
        //Given an array of ints length 3,
        // figure out which is larger, the first or last element in the array,
        //and set all the other elements to be that value. Return the changed array.
        int[] a1 = new int[]{1, 2, 3};
        int[] a2 = new int[]{11, 5, 9};
        int[] a3 = new int[]{2, 11, 3};

        int[] output1 = maxEnd3(a1);
        print(output1);
        int[] output2 = maxEnd3(a2);
        print(output2);
        int[] output3 = maxEnd3(a3);
        print(output3);

        maxEnd3Test();
    }

    private static void maxEnd3Test() {
        int [] testArray1 = new int[]{3, 3, 3};
        int [] testArray2 = new int[]{11, 11, 11};
        int [] testArray3 = new int[]{3, 3, 3};

        int[] a1 = new int[]{1, 2, 3};
        int[] a2 = new int[]{11, 5, 9};
        int[] a3 = new int[]{2, 11, 3};

            if (testArray1[0] == maxEnd3(a1)[0] &&
                    testArray1[1] == maxEnd3(a1)[1] &&
                    testArray1[2] == maxEnd3(a1)[2]){
                System.out.println("Test good");
            }else {
                System.out.println("Proval");
            }
        }


    private static int[] maxEnd3(int[] array) {
        int[] output = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            if (array[0] > array[2]) {
                output[i] = array[0];
            }
            if (array[2] > array[0]) {
                output[i] = array[2];
            }
        }
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
    //maxElement = (array[2] > array [0] ? array [2]: array[0] --- elvis
    // number = (yslovie) :
}
