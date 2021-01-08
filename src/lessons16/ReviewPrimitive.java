package lessons16;

public class ReviewPrimitive {
    public static void main(String[] args) {
        firstMethod();
        srcondMethod();
        thirdMetod();
        exemple();
        myRandom();
        fourthMehod();
    }

    private static void fourthMehod() {
        char myLovelyChar = (char) (Math.random() * (122 - 97) + 1 + 97);
        System.out.println(myLovelyChar);

        for (int i = 0; i < 100; i++) {
            char myLovelyCharTest = (char) (Math.random() * (122 - 97) + 1 + 97);
            System.out.println(myLovelyCharTest + " ");
        }
        int count = 0;
        while (count < 100) {
            char myLovelyCharWhile = (char) (Math.random() * (122 - 97) + 1 + 97);
            System.out.println(myLovelyCharWhile);
            count++;
        }


        String a = "az";
        System.out.println(a.codePointAt(0));
        System.out.println(a.codePointAt(1));
    }

    private static void myRandom() {
        double magic = Math.random();
        System.out.println(magic);
        /*for (int i = 0; i < 100; i++){
            System.out.println(Math.random());
        }*/
        int normalNumber = (int) (Math.random() + 100);
        System.out.println(normalNumber);
    }

    private static void exemple() {
        double pi = 3.14;
        int piNew = (int) pi;
        double money = 5.873456348975;
        money = money * 100;
        int newMoney = (int) money;
        System.out.println(newMoney);
        double result = newMoney;
        System.out.println(result);
        //result = result/100; - same same
        result /= 100;
    }

    private static void thirdMetod() {
        int var1 = 54;
        double var2 = var1;
        int var3 = (int) var2;
    }

    private static void srcondMethod() {
        float var1 = (float) 45.5;
        float var2 = 45.5f;
        float var3 = 45.5f;
        double var4 = var1;
        float var5 = (float) var4;
    }

    public static void firstMethod() {
        byte var1 = 50;
        int var2 = var1;
        byte var3 = (byte) var2;
        long var4 = var2;
        int var5 = (int) var4;
        short varShort = var1;
        byte varByte = (byte) varShort;
    }
}
