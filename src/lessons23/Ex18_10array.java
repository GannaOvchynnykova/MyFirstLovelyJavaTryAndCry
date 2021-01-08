package lessons23;

public class Ex18_10array {
    public static void main(String[] args) {
        //Для массива целых чисел вернуть true,
        // если длина массива равна 1 или больше,
        // а первый и последний элемент равны.
        int [] a1 = new int []{1, 2, 3}; //1 2 0
        int [] a2 = new int []{1, 2, 3, 1}; //2 0 5
        int [] a3 = new int []{1, 2, 1}; // 1 2 1
        System.out.println(sameFirstLast(a1)); //→ false
        System.out.println(sameFirstLast(a2)); //→ true
        System.out.println(sameFirstLast(a3));//→ true
    }

    private static boolean sameFirstLast(int[] input) {
        return input [0] == input[input.length-1] && input.length >= 1;
    }
}
