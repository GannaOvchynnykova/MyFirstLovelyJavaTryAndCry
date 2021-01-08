package lesson06;

public class HelloSwitch {
    /*
    za piaterky po kontrolnoi v Java - farrad
    za chetverky GoPro new
    za troiky ne porygayt
    za dvoiky otrygaut
    za edinicy "Lychcshe i ne spraschivai"
     */
    public static void main(String[] args) {
        int ocenka = 1;
        int score = 3;
        myFirstSwitch(ocenka);
        myFirstSwitch(score);
        System.out.println(myFirstSwitch(5));
    }
    public static String myFirstSwitch (int schoolScore){
        String prize = "";
        //switch - operator vibora, kluchevoe slovo, konstrykt
        switch (schoolScore){
            case 1:
                prize = "Lychsche i ne spracshivai";
                break;
            case 2:
                prize = "Za dvoiky otrygaut";
                break;
            case 3:
                prize = "Za troiky ne porygaut";
                break;
            case 4:
                prize = "Go pro new";
                break;
            case 5:
                prize = "Farrad";
                break;
            default:
                prize = "Takoi ne sycshestvyet";
                break;
        }
        System.out.println(prize);
        return prize;
    }
}
