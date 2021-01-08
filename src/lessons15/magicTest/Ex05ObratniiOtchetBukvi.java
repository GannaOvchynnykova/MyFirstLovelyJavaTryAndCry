package lessons15.magicTest;

public class Ex05ObratniiOtchetBukvi {
    public static void main(String[] args) {
        //Возведите число n во вторую степень. Не используя арифмитический оператор умножения.

        System.out.println(digitPowTwo(5)); //25
        System.out.println(digitPowTwo(10));//100
        System.out.println(digitPowTwo(4));//16

    }

    private static int digitPowTwo(int number) {
        int result = 0;
        for (int i = 0; i < number; i++) {
            result = result + number;
        }
        return result;
    }
}
