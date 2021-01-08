package lesson12;

public class MyLovelyString {
    public static void main(String[] args) {
        exampleOne();
        //exampleTwo();
        //exampleThree();
    }

    /*private static void exampleThree() {
        String hm = "Schwarzneger";
        String newHm = hm.replace('e', 'i');
        System.out.println(newHm); //Schwarznigir
    }*/

    /*static void exampleTwo() {
        String hm = "Schwarzneger";
        int index = 4;
        System.out.println(hm.codePointAt(4)); //97

        String euroSymbol = "€";
        System.out.println(euroSymbol.codePointAt(0)); //8364
        char euroSym = 8364;
        System.out.println(euroSym);

        System.out.println(hm.codePointBefore(4)); //119
    }*/
    protected static void exampleOne() {
        //charAt
        String hm = "Schwarzneger";
        System.out.println(hm.charAt(3));
        System.out.println(hm.charAt(hm.length()-3));
        char firstLetter = hm.charAt(3);
        char lastLetter = hm.charAt(hm.length()-1);
        System.out.println("" + firstLetter + lastLetter);
        int magicInt = firstLetter + lastLetter;

        String magicString = "" + firstLetter + lastLetter; //same same 17||18
        String magicString2 = String.valueOf(firstLetter + lastLetter);
        String magicString3 = "";
        magicString3 += firstLetter + lastLetter;
        String magicString4 = "";
        magicString4 += firstLetter;

        int test = 5 + 4 * 7 / 10;
        System.out.println(magicString);
        System.out.println(magicString2);
        System.out.println(magicString3);
    }
}
