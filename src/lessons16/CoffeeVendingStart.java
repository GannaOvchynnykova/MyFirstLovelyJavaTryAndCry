package lessons16;

public class CoffeeVendingStart {
    public static void main(String[] args) {
        myChoose(1);
    }

    private static void myChoose(int customerChoice) {
        switch (customerChoice) {
            case 3:
                CoffeMachine.latte();
                break;
            case 2:
                CoffeMachine.cappuccino();
                break;
            case 1:
                CoffeMachine.americano();
                break;
            case 4:
                CoffeMachine.tee();
                break;
            default:
                CoffeMachine.hotWatter(100);
                break;
        }
    }
}
