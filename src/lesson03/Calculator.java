package lesson03;

public class Calculator {
    public static void main(String[] args) {
        additionOne();
        additionTwo(5,7);
        int x = 100;
        int y = 200;
        additionTwo(x, y);
    }
    public static void additionOne(){
        int a = 3;
        int b = 5;
        int c = a + b;
        System.out.println(c);
    }
    public static void additionTwo(int weight, int height){
        int c = weight + height;
        System.out.println(c);

    }
}
