package lessons28;

public class MerryChristmas {
    public static void main(String[] args) {
        makeSnowflake(10);
    }

    private static void makeSnowflake(int number) {
        for (int i = 0; i <= number/2; i++) {
            for (int j = 0; j < i ; j++) {
                System.out.print(" ");
            }
            System.out.println(" * ");
        }
    }
}
