package lessons15.magicTest;

public class PovtorExe05 {
    public static void main(String[] args) {
        //реализовать метод, который выводит на экран заданную строку N раз.
        // printLineNtimes(“hello”,3) -> hello hello hello
        printLineNtimes("hello", 3);
        System.out.println();
        System.out.println(printLineNtimesTwo("hellotwo", 5));
    }

    public static void printLineNtimes (String word, int number){ //ne vosvrat
        System.out.println();
        for (int i = 0; i < number; i++){
            System.out.print(word + " ");
        }
    }
    public static String printLineNtimesTwo (String word, int number){ //vosvrat
        String result = "";
        for (int i = 0; i < number; i++){
            result = result + word + " " ;
        }
        return result;
    }
}
