package lessons26;

public class ThreeUnknown {
    public static void main(String[] args) {
        magicVariable();
    }

    private static void magicVariable() {
        for (int x = 1; x <= 36; x++) {
            for (int y = x; y <= 36; y++) {
                for (int z = y; z <= 36; z++) {
                    if (x * y * z == 36) {

                        System.out.print(" x = " + x);
                        System.out.print(", y = " + y);
                        System.out.print(", z = " + z);
                        System.out.println();
                    }
                }
            }
        }
    }
}
