package lesson10;

public class HomeWork06 {
    public static void main(String[] args) {
        //Дано число меньше 3000.
        // При делении числа на 32 получается остаток 30,
        // при делении на 58 - остаток 44.
        // Найдите число или числа.
        findTheNumber(0, 3000);
    }

    private static void findTheNumber(int a, int b) {
        for (int i = a; i < b; i++) {
            if (i % 32 == 30 && i % 58 ==44) {
                System.out.print(" " + i);
            }
        }
    }
}