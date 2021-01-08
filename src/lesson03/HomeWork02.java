package lesson03;

public class HomeWork02 {
    public static void main(String[] args) {
        //Given a radius circle 21;
        //Given PI = 3.14;
        //Find long of circle;
        findLongWithRadius();
        findLongWithDiameter();

        System.out.println(giveMelengthCircle(45.5));
        System.out.println(giveMelengthCircle(6));
    }
    public static double giveMelengthCircle(double radius){
        double pi = 3.14;
        double length = 2 * pi * radius;
        return length;
    }
    public static void giveMeLengthCircle (double radius){
        double pi = 3.14;
        double length = 2 * pi * radius;
        System.out.println(length);;
    }
    public static void findLongWithRadius(){
        int radius = 21;
        final double PI = 3.14;
        double javaPI = Math.PI;
        double longWithRadius = 2 * PI * radius;
        System.out.println("Long with radius " + longWithRadius);
        System.out.println("PI from Java " + javaPI);
    }
    public static void findLongWithDiameter(){
        int radius = 21;
        int diameter = radius + radius;
        final double PI = 3.14;
        double javaPI = Math.PI;
        double LongWithDiameter = diameter * PI;
        System.out.println("Diameter of the Circle " + diameter);
        System.out.println("Long with diameter " + LongWithDiameter);
    }
}


