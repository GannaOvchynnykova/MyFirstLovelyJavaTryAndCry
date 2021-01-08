package lesson03;

public class HomeWork06 {
    public static void main(String[] args) {
        System.out.println (countManeyBankApplication(100, 7));
    }
    public static double countManeyBankApplication(double money, int years){
        double interest = 3.5;
        double output;
        output = money + (money / 100) * interest + years;
        return output;
    }
}
