package lesson12;

public class HelloWhile {
    public static void main(String[] args) {
        // v to vremia kak - poka
        // while
        int a = 10;
        int b = 50;
        evenAB (7, 56);
        helloDoWhile (a, b);
    }
    private static void helloDoWhile(int x, int y) {
        x = 55;
        do {
            System.out.println(x);
            x++;
        }while (x < y);
        }

        private static void evenAB(int a, int b) {
        while (a < b){
            if (a%2==0){
                System.out.println(a);
            }
            a++; // a = a + 1
        }
    }
}
