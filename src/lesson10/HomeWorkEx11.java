package lesson10;

public class HomeWorkEx11 {
    public static void main(String[] args) {
        System.out.println(teaParty(6, 8));//1
        System.out.println(teaParty(3, 8));//0
        System.out.println(teaParty(20, 6));//2
    }

    private static int teaParty(int tea, int candy) {
        if (tea >= candy * 2 || candy >= tea * 2 && tea >= 5 && candy >= 5) {
            return 2;
        } else if (tea >= 5 && candy >= 5) {
            return 1;
        } else {
            return 0;
        }
    }

    private static int teaPartyOne(int tea, int candy) {
        /*if (tea < 5 || candy < 5){
            return 0;
        }else if (tea >= 5 && candy >=5){
            return 1;
        }else if (tea >= candy * 2 || candy >= tea * 2){
           return 2;
        }*/
        if (tea < 5 || candy < 5) {
            return 0;
        } else if (tea >= candy * 2 || candy >= tea * 2) {
            return 2;
        } else {
            return 1;
        }
    }
}



