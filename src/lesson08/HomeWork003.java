package lesson08;

public class HomeWork003 {
    public static void main(String[] args) {
        //myLine(100) ->
        //7 14 21 28 35 42 49 56 63 70 77 84 91 98
        myLine(100);
    }
    public static void myLine (int number){
        for (int i = 0; i < number; i++){
            if (i%7==0){
                System.out.print(i + " ");
            }
        }
    }
}