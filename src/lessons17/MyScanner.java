package lessons17;

import java.util.Scanner;

public class MyScanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age;
        System.out.println(" A skolko let? : ");
        age = input.nextInt();
        System.out.println("Kak tebe zovyt? : ");
        String customerName;
        customerName = input.next();
        System.out.println("A ti yveren" + customerName + "chto tebe? " + age + "years");


    }
}
