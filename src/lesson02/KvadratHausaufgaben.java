package lesson02;

public class KvadratHausaufgaben {
    public static void main(String[] args) {
        //Given a square with a side 4;
        //Find perimeter and area;
        //Int a = 4;
        findPerimeter();
        findArea();

    }
    public static void findPerimeter (){
        int a = 4;
        int perimeter = 4 * a;
        System.out.println("Perimeter of the square is: " + perimeter);
    }

    public static void findArea(){
        int a = 4;
        int area = a * a;
        System.out.println("Area of the square is: " + area);
    }
}
