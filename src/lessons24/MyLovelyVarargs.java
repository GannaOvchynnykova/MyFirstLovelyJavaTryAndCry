package lessons24;

public class MyLovelyVarargs {
    public static void main(String[] args) {
        //System.out.println(addition(2, 3, 6));
        //int [] arr = new int [] {2, 3, 4, 5};
        //System.out.println("Summa " + findArrayAum(arr));
        int [] var = new int [] {2, 3, 4, 5};
        sum();
        sum(2,3);
    }

    private static int sum(int ... varArgs) {
        int mySum = 0;
        for (int i = 0; i < varArgs.length ; i++) {
            mySum = mySum + varArgs [i];
        }
        return 0;
    }

    private static int findArrayAum(int[] arr) {
        int sum = 0;
        for (int element: arr
             ) {
            sum += element;
        }
        return sum;
    }

    private static int addition(int x, int y, int z) {
        return x + y + z;
    }
}
