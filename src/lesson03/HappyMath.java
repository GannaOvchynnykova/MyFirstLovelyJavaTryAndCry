package lesson03;

public class HappyMath {
    public static void main(String[] args) {
        findCircleSquare();

        double d1 = 1.0;
        double d2 = 289347329.0;
        double d3 = d1 / d2;
        System.out.println(d3);
    }
    public static void findCircleSquare(){
        int radius = 10;
        final double PI = 3.14;
        double javaPi = Math.PI;
        //final int MAX_TEMP = 16;
        double squareCircle = PI * radius * radius;
        System.out.println("squareCircle" + squareCircle);
        System.out.println("Pi from bibliotek Java " + javaPi);
    }
}
