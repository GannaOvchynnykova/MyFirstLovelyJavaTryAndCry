package lesson05;

public class HelloBoolean {
    public static void main(String[] args) {
        //reviewInt
        booleanIntro();
        magigGame();
        magicGame2();
    }
    public static void magicGame2(){
        boolean a = (7+8)*5 > 7+8*5; // true
        boolean b = (7+8)*4 != 7+4*5; //true
        boolean c = 3+4 > 9+1 & 16-5 > 3*4; //false
        boolean d = 16/2 < 6+2 | 4+5 <= 4*5; //true
        boolean e = !(3*4 < 7+8); //false
        System.out.println(a + "\n" + b + "\n" + c + "\n" + d + "\n" + e);
    }
    public static void magigGame (){
        int a = 5;
        int b = 10;
        boolean c = a > b;
        //boolean d = 10;
        System.out.println(c);
        System.out.println(a <= b);
        System.out.println(a >= b);

    }
    public static void booleanIntro (){
        boolean a = true;
        boolean b = false;
        //boolean c = 1;
        boolean c = a && b; //And
        System.out.println(c);
        System.out.println(a || b); //OR
        System.out.println(!a); //Not
        boolean d = !a;
        boolean f = a ^ b; //XOR
        System.out.println(f);
    }
    public static void reviewInt(){
        int a = 5;
        int b = a;
        a = 7;
        System.out.println(a);
    }

}
