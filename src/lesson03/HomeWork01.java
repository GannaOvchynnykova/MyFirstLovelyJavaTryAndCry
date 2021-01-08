package lesson03;

public class HomeWork01 {
    public static void main(String[] args) {
        //Given a radius circle 13;
        //Given PI = 3.14;
        //Find area of circle;
        findAreaWithRadius();
        findAreaWithDiameter();
        System.out.println();
    }
    public static void findAreaWithRadius(){
        int radius = 13;
        final double PI = 3.14;
        double javaPI = Math.PI;
        double AreaOfCircle = PI * radius * radius;
        System.out.println("Area of the Circle " + AreaOfCircle);
        System.out.println("PI from Java " + javaPI);
    }
    public static void findAreaWithDiameter(){
        int radius = 13;
        int diameter = radius + radius;
        final double PI = 3.14;
        double javaPI = Math.PI;
        double AreaOfCircleD = diameter * diameter / 4 * PI;
        System.out.println("Diameter of the Circle " + diameter);
        System.out.println("Area of the Circle D " + AreaOfCircleD);
    }
    public static double areaOfCircle (double radius){
        double pi = 3.14;
        double area = pi * radius * radius;
        return area;

    }
}
