package lessons18;

public class Ex02Geometria {
    public static void main(String[] args) {
        double money = amountOfSprayCan() * 17;
        System.out.println(money + '$');
    }

    private static double amountOfSprayCan() {
        double result = colorAmount() / 400;
        //result = Math.floor(result); // okryglit do menscego
        result = Math.ceil(result); // okryglit do bolshego
        System.out.println("kolvo balon " + result);
        return result;
    }

    private static double colorAmount() {
        double result = giveMeArea() * 560 / 10000;
        return result;
    }

    private static double giveMeArea() {
        return sphereArea() + cubeArea() + pyramidArea() + boxArea();
    }

    private static double boxArea() {
        int a = 80;
        int b = 30;
        int c = 20;
        return 2 * a * b + 2 * b * c + 2 * a * c;
    }

    private static double pyramidArea() {
        int a = 20;
        int b = 30;
        return a * a + 2 * a * Math.sqrt(b * b - a * a / 4); //Math.sqrt Koren'
    }

    private static double cubeArea() {
        int a = 40;
        return a * a * 6;
    }

    private static double sphereArea() {
        int radius = 58 / 2;
        double result = 4 * Math.PI * radius * radius;
        return result;
    }
}
