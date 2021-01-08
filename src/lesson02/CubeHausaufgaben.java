package lesson02;

public class CubeHausaufgaben {
    public static void main(String[] args) {
        //Given a cube with a side 13;
        //Find perimeter and area;
        //int a = 13;
        findPerimeter();
        findArea();
    }
    public static void findPerimeter(){
        int a = 13;
        int perimeter = 12 * a;
        System.out.println("Perimetr cube raven: " + perimeter);
    }
    public static void findArea(){
        int a = 13;
        int area = 6 * ( a * a );
        System.out.println("Area of the cube is: " + area);
    }
}
