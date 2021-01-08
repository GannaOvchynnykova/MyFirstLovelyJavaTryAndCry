package lesson06;

public class ReviewString {
    public static void main(String[] args) {
        String title = "Why like this";
        String newTitle = title.toUpperCase();
        System.out.println(newTitle);

        newTitle = newTitle.substring(0,1).toUpperCase() + newTitle.substring(1).toLowerCase();
        System.out.println(newTitle);
    }
}
