package lesson05;

public class HomeWork05 {
    public static void main(String[] args) {
        System.out.println(doorbell(true, true));
        System.out.println(doorbell(false, false));
        System.out.println(doorbell(true, false));
    }
    public static boolean doorbell (boolean kalitka, boolean door){
        boolean result = kalitka ^ door;
        //return !(kalitka == door);
        return result;
    }
}
