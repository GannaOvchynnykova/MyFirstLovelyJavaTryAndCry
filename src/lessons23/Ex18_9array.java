package lessons23;

public class Ex18_9array {
    public static void main(String[] args) {
        //We'll say that a 1 immediately followed by a 3 in an array is an "unlucky" 1.
        // Return true if the given array contains an unlucky 1 in the first 2 or last 2 positions in the array.
        int[] ar1 = new int[]{1, 3, 4, 5};
        int[] ar2 = new int[]{2, 1, 3, 4, 5};
        int[] ar3 = new int[]{1, 1, 1};
        System.out.println(unlucky1(ar1)); //true
        System.out.println(unlucky1(ar2));//true
        System.out.println(unlucky1(ar3)); //false
    }

    private static boolean unlucky1(int[] array) {
        if (array[0] == 1 && array[1] == 3) {
            return true;
        }
        if (array[1] == 1 && array[2] == 3) {
            return true;
        }
        if (array[array.length - 2] == 1 && array[array.length - 1] == 3) {
            return true;
        }
        return false;
    }
}
