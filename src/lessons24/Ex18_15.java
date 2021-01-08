package lessons24;

public class Ex18_15 {
    public static void main(String[] args) {
        //Start with 2 int arrays, a and b, of any length. Return how many of the arrays have 1 as their first element.
        //Начните с двух массивов int, a и b, любой длины. Возвращает, сколько массивов имеют 1 в качестве первого элемента.

        int[] a1 = new int[]{1, 2, 3};
        int[] a2 = new int[]{7, 2, 3};
        int[] a3 = new int[]{1,2};
        int[] a4 = new int[]{1,3};
        int[] a5 = new int[]{1};
        int[] a6 = new int[]{0};
        int[] a7 = new int[]{0, 3};
        int[] a8 = new int[]{2, 3, 4};
        System.out.println(start1(a1, a4)); //2
        System.out.println(start1(a2, a5)); //1
        System.out.println(start1(a3, a6));//1
        System.out.println(start1(a7, a8));//1
    }

    private static int start1(int[] a, int[] b) {
        int count = 0;
        if (a[0] == 1 && a.length != 0){
            count++;
        }
        if (b[0] == 1 && b.length != 0){
            count++;
            //count = count + 1;
            //count += 1;
        }
        return count;
    }
}
