package lesson13;

public class LastChar {
    public static void main(String[] args) {
        //Учитывая 2 строки, a и b, верните новую строку,
        // состоящую из первого символа a и последнего символа b,
        // поэтому "yo" и "java" дают "ya". Если
        //любая строка имеет длину 0, используйте '@' для отсутствующего символа.
        System.out.println(lastChars("last", "chars"));// → "ls"
        System.out.println(lastChars("yo", "java"));// → "ya"
        System.out.println(lastChars("hi", ""));// → "h@"
    }
    private static String lastChars(String a, String b) {
        if (a.length()==0){
            a = "@";
        }
        if (b.length() == 0) {
            b = "@";
        }
        String firstLetterFirstWord = a.substring(0,1);
        String lastLetterLastWord = b.substring(b.length()-1);
        return firstLetterFirstWord + lastLetterLastWord;
    }
}
