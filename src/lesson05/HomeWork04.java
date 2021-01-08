package lesson05;

public class HomeWork04 {
    public static void main(String[] args) {
        System.out.println(bigBadaBoom(true, true));
        System.out.println(bigBadaBoom(false, false));
        System.out.println(bigBadaBoom(true, false));
    }

    public static boolean bigBadaBoom (boolean officerOne, boolean officerTwo){
       boolean result = officerOne && officerTwo;
        return result;
    }
}

