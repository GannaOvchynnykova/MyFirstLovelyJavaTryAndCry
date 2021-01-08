package lessons16;

public class MyPassword {
    public static void main(String[] args) {
        //sdelat 20 parolei
        //big (o)
        // 1. Nado sdelat simvol
        //2. Nado sdelat parol
        // 3. Nado povtorit trebyemoe kolvo ras
        System.out.println(giveMeChar(97, 122));
        System.out.println(giveMeChar('a', 'z'));
        System.out.println(giveMePass(20));
        nTimesPassGenerate(10);
    }
    public static void nTimesPassGenerate(int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(giveMePass(10));
        }
    }
    private static String giveMePass(int size) {
        String result = "";
        for (int i = 0; i < size; i++) {
            /*result = result + giveMeChar(97, 122);
            result = result + giveMeChar('0', '9');
            result = result + giveMeChar('!', '%');*/
            result = result + verysmartGiveMeChar();
        }
        return result;
    }

    private static String verysmartGiveMeChar() {
        String input = "abcdefgdioqwghghg0123456789!%&/()$";
        String output = "";
        int random = (int) (Math.random()*input.length());
            output = output + input.substring(random, random+1);
        return output;
    }

    private static String giveMeChar(int min, int max) {
        String result = "";
        char myChar = (char) (Math.random() * (max - min) + 1 + min);
        result = "" + myChar;
        //result =String.valueOf(myChar);
        return result;

    }
}
