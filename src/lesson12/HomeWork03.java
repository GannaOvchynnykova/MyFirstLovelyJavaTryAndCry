package lesson12;

public class HomeWork03 {
    public static void main(String[] args) {
        System.out.println(theEnd("Hello", true));// → "H"
        System.out.println(theEnd("Hello", false));//→ "o"
        System.out.println(theEnd("oh", true));// → "o"
    }

    private static String theEnd(String str, boolean front) {
        String result = str.substring(0,1);
        if (!front){
            result = str.substring(str.length()-1);
        }
        return result;
    }
}
