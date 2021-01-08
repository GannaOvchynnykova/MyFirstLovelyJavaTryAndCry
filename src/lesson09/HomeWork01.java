package lesson09;

public class HomeWork01 {
    public static void main(String[] args) {
        System.out.println(more20(20)); //false
        System.out.println(more20(21));//true
        System.out.println(more20(22));//true
    }
    private static boolean more20(int number) {
        int temp = number%20;
        // return temp == 1 || temp == 2;
        //return temp > 0 && temp < 3;
        if (temp - 1 == 0 || temp - 2 ==0){
            return true;
        }else {
           return false;
        }
    }
}
