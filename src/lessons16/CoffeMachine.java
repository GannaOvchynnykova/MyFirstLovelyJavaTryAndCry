package lessons16;

public class CoffeMachine {
    public static void hotWatter(int ml) {
        System.out.printf("Added %ml of water \n", ml);
    }
    public static void tee(){
        hotWatter(100);
        System.out.println("Beri paketik tee iz boksa");
    }
    public static void cappuccino(){

        milk(30);
        hotWatter(20);
        coffe(40);
        System.out.println("Cappuccino gotov");
    }
    public static void latte(){
        milk(40);
        hotWatter(70);
        coffe(30);
        System.out.println("Latte gotov");
    }
    public static void americano(){
        System.out.println("Americano gotov");
        milk(0);
        hotWatter(100);
        coffe(20);
        System.out.println("----");
    }
    private static void milk(int ml) {
        System.out.printf("Added %ml of milk \n", ml);
    }
    private static void coffe(int mg) {
        System.out.printf("Added %mg of coffee \n", mg);
    }
}
