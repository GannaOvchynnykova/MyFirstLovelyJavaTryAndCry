package lessons23;

public class Ex18_11array {
    public static void main(String[] args) {
        int [] var1 = new int []{1, 2, 3}; //1 2 0
        int [] var2 = new int []{5, 11, 2}; //2 0 5
        int [] var3 = new int []{7, 0, 0}; // 1 2 1

        System.out.println(sum3(var1));// → 6
        System.out.println(sum3(var2)); //→ 18
        System.out.println(sum3(var3)); //→ 7

        System.out.println(sumNew3(var1));// → 6
        System.out.println(sumNew3(var2)); //→ 18
        System.out.println(sumNew3(var3)); //→ 7
    }

    private static int sum3(int[] input) {
        int sum = input[0] + input[1] + input[2];
                return sum;
    }
    private static int sumNew3(int [] arr){
        int sum = 0;
        for (int i = 0; i < arr.length ; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }
}
