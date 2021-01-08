package lessons20;

public class MassiveHowToPrint {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5, 6};
        printArray(array);
        printArrayForEach(array);
    }

    public static void printArrayForEach(int[] array) {
        for (int elementik : array) { //for each yproschennie
            System.out.print(elementik + ",");
        }
        System.out.println();
    }

    public static void printArray(int[] input) {
        System.out.println("Nachinaem pechatat int massiv");
        System.out.println("Znachenie elementa massiva");
        for (int i = 0; i < input.length; i = i + 10) { //for each yproschennie
            System.out.println(input[i] + ",");
        }
        System.out.println();
    }
}
