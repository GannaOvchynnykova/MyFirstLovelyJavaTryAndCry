package lesson04;

public class HelloChar {
    //symvol
    public static void main(String[] args) {
        char zahl = 100;
        System.out.println(zahl);
        char octal = '\u039A';
        System.out.println(octal);
        char euroSymbol = '€';
        System.out.println(euroSymbol);
        char tabulator = '\t';
        System.out.print(tabulator);
        System.out.println("fait for 4 space");
        System.out.println('a' + 'b' + 'c');
        System.out.println("" + 'a' + 'b' + 'c');
    }
}
