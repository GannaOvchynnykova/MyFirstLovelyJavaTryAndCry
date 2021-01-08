package lesson07;

public class HelloZina {
    public static void main(String[] args) {
        System.out.println(salesPermission(10));
    }
    public static String salesPermissionThree(int age){
        String result = "";
        if (age < 16) result = "Mal eche!";
        else if (age >= 16 && age < 18) result = "Bier mochno";
        else if (age < 21) result = "Krome vodki";
        else result = "Prodat mochno";
        return result;
    }

    public static void salesPermissionTwo(int age){
        if (age < 16) {
            System.out.println("Mal eche!");
        } else if (age >= 16 && age < 18){
            System.out.println("Bier mochno");
        } else if (age < 21){
            System.out.println("Krome vodki");
        } else {
            System.out.println("Prodat mochno");
        }
    }
    public static String salesPermission (int age){
        String result = "";
        if (age>18) {
            result = "Prodavat mochno";
        } else {
            result = "Prodavat ne mochno";
        }
        return result;
    }
}
