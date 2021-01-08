package lessons15.magicTest;

public class HomeWorkWhile {
    public static void main(String[] args) {
        //Возведите число n во вторую степень.
        // Не используя арифмитический оператор умножения.
        System.out.println(secondDegree(5)); //25
        System.out.println(secondDegree(10));//100
        System.out.println(secondDegree(4));//16
        // countdown(5) -> 5 4 3 2 1 start
        countdown(6);
        // printLineNtimes(“hello”,3) -> hello hello hello
        System.out.println(printLineN("hello", 3));
    }

    private static int secondDegree(int number) {
        int result = 0;
        int count = 0;
        while (count < number) {
            result = result + number;
            count++;
        }
        return result;
    }

    public static void countdown(int number) {
        int count = number;
        while (count > 0) {
            System.out.print(count-- + " ");
        }
        System.out.println("start");
    }

    private static String printLineN(String word, int number) {
        String result = "";
        int count = 0;
        while (count < number) {
            result = result + word + " ";
            count++;
        }
        return result;
    }
}

