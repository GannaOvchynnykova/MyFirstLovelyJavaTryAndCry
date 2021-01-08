package lesson13;

public class OknaAndDors {
    static double framePrice = 100;
    public static void main(String[] args) {
        double finalPrise = countCost(8, 4, 180, 175);
        System.out.println("Itogi" + finalPrise);
        }
        private static double countCost(int doors, int windiws, double high, double wide){

        return doorsPrice(doors) + windiwsPrise (windiws, high, wide);
    }

    private static double windiwsPrise(int windiws, double high, double wide) {
        double meterHigh = high / 100;
        double meterWide = wide / 100;
        double framePrice = 100;
        double glassPrice = 100;
        double Perimeter = (meterHigh + meterWide) * 2;
        double Area = meterHigh * meterWide;
        return (Perimeter * framePrice + Area * glassPrice) * windiws;
    }

    private static double doorsPrice(int doors) {
        double doorsMeterPrise = 120.0;
        double framePrice = 100;
        double a = 2.0;
        double b = 0.9;
        double perimetr = (a + b) * 2;
        double area = a * b;

        return (perimetr * framePrice + area * doorsMeterPrise) * doors;
    }
}
