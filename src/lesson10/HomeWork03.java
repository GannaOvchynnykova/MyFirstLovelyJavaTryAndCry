package lesson10;

public class HomeWork03 {
    public static void main(String[] args) {
        System.out.println(modulo11(11));
        System.out.println(modulo11(12));
        checkModulo11AandB (10, 100);
    }

    private static void checkModulo11AandB(int a, int b) {
        for (int i = a; i < b; i++){
            if (modulo11(i) == true)
            System.out.println(modulo11(i));
        }
    }

    public static boolean modulo11 (int number){
        return number % 11 == 0;
    }
}
