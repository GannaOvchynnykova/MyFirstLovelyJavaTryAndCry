package lessons15.magicTest;

public class Ex05ObratniiOtchet {
    public static void main(String[] args) {
        //Реализовать метод “ Обратный отсчёт ” который выводит на экран цифры от n до 1,
        // затем выводит строку „start“.
        // countdown(5) -> 5 4 3 2 1 start
        obratniiOtchet(6);

    }
    public static void obratniiOtchet (int number){
        for (int i = number; i > 0; i--){
            System.out.print(i + " ");
        }
        System.out.println("start");
    }
}

