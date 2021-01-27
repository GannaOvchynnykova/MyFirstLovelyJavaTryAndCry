package lessons30;

public class HomeWorkDoubleArray {
    public static void main(String[] args) {
        //Создать массив с десятичными дробями. - >> createRandomDoubleArray(10);
        //Вывести его на экран. - >> printColorDoubleArray()
        //Отсортировать его по возрастанию. -->> bubbleSortDoubleArray();
        //Добавить один элемент в массив. -- >> addElementDoubleArray(5, 3.14)
        //Удалить один элемент из массива -- >> deleteElementDoubleArray(3)
        //Изменить один элемент в массиве -- >> updateElementDoubleArray(2, 7.77)
        //Перезаписать/заполнить все элементы массива новыми значениями -->> fillArray();
        double[] array = createRandomDoubleArray(10);
        printColorDoubleArray (array);
        bubbleSortDoubleArray(array);
        printColorDoubleArray(bubbleSortDoubleArray(array));
        double[] resultArray1 = addElementDoubleArray(array, 5, 3.14);
        printColorDoubleArray(resultArray1);
        double[] resultArray2 = deleteElementDoubleArray(array, 3);
        printColorDoubleArray(resultArray2);
        updateElementDoubleArray(array, 2, 7.77);
        printColorDoubleArray(array);
        printColorDoubleArray(fillArray(array));
    }

    private static double[] fillArray(double [] array) {
        double[] result = createRandomDoubleArray(10);
        return result;
    }

    private static void updateElementDoubleArray(double[] array, int index, double updateElement) {
        array[index] = updateElement;
    }

    private static double [] deleteElementDoubleArray(double[] array, int index) {
        double[] result = new double[array.length - 1];
        for (int i = 0; i < index; i++) {
            result[i] = array[i];
        }
        for (int i = index; i < result.length; i++) {
            result[i] = array[i + 1];
        }
        return result;
    }

    private static double[] addElementDoubleArray(double[] array, int index, double newElement) {
        double[] result = new double[array.length + 1];
        for (int i = 0; i < index; i++) {
            result[i] = array[i];
        }
        result[index] = newElement;
        for (int i = index + 1; i < result.length; i++) {
            result[i] = array[i - 1];
        }
        return result;
    }

    private static double[] bubbleSortDoubleArray(double [] input) {
        boolean unsorted = true;
        while (unsorted) {
            unsorted = false;
            for (int i = 0; i < input.length - 1; i++) {
                if (input[i] > input[i + 1]) {
                    int temp = (int) input[i];
                    input[i] = input[i + 1];
                    input[i + 1] = temp;
                    unsorted = true;
                }
            }
        }
        return input;
    }

    private static void printColorDoubleArray (double[] array) {
        System.out.print("[ ");
        for (int i = 0; i < array.length - 1 ; i++) {
            System.out.print(format (array [i]) + ", ");
        }
        System.out.print(format(array[array.length - 1]));
        System.out.println(" ]");
    }

    private static String format(double var) {
        String result = "" + var;

        final String ANSI_RESET = "\u001B[0m";
        final String ANSI_RED = "\u001B[31m";
        final String ANSI_GREEN = "\u001B[32m";
        final String ANSI_YELLOW = "\u001B[33m";
        final String ANSI_BLUE = "\u001B[34m";
        final String ANSI_PURPLE = "\u001B[35m";
        final String ANSI_CYAN = "\u001B[36m";
        final String ANSI_WHITE = "\u001B[37m";

        int input = (int) var;
        int myModuloTen = input % 10;
        if (myModuloTen == 0){
            result = ANSI_RED + result;
        }else if (myModuloTen == 1){
            result = ANSI_GREEN + result;
        }
        else if (myModuloTen == 2){
            result = ANSI_YELLOW + result;
        }
        else if (myModuloTen == 3){
            result = ANSI_BLUE + result;
        }
        else if (myModuloTen == 4){
            result = ANSI_PURPLE + result;
        }
        else if (myModuloTen == 5){
            result = ANSI_CYAN + result;
        }
        else if (myModuloTen == 6){
            result = ANSI_RESET + result;
        }
        else if (myModuloTen == 7){
            result = ANSI_WHITE + result;
        }
        return result;
    }

    private static double []  createRandomDoubleArray(int size) {
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
