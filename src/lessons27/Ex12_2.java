package lessons27;

public class Ex12_2 {
    public static void main(String[] args) {
        //Given 3 int values, a b c, return their sum. However,
        // if any of the values is a teen -- in the range 13..19 inclusive
        // -- then that value counts as 0, except 15 and 16 do not count as a teens.
        // Write a separate helper "public int fixTeen(int n)
        // {"that takes in an int value and returns that value fixed for the teen rule.
        // In this way, you avoid repeating the teen code 3 times (i.e. "decomposition").
        // Define the helper below and at the same indent level as the main noTeenSum().

        //Учитывая 3 значения int, a b c, верните их сумму.
        // Однако, если какое-либо из значений является подростком - в диапазоне от 13 до 19 включительно
        // - тогда это значение считается как 0, за исключением 15 и 16, которые не считаются подростками.
        // Напишите отдельный помощник «public int fixTeen (int n)
        // {», который принимает значение int и возвращает это значение, зафиксированное для правила подростков.
        // Таким образом, вы избегаете повторения подросткового кода 3 раза (т. Е. «Разложения»).
        // Определите помощник ниже и на том же уровне отступа, что и основной noTeenSum ().
        System.out.println(noTeenSum(1, 2, 3));// → 6
        System.out.println(noTeenSum(2, 13, 1));// → 3
        System.out.println(noTeenSum(2, 1, 14));// → 3
    }

    private static int noTeenSum(int a, int b, int c) {
        int sum = 0;
        if (a >= 13 && a <= 14 || a >= 17 && a <= 19) {
            a = 0;
        }
        if (b >= 13 && b <= 19 || b != 15 && b <= 19) {
            a = 0;
        }
        if (a >= 13 && a <= 14 || a >= 17 && a <= 19) {
            a = 0;
        }
        sum = a + b + c;
        return sum;
    }
}
