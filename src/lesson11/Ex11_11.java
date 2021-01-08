package lesson11;

public class Ex11_11 {
    public static void main(String[] args) {
        System.out.println(dateFashion(5, 10));// →2
        System.out.println(dateFashion(5, 2));// →0
        System.out.println(dateFashion(5, 5));// →1
    }

    private static int dateFashion(int you, int youDate) {
        if (you >= 8 && youDate > 2|| youDate >=8 && you > 2) {
            return 2;
        } else if (you <= 2 || youDate <= 2){
            return 0;
        }else {
            return 1;
        }
    }
}
