package lesson05;

public class HomeWork08 {
    public static void main(String[] args) {
        System.out.println(verySmartDoor(false, true, false));
        System.out.println(verySmartDoor(false, false, true));
        System.out.println(verySmartDoor(true, false, false));
        System.out.println(verySmartDoor(false, false, false));
    }
    public static boolean verySmartDoor (boolean tel, boolean finger, boolean password){
        boolean result = tel || finger || password;
        return result;
    }
}
