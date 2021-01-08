package lesson04;

public class HomeWork04 {
    public static void main(String[] args) {
        System.out.println(makeOutWord("<<>>", "Yay"));
        System.out.println(makeOutWord("<<>>", "WooHoo"));
        System.out.println(makeOutWord("[[]]", "word"));
        System.out.println(makeOutWord("!??!", "Vasiliy"));
        /*String hausmaster = "Vasiliy";
        System.out.println(hausmaster.substring(0,3));
        System.out.println(hausmaster.substring(5));
        System.out.println(hausmaster.substring(3,4));*/
    }
    public static String makeOutWord(String out, String word){
        String result ="";
        result = out.substring(0, 2) + word + out.substring(2);
        return result;
    }
}
