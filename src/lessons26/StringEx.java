package lessons26;

public class StringEx {
    public static void main(String[] args) {
        //Given a string, return a string where for every char in the original, there are two chars.
        System.out.println(doubleChar("The")); //"TThhee"
        System.out.println(doubleChar("AAbb")); //"AAAAbbbb"
        System.out.println(doubleChar("Hi-There")); //"HHii--TThheerree"
        //Return the number of times that the string "code" appears anywhere in the given string,
        // except we'll accept any letter for the 'd', so "cope" and "cooe" count.
        //Возвращает количество раз, когда строка «code» встречается где-нибудь в данной строке,
        // за исключением того, что мы принимаем любую букву для «d», поэтому учитываются «cope» и «cooe».
        System.out.println(countCode("aaacodebbb"));// →1
        System.out.println(countCode("codexxcode"));//→2
        System.out.println(countCode("cozexxcope"));//→2
        //Return true if the given string contains a "bob" string,
        // but where the middle 'o' char can be any char.
        //Вернуть истину, если данная строка содержит строку «bob»,
        // но где средний символ 'o' может быть любым символом.
        System.out.println(bobThere("abcbob"));// → true
        System.out.println(bobThere("b9b"));// → true
        System.out.println(bobThere("bac"));// → false
    }

    private static boolean bobThere(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'b' && str.charAt(i + 2) == 'b') {
                return true;
            }
        }
        return false;
    }

    private static int countCode(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'c' && str.charAt(i + 1) == 'o' && str.charAt(i + 3) == 'e') {
                count++;
            }
        }
        return count;
    }

    private static String doubleChar(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            result = result + str.charAt(i) + str.charAt(i);
        }
        return result;
    }
}
