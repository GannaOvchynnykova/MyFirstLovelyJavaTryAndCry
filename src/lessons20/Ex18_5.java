package lessons20;

public class Ex18_5 {
    public static void main(String[] args) {
        //Given an int array length 2, return true if it does not contain a 2 or 3.
        //Учитывая длину массива int 2, верните true, если он не содержит 2 или 3.
        int[] c1 = new int[]{4, 5};
        int[] c2 = new int[]{4, 2};
        int[] c3 = new int[]{3, 5};
        System.out.println(no23(c1));// → true
        System.out.println(no23(c2));// → false
        System.out.println(no23(c3));// → false
    }

    private static boolean no23(int[] array) {
        return (array[0] != 3) && (array[0] != 2) && array[1] != 3 && array[1] != 2;
    }
}
