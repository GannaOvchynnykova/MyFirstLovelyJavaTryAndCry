package lessons15.magicTest;

public class LoopForExercise {
    public static int multiply(int a, int b) {
        //for
        int result = 0;
        for (int i = 0; i < b; i++) {
            result = result + a;
        }
        return result;
    }
    public static int multiplyThree(int a, int b) {
        //while dymaem potom delaem
        int result = 0;
        int count = 0;
        while (count < b) {
            result = result + a;
            count++;
        }
        return result;
    }
    public static int multiplyTwo(int a, int b) {
        //do while delaem potom dymaem Fus
        int result = 0;
        int count = 0;
        do {
            result = result + a;
            count++;
        }while (count<b);
        return result;
    }
    public static void myInt() {
        int a = 6;
        a = a + 7;
        a = a + 4;
        a = a + 9;
    }
    public static void draw(int number) {


    }
}
