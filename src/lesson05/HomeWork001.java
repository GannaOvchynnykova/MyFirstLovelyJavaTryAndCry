package lesson05;

public class HomeWork001 {
    public static void main(String[] args) {
        System.out.println(smartDepositBox(true, false));
        System.out.println(smartDepositBox(false, true));
        System.out.println(smartDepositBox(false, false));
        Split();
        System.out.println(smartDepositBoxVersionTwo(true, false));
        System.out.println(smartDepositBoxVersionTwo(false, true));
        System.out.println(smartDepositBoxVersionTwo(false, false));
        System.out.println(smartDepositBoxVersionTwo(true, true));
        Split();

        System.out.println("verySmartDepositBoxVersionThree");
        boolean mamaPermission, papaPermission, omaPermission;
        mamaPermission = true;
        papaPermission = false;
        omaPermission = false;
        System.out.println(verySmartDepositBoxVersionThree(mamaPermission, papaPermission, omaPermission));

    }
    public static boolean smartDepositBoxVersionTwo (boolean mama, boolean papa){
        return mama && papa;
    }

    public static boolean verySmartDepositBoxVersionThreeSrcond(boolean mama, boolean papa, boolean oma){
        return (mama && papa) || oma;
    }


    public static void Split (){
        System.out.println("_________");
    }
    public static boolean smartDepositBox (boolean mama, boolean papa){
        boolean result = mama || papa;
        return result;
        //return mama || papa;
    }

    public static boolean verySmartDepositBoxVersionThree (boolean mama, boolean papa, boolean oma){
        return mama && papa || oma;
    }
}


