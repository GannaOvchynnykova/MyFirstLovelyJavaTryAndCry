package lessons19;

public class Massiv02 {
    public static void main(String[] args) {
        //Получив 2 массива int[], a и b, возвращаем true,
        // если они имеют один и тот же первый или последний элемент.
        // Оба массива будут длиной больше, либо равной единице.
        int[] array4 = new int[]{1, 2, 3};
        int[] array5 = new int[]{7, 3};
        int[] array6 = new int[]{7, 3, 2};
        int[] array7 = new int[]{1, 3};
        System.out.println(commonEnd(array4, array5));// → true
        System.out.println(commonEnd(array4, array6));// → false
        System.out.println(commonEnd(array4, array7));// → true
    }

    private static boolean commonEnd(int[] a, int[] b) {
        return (a[0] == b[0]) || a[a.length - 1] == b[b.length - 1];
    }
}
