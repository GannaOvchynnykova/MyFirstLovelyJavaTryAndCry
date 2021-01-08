package lesson04;

public class HomeWork001 {
    public static void main(String[] args) {
        System.out.println(helloName("Bob"));//"Hello Bob!"
        System.out.println(helloName("Alice"));
        System.out.println(helloName("X"));
    }
    public static String helloName (String name){
        String result = "";
        String hello = "Hello ";
        String lastSymbol = "!";
        char myLastSymbol = '!';
        result = hello + name + " " + lastSymbol;
        return result;
    }
}
