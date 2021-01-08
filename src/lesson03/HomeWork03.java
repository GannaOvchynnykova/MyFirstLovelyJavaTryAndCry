package lesson03;

public class HomeWork03 {
    public static void main(String[] args) {
        //Kurs 1 euro = 1.1 dolar;
        //Find stoimost euro;
        System.out.println ("pri peredannix "
                + 1000
                + "Dollarov" + "client polychit" + stoimost(1000));
    }
    public static double stoimost (double dollars){
        double rate = 1.1;
        double euro = dollars / rate;
        return euro;
    }
}
