package lesson06;

public class HomeWork01 {
    public static void main(String[] args) {
        System.out.println(salesPermission(10));
    }
    public static String salesPermission (int myAge){
        String result = "";
        switch (myAge){
            case 10:
                result = "Not!";
                break;
            case 17:
                result = "Yes vine, or bier";
                break;
            case 18:
                result = "Not vodka";
                break;
            case 20:
            case 30:
                result = "Gerne";
                break;
            default:
                result = "Admin";
                break;

        }
        return result;
    }
}
