package lessons15.magicTest;

public class Ex05_6 {
    public static void main(String[] args) {
        //При вызове метода rectangle(5, 7); на экране появился прямоугольник. Что написано в методе rectangle?
        rechtanngle(5,7);
    }
    private static void rechtanngle (int a, int b){
        for (int i = 0; i < b; i++){
            for (int j = 0; j < a; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
