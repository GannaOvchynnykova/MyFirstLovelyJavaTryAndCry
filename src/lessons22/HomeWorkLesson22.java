package lessons22;

public class HomeWorkLesson22 {
    public static void main(String[] args) {
        //Пожалуйста, создайте случайный двойной массив с размером = 10;
        double[] array = createArray(10);
        print(array);
        //Пожалуйста, вставьте новый элемент по определенному индексу в массив
        double[] resultArray02 = insertNewElement(array, 5, 3.14);
        print(resultArray02);
        //Пожалуйста, обновите один элемент по определенному индексу.
        double[] resultArray03 = updateNewElement(array, 3, 100.200);
        print(resultArray03);
        updateNewElementOldArray(array, 7, 33.3333);
        print(array);
        //Пожалуйста, удалите один элемент по определенному индексу.
        double[] resultArray04 = deleteElement(array, 8);
        print(resultArray04);
    }

    private static double[] deleteElement(double[] array, int index) {
        double[] result = new double[array.length - 1]; // ydalit i sozdat new array
        for (int i = 0; i < index; i++) {
            result[i] = array[i];
        }
        for (int i = index; i < result.length; i++) {
            result[i] = array[i + 1];
        }
        //for (int i = index + 1; i < array.length ; i++) {
            //result [i - 1] = array [i];
        //}
        return result;
    }

    private static void updateNewElementOldArray(double[] array, int index, double newElement) {
        array[index] = newElement; // dobav v starii array //tolko dobavit!!!!!void
    }


    private static double[] updateNewElement(double[] array, int index, double newElement) {
        double[] newArray = new double[array.length]; //sozdaem novii array
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        newArray[index] = newElement;
        return newArray;
    }

    private static double[] insertNewElement(double[] array, int index, double newElement) {
        double[] result = new double[array.length + 1]; // dobav new element in array
        for (int i = 0; i < index; i++) {
            result[i] = array[i];
        }
        result[index] = newElement;
        for (int i = index + 1; i < result.length; i++) {
            result[i] = array[i - 1];
        }
        return result;
    }

    private static void print(double[] array) {
        System.out.print("[ ");
        for (int i = 0; i < array.length - 1 ; i++) {
            System.out.print(format (array [i]) + ", ");
        }
        System.out.print(format(array[array.length - 1]));
        //for (double element : array) {
            //System.out.print(element + ", ");
        //}
        System.out.println(" ]");
    }

    private static String format(double var) {
        String result = "" + var;

        final String ANSI_RESET = "\u001B[0m";
        final String ANSI_BLACK = "\u001B[30m";
        final String ANSI_RED = "\u001B[31m";
        final String ANSI_GREEN = "\u001B[32m";
        final String ANSI_YELLOW = "\u001B[33m";
        final String ANSI_BLUE = "\u001B[34m";
        final String ANSI_PURPLE = "\u001B[35m";
        final String ANSI_CYAN = "\u001B[36m";
        final String ANSI_WHITE = "\u001B[37m";
        final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
        final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
        final String ANSI_RED_BACKGROUND = "\u001B[41m";
        final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
        final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";

        int input = (int) var;
        int myModuloTen = input % 10;
        if (myModuloTen == 1){
            result = ANSI_RED + result;
        }else if (myModuloTen == 2){
            result = ANSI_GREEN + result;
        }
        else if (myModuloTen == 3){
            result = ANSI_YELLOW + result;
        }
        else if (myModuloTen == 4){
            result = ANSI_BLUE + result;
        }
        else if (myModuloTen == 5){
            result = ANSI_PURPLE + result;
        }
        else if (myModuloTen == 6){
            result = ANSI_PURPLE + result;
        }
        return result;
    }

    private static double[] createArray(int size) {
        double[] result = new double[size];
        for (int i = 0; i < result.length; i++) {
            result[i] = randomDoubleNumber(100);
        }
        return result;
    }

    private static double randomDoubleNumber(int range) {

        return round(Math.random() * range);
    }

    private static double round(double input) {
        double output = 0.0;
        int cooficient = 100;
        double temp = input * cooficient;
        int temp2 = (int) temp;
        output = temp2;
        output = output / 100;
        return output;
    }
}
