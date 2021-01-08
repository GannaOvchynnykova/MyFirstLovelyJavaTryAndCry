package lesson08;

public class ForExample {
    public static void main(String[] args) {
        example01 ();
    }
    private static void example01(){
        int a = 3;
        for (int i = 0; i < 10; i++){
            a++;
            System.out.println("Whats?");
        }
        System.out.println(a);
    }
}
