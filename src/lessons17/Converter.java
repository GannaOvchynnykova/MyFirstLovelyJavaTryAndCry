package lessons17;

public class Converter {
    public static void main(String[] args) {
        System.out.println(convertDecimalToBinaryWhile(78));
        System.out.println(convertDecimalToBinary(78));
    }
        public static String convertDecimalToBinaryWhile(int decimal){
            String output = "";
            while (decimal > 0){
                int remainder = decimal % 2; //naxodim chislo ot dvoichnogo chisla
                output = remainder + output; // sapicivaem v resultat
                decimal= decimal/2; //delim input na 2 and pereispilsyem
            }
            return output;
    }
    public static String convertDecimalToBinary(int decimal){
        String output = "";
        for (int i = decimal; i > 0; i = i /2) {
            int remainder = i % 2; //naxodim chislo ot dvoichnogo chisla
            output = remainder + output; // sapicivaem v resultat
        }
        return output;
    }
}
