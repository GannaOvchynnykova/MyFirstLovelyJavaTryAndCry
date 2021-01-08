package lesson09;

public class StringFirst {
    public static void main(String[] args) {
        System.out.println(helloName("Bob"));
        System.out.println(helloName("Alice"));
        System.out.println(helloName("X"));

        System.out.println(makeOutWord("<<>>", "Yay"));
        System.out.println(makeOutWord("<<>>", "WooHoo"));
        System.out.println(makeOutWord("[[]]", "word"));

        System.out.println(firstHalf("WooHoo"));
        System.out.println(firstHalf("HelloThere"));
        System.out.println(firstHalf("abcdef"));

    }
    public static String firstHalf (String input){
        int half = input.length() / 2;
        return input.substring(0, half);
    }
    public static String makeOutWord (String out, String word){
        return out.substring(0,2) + word + out.substring(2);
    }
    private static String helloName (String name){
        String result = "Hello " + name + "!";
        return result;
    }



}
