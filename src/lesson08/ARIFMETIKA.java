package lesson08;

public class ARIFMETIKA {
    public static void main(String[] args) {
        //sintax saxar
        myIncremenation();
        myDecrementation();
        myMagicjava();
    }
    public static void myIncremenation (){
        int a = 5;
        a = a + 1;
        System.out.println(a);
        a++; //a = a + 1
        System.out.println(a);
        a += 2;
        System.out.println(a);
        ++a; //never to use
    }
    public static void myDecrementation (){
        int a = 10;
        a = a - 1;
        a -= 1;
        a--;
        System.out.println(a);
    }
    public static void myMagicjava (){
        int a = 10;
        a = a * 2;
        a *= 2;
        System.out.println(a);
    }
}
