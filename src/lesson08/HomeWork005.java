package lesson08;

public class HomeWork005 {
    public static void main(String[] args) {
        //Вывести каждую букву американского алфавита от A-Z по 4 буквы в строке.
        alphabet();
    }
    public static void alphabet (){
        for (char c = 'A'; c <= 'Z'; c++){
            System.out.println("" + c + c + c + c);
        }
    }
}