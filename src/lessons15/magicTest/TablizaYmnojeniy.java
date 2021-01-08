package lessons15.magicTest;

public class TablizaYmnojeniy {
    public static void main(String[] args) {
        multiplyTable(10);
    }
    private static void multiplyTable (int line){
        for (int i = 1; i <= line; i++){
            for (int j = 1; j <= line; j++){
                System.out.print(i * j + " ");
            }
            System.out.println();

        }
    }
}
