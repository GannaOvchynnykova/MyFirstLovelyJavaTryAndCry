package lessons24;

public class HomeWork18_16 {
    public static void main(String[] args) {
        //Given 2 int arrays, each length 2, return a new array length 4 containing all their elements.
        //Учитывая 2 массива int, каждый длиной 2, верните новый массив длиной 4, содержащий все их элементы.
        int[] a1 = new int[]{1, 2};
        int[] a2 = new int[]{4, 4};
        int[] a3 = new int[]{9, 2};
        int[] a4 = new int[]{3, 4};
        int[] a5 = new int[]{2, 2};
        //int[] a6 = new int[]{3, 4}; = a4
        //plusTwo(a1, a4); //→ [1, 2, 3, 4]
        //plusTwo(a2, a5);//→ [4, 4, 2, 2]
        //plusTwo(a3, a4); //→ [9, 2, 3, 4]
        int[] output1 = plusTwo(a1, a4); //1, 2, 3, 4
        print(output1);
        int[] output2 = plusTwo(a2, a5); //4, 4, 2, 2
        print(output2);
        int[] output3 = plusTwo(a3, a4); //9, 2, 3, 4
        print(output3);
    }

    private static int[] plusTwo(int[] a, int[] b) {
        int[] output = new int[a.length + b.length];
        for (int i = 0; i < a.length; i++) {
            output [i] = a [i];
        }
        for (int i = a.length; i < output.length ; i++) {
            output [i] = b [i - a.length];
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
