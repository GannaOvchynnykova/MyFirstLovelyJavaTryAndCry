package lessons16;

public class HomeWork01_Bricks {
    public static void main(String[] args) {
        //We have a number of small bricks (1 inch each)
        // and big bricks (5 inches each).
        System.out.println(makeBricks(3, 1, 8));// → true
        System.out.println(makeBricks(3, 1, 9)); //→ false
        System.out.println(makeBricks(3, 2, 10)); //→ true
        System.out.println(makeBricks(3, 2, 9)); //→ false
    }

    private static boolean makeBricks(int smallCount, int bigCount, int goal) {
        return smallCount + bigCount * 5 == goal || smallCount == goal || bigCount * 5 == goal;
    }
}
