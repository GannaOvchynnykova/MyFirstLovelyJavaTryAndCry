package lesson04;

public class HelloString {
    public static void main(String[] args) {
        magicString();
        jamesBond();
        london();
        intToString();
    }
    public static void intToString(){
        int digit = 10;
        String text = String.valueOf(digit);
        System.out.println(text);
        int tryAndCry = Integer.parseInt(text);
        System.out.println(tryAndCry);

        String anatebe = "№10";
        int myTry = Integer.parseInt(anatebe);
        System.out.println(myTry);
    }
    public static void london (){
        String myLife = "London is the capital of Great Britain";
        System.out.println(myLife);
        System.out.println(myLife.toUpperCase());
        System.out.println(myLife.toLowerCase());
        System.out.println(myLife.substring(0, 1).toUpperCase()+ myLife.substring(1).toLowerCase());
        String game = myLife.substring(0,1).toUpperCase()+
                myLife.substring(1,2).toLowerCase()+
                myLife.substring(2,3).toUpperCase()+
                myLife.substring(3,4).toLowerCase();
        System.out.println(game);
    }

    public static void magicString() {
        String firstname = "Andrei";
        String secondname = "Podlubni";
        String user = firstname + secondname;
        int dlina = user.length();
        System.out.println(dlina);
        String first10Chars = user.substring(0, 9);
        System.out.println(first10Chars);
    }
    public static void jamesBond(){
        String userFirstName = "James";
        String copyright = "©";
        char copyright2 = '©';
        String userSecondName = "Bond";
        int age = 35;
        System.out.println(userFirstName + " " + userSecondName + "\t" + age);

        String welcomeMessage = userFirstName + " " + userSecondName + "\t" + age;
        System.out.println(welcomeMessage);
    }
}
