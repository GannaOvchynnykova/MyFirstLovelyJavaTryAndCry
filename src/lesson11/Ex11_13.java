package lesson11;

public class Ex11_13 {
    public static void main(String[] args) {
        System.out.println("Zadacha inIto10 given result = " + in1To10(5, false));// → true
        System.out.println("Zadacha inIto10 given result = " + in1To10(11, false));//→ false
        System.out.println("Zadacha inIto10 given result = " + in1To10(11, true));// → true
    }

    private static boolean in1To10(int n, boolean outsideMode) {
        //return (n <= 1 || n >= 10) && externalMode || n >= 1 && n <= 10 && !externalMode;!!!!!!!!!!!!!!!!!!
        if (n >= 1 && n <= 10) {
            return true;
        } else if (outsideMode) {
            return true;
        } else {
            return false;
        }
    }
}
