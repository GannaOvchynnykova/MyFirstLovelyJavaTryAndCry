package lessons16;

public class HomeWork03 {
    public static void main(String[] args) {
        //Реализовать метод печатающий таблицу умножения для заданного числа Пример: multiplicationTable(3)->
        //multiplicationTable(3);
        placeTable(3);
    }

    private static String placeTable(int number) {
        String result = "";
        for (int i = 1; i <= 10; i++) {
                System.out.println(number + "*" + i + "=" + (i * number));
            }
        return result;
    }
}

