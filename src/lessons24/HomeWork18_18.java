package lessons24;

public class HomeWork18_18 {
    public static void main(String[] args) {
        //Given 2 int arrays, a and b,
        // return a new array length 2 containing,
        // as much as will fit, the elements from a followed by the elements from b.
        // The arrays may be any length, including 0,
        // but there will be 2 or more elements available between the 2 arrays.
        //Учитывая 2 массива int, a и b,
        // верните новый массив длиной 2,
        // содержащий, элементы из a, за которыми следует элементы из б.
        // Массивы могут быть любой длины, включая 0, но между двумя массивы.

        int[] a1 = new int[]{4, 5};
        int[] a2 = new int[]{1, 2, 3};
        int[] a3 = new int[]{4};
        int[] a4 = new int[]{1, 2, 3};
        int[] a5 = new int[]{};
        int[] a6 = new int[]{1, 2};

        int[] output1 = make2(a1, a2); //4, 5
        print(output1);
        int[] output2 = make2(a3, a4); //4, 1
        print(output2);
        int[] output3 = make2(a5, a6); //1, 2
        print(output3);
    }

    private static int[] make2(int[] a, int[] b) {
        int[] output = new int[2];
        if (a.length >=2){
            output[0] = a[0];
            output[1] = a[1];
        }
        else if (a.length == 1) {
            output[0] = a[0];
            output[1] = b[0];
        } else {
            output[0] = b[0];
            output[1] = b[1];
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
}
