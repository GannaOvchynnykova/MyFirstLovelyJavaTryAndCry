package lessons25;

public class ElementaryOperation {
    public static void main(String[] args) {
        int[] arr = myLovelyRandom (10);
        myLovelyPrint(arr);
        System.out.println(minElementArray(arr));
        System.out.println(maxElementArray(arr));
        System.out.println("Sum all element of array - " + sumElementArray(arr));
        System.out.println("Middle value of array  - " + middleValueElementInArray(arr));
    }

    private static double middleValueElementInArray(int[] arr) {
        double sum = sumElementArray(arr);
        return sum / arr.length;
    }

    private static int sumElementArray(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr [i];
        }
        return sum;
    }

    private static String maxElementArray(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length ; i++) {
            max = Math.max(arr[i], max);
        }
       return "Max value " + max;
    }

    private static String minElementArray(int[] arr) {
        int min = arr[0];
        for (int j : arr) {
            min = Math.min(j, min);
        }
        return "Min value " + min;

    }

    private static void myLovelyPrint(int[] input) {
        for (int element: input){
            System.out.print(element + " ");
        }
        System.out.println();
    }

    private static int[] myLovelyRandom(int size) {
        int [] result = new int[size];
        for (int i = 0; i < size ; i++) {
            result [i] = (int) (Math.random()*100);
        }
        return result;
    }
}
