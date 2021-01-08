package lesson12;

public class HomeWork04 {
    public static void main(String[] args) {
        System.out.println(endsLy("oddly"));// → true
        System.out.println(endsLy("y"));// → false
        System.out.println(endsLy("oddy"));// → false
    }

    private static boolean endsLy(String input) {
        return input.endsWith("ly");
    }
}

