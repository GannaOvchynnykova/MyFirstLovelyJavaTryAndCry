package lesson02;

public class RectangleHausaufgaben {
    public static void main(String[] args) {
        //Given a rectangle with sides 6 and 12;
        //Find perimeter and area;
        //Int a = 6;
        //Int b = 12;
        findPerimeter();
        findArea();
    }
    public static void findPerimeter (){
        int a = 6;
        int b = 12;
        int perimeter = (a + b) * 2;
        System.out.println("Perimeter of the rectangle is: " + perimeter);
    }
    public static void findArea (){
        int a = 6;
        int b = 12;
        int area = a * b;
        System.out.println("Area of the rectangle is: " + area);
    }
}
