package lessons18;

public class String14Ex {
    public static void main(String[] args) {
        //Return the number of times that the string "code" appears anywhere in the given string,
        // except we'll accept any letter for the 'd', so "cope" and "cooe" count.
        //Возвращает количество раз, когда строка «code» встречается где-либо в данной строке,
        // за исключением того, что мы принимаем любую букву для «d», поэтому учитываются «cope» и «cooe».
        System.out.println(countCode("aaacodebbb"));// →1
        System.out.println(countCode("codexxcode"));// →2
        System.out.println(countCode("cozexxcope"));// →2
    }
    private static int countCode(String input) {
        int count = 0;
        for (int i = 0; i < input.length(); i++) {

        if (input.charAt(i) == 'c'
                && input.charAt(i + 1) == 'o'
                && input.charAt(i + 3) == 'e') {
            count++;
        }
    }
        return 0;
    }
}
