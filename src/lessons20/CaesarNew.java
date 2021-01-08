package lessons20;

public class CaesarNew {
    public static void main(String[] args) {
        enigmaCaesar("Съешь же ещё этих мягких французских булок, да выпей чаю.");
    }

    private static String enigmaCaesar(String input) {
        String output = "";
        for (int i = 0; i < input.length(); i++) {
            output = output + symbolCode(input.charAt(i));
        }
        return output;
    }

    private static char symbolCode(char symbol) {
        char result = 0;
       // result = (char) (symbol + 3);
        String input = "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ.,";
        String output = "ГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯАБВ.,";

        int index = input.indexOf(symbol);
        System.out.println(index);
        result = output.charAt(index);
        return result;
    }
}
