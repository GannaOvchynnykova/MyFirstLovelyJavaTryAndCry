package lessons20;

public class HomeWork02 {
    //Дано два целых положительных числа. 
    //метод, который для каждого числа от a до b печатает строку вида “23 рубля”.
    public static void main(String[] args) {
        numberFromRangeRub(1, 20);
        printRub(23);
    }
    private static int printRub(int quantityRub) {
        if (quantityRub >= 10 && quantityRub <= 20) {
            System.out.println(quantityRub + " рублей");
        } else if (quantityRub % 10 == 2
                || quantityRub % 10 == 3
                || quantityRub % 10 == 4) {
            System.out.println(quantityRub + " рубля");
        } else if (quantityRub % 10 == 1) {
            System.out.println(quantityRub + " рубль");
        } else {
            System.out.println(quantityRub + " рублей");
        }
        return quantityRub;
    }
    public static void numberFromRangeRub(int a, int b) {
        for (int i = a; i <= b; i++) {
         printRub(i);
        }
    }
}
