package lessons29;

public class HomeWorkLessons29 {
    public static void main(String[] args) {
        //Написать свой метод проверки строки на палиндром.
        //Учесть, что палиндром может быть предложением с пробелами.
        //При решении задачи используйте цикл.
        //Нельзя использовать методы replace(), reverse() и конструкции, которые вы не учили.
        System.out.println(checkPalindrom("А роза упала на лапу Азора"));// -> true
        System.out.println(checkPalindrom("поп"));// -> true
        System.out.println(checkPalindrom("школа"));// -> false
    }

    private static boolean checkPalindrom(String str) {
        String output = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ')
                output += str.toLowerCase().charAt(i);
        }
        String temp = reverse(str);
        return output.equals(temp);
    }

    private static String reverse(String input) {
        String output = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            if (input.charAt(i) != ' ')
                output += input.toLowerCase().charAt(i);
        }
        return output.toLowerCase();
    }

}
