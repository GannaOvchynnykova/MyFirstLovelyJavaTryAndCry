package lessons15.magicTest;

public class TroeNeizvestnih {
    public static void main(String[] args) {
        troeNeizvestnih();
    }
    public static void troeNeizvestnih() {
        int result;
        for (int z = 1; z < 36; z++) {
            for (int y = 1; y < 36; y++) {
                for (int x = 1; x < 36; x++) {
                    if (x * y * z == 36 && x<=y && y<=z) {
                        System.out.println("x");
                        System.out.println("y");
                        System.out.println("z");
                    }
                }
            }
        }
    }
}
