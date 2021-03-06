package lessons25;

public class HomeWorkLessons25 {
    public static void main(String[] args) {
        //Даны два числа, a и b.
        // Верните большее из них.
        // Не используйте никаких методов из библиотеки Math. П
        // окажите работу тернарного оператора.
        System.out.println(getMeMax(15, 5));// → 15
        System.out.println(getMeMax(4, 16));//→ 16
        System.out.println(getMeMax(20, 100));// → 100
        //Даны два числа, a и b.
        // Верните меньшее из них.
        // Не используйте никаких методов из библиотеки Math.
        // Покажите работу тернарного оператора.
        System.out.println(getMeMin(15, 45));// → 15
        System.out.println(getMeMin(44, 16));//→ 16
        System.out.println(getMeMin(200, 100));// → 100
        //Даны два строковых значения. Верните идущее по алфавиту раньше.
        System.out.println(myFirstCompareTo("Berlin", "Moscow"));// → "Berlin"
        System.out.println(myFirstCompareTo("Minsk", "Moscow"));// → "Minsk"
        System.out.println(myFirstCompareTo("Kyiv", "Paris"));// → "Kyiv"
        System.out.println(myFirstCompareTo("Могилёв", "Потсдам"));// → "Могилёв"
        //While, Do While
        //Решите не используя цикл for
        //Даны целые числа A и B, где B > 0. Вывести B раз число A.
        doNotUseFor(10, 5);
        //Вывести в порядке возрастания все числа между А и B, где а = 5, а B = 17.
        doNotUseForTwo(5, 17);

    }

    private static void doNotUseForTwo(int a, int b) {
        do {
            System.out.println(a);
            a++;
        } while (a < b);
    }

    private static void doNotUseFor(int a, int b) {
        do {
            System.out.println(a);
            b--;
        } while (b > 0);

        // int count = 0;
        //while (count < b){
        //count ++;
        //System.out.print(a + " , " + count);
        //System.out.println();
    }


    private static String myFirstCompareTo(String word1, String word2) {
        return (word1.charAt(0) < word2.charAt(0) || word1.charAt(1) < word2.charAt(1)) ? word1 : word2;
        //return (word1.compareToIgnoreCase(word2) < 0) ? word1 : word2;
    }

    private static int getMeMin(int a, int b) {
        return (a < b) ? a : b;
    }

    private static int getMeMax(int a, int b) {
        return (a > b) ? a : b;

        //if (a > b)
        //return a;
        //else
        //return b;

        //return Math.max(a , b);
    }
}
