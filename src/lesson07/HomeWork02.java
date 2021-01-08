package lesson07;

public class HomeWork02 {
    public static void main(String[] args) {
        trueWay("nalevo");
        trueWayTwo(3);
        trueWayThree(2);
    }
    private static void trueWayTwo (int way){
        if (way ==1) {
            System.out.println("napravo");
        }else if (way ==2) {
            System.out.println("nalevo");
        }else if (way ==3) {
            System.out.println("priamo");
        }else if (way==4) {
            System.out.println("kydato");
        }
    }
    private static void trueWay (String way) {
        // if (way =="nalevo")
        if (way.equals("nalevo")){
            System.out.println("Coca find");
        }else if (way.equals("na pravo")) {
            System.out.println("Pivo find");
        } else if (way.equals("Priamo")) {
            System.out.println("Will find something more");
        }else{
            System.out.println("Do not go");
            }
    }
    private static void trueWayThree (int way){
        switch (way){
            case 1:
                System.out.println("var1");
                break;
            case 2:
                System.out.println("var2");
                break;
            case 3:
                System.out.println("var3");
                break;
            default:
                System.out.println("defoltnii var");
                break;
        }
    }



}
