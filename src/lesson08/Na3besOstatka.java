package lesson08;

public class Na3besOstatka {
    public static void main(String[] args) {
        modulo3();
    }
    public static void modulo3(){
        for (int i = 0; i < 100; i++){
            if (i%3==0){
                System.out.println(i + " delim na 3 bes ostatka");
            }
        }
    }
}
