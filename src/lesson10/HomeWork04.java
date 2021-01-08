package lesson10;
public class HomeWork04 {
    public static void main(String[] args) {
        //visokostnii god
        System.out.println(leapYearOne(2000));//true
        System.out.println(leapYearOne(2020));//true
        System.out.println(leapYearOne(1800));//true
        System.out.println(leapYearOne(2021));//true

    }
    public static boolean leapYearOne(int year) {
        //return year % 400 == 0 || year % 4 == 00 ^ year % 100 == 0);
        //return year % 400 == 0 || (year % 4 == 00 && year % 100 != 0);
            if (year % 400 == 0) {
                return true;
            }
            if (year % 100 == 0) {
                return false;
            }
            if (year % 4 == 0) {
                return true;
            }
        return false;
    }
}

