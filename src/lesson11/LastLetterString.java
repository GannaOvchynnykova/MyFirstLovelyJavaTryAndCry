package lesson11;

public class LastLetterString {
    public static void main(String[] args) {
        //Для данной строки str,
        // если строка начинается с «f», вернуть «Fizz».
        // Если строка заканчивается на «b», верните «Buzz».
        // Если и «f», и «b» условия верны, верните «FizzBuzz».
        // Во всех остальных случаях вернуть строку без изменений.
        System.out.println(fizzStringUno("fig"));// → "Fizz"
        System.out.println(fizzStringUno("dib"));// → "Buzz"
        System.out.println(fizzStringUno("fib"));// → "FizzBuzz"

        System.out.println(fizzString("fig")); // new variant
    }
    private static String fizzString (String str){
        //3 variant ____boolean magicString = str.startsWith("f") && str.endsWith("b");
        if (str.charAt(0) == 'f' && str.charAt(str.length() - 1) == 'b') {
            return "FizzBuzz";
        }else if (str.charAt(0) == 'f'){
            return "Fizz";
        } else if (str.charAt(str.length() - 1) == 'b') {
            return "Buzz";
        }
        return str;
    }

    private static String fizzStringUno(String str) {
        int lastLetter = str.length()-1;
        if (str.substring(0,1).equals("f") && str.substring(lastLetter).equals("b")) {
            return "FizzBuzz";
        }else if (str.substring(0,1).equals("f")){
            return "Fizz";
        } else if (str.substring(lastLetter).equals("b")) {
            return "Buzz";
        }
        return str;
    }
}


