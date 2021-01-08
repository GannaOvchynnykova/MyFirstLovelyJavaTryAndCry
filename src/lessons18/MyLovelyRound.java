package lessons18;

public class MyLovelyRound {
    public static void main(String[] args) {
        roundIntro();
        roundIntroTwo();
        roundIntroThree(); //samostoitelno
        roundIntroFo();
        intToLong();
    }

    private static void intToLong() {
        int a = 56;
        long l = a;
        long myL = 24547666;
        int b = (int)myL;
        System.out.println(b);
    }

    private static void roundIntroFo() {
        double number = 3.9; // okryglit vnis
        int newNumber = (int)number;
        System.out.println((double)newNumber);
    }

    private static void roundIntroThree() {
        //okryglit vverh
        double inputNumber = 3.141;
        int temp = (int)inputNumber;
        double temp2 = temp;
        System.out.println(temp2);
        if (inputNumber > temp2){
            inputNumber = temp2 + 1;
        }
        System.out.println(inputNumber);
    }

    private static void roundIntroTwo() {
        double number = 3.141;
        System.out.println(Math.round(number));
        System.out.println(Math.floor(number));
        System.out.println(Math.ceil(number));
    }

    public static void roundIntro() {
        double pi = Math.PI;
        //3 number posle sapiatoi
        double tempPi = pi * 1000;
        System.out.println(tempPi);
        int mygicInt = (int)tempPi;
        System.out.println(mygicInt);
        pi = (double)mygicInt / 1000;
        System.out.println(pi);
    }
}
