package lessons27;

public class StringEx14 {
    public static void main(String[] args) {
        //Given a string and an int n, return a string made of n repetitions of the last n characters of the string.
        // You may assume that n is between 0 and the length of the string, inclusive.
        //Учитывая строку и int n, вернуть строку, состоящую из n повторений последних n символов строки.
        // Вы можете предположить, что n находится в диапазоне от 0 до длины строки включительно.
        System.out.println(repeatEnd("Hello", 3));// → "llollollo"
        System.out.println(repeatEnd("Hello", 2));// → "lolo"
        System.out.println(repeatEnd("Hello", 1));// → "o"
        //Given a string, consider the prefix string made of the first N chars of the string.
        // Does that prefix string appear somewhere else in the string?
        // Assume that the string is not empty and that N is in the range 1..str.length().
        //Для данной строки рассмотрим префиксную строку, состоящую из первых N символов строки.
        // Эта префиксная строка появляется где-то еще в строке?
        // Предположим, что строка не пуста и что N находится в диапазоне 1..str.length ().
        System.out.println(prefixAgain("abXYabc", 1));//→ true
        System.out.println(prefixAgain("abXYabc", 2));//→ true
        System.out.println(prefixAgain("abXYabc", 3));//→ false
        //Returns true if for every '*' (star) in the string,
        // if there are chars both immediately before and after the star, they are the same.
        //Возвращает истину, если для каждого '*' (звезды) в строке,
        // если есть символы как непосредственно до, так и после звезды, они одинаковы.
        System.out.println(sameStarChar("xy*yzz"));// → true
        System.out.println(sameStarChar("xy*zzz"));// → false
        System.out.println(sameStarChar("*xa*az"));// → true
    }

    private static boolean sameStarChar(String str) {
        char star = '*';
        for (int i = 1; i < str.length() - 1; i++) {
            if (star == str.charAt(i) && str.charAt(i - 1) == str.charAt(i + 1)) {
                return true;
            }
        }
        return false;
    }

    private static boolean prefixAgain(String word, int n) {
        //for (int i = n; i < world.length() - n ; i++) {
        //if (world.substring(0, n).equals(world.substring(i, i + n))){
        //return true;
        //}
        //}
        //return false;

        String prefix = word.substring(0, n);
        return word.substring(n).contains(prefix);
        //return word.indexOf(prefix, n) != -1;
    }

    private static String repeatEnd(String word, int n) {
        String newWorld = "";
        for (int i = 0; i < n; i++) {
            newWorld += word.substring(word.length() - n);
        }
        return newWorld;
    }

}
