package lessons19;

public class HowToPrintIntArray {
    public static void main(String[] args) {
        int[] a1 = new int[]{3, 4, 6, 7};
        myPrint(a1);
    }

    private static void myPrint(int[] array) {
        System.out.println("Int massiv po adresy" + array + "imeet snachenie: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + ", ");
        }
        System.out.println("Rasspechatat");
    }
}
