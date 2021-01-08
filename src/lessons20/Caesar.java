package lessons20;

import java.util.Scanner;

public class Caesar {
    public static void main(String[] args) {
        //enigmaCaesar("Съешь же ещё этих мягких французских булок, да выпей чаю.")
        //"Фэзыя йз зьи ахлш пвёнлш чугрщцкфнлш дцосн, жг еютзм ъгб."
        Scanner inputString = new Scanner(System.in);
        System.out.println("Enter a message: ");
        String message = (inputString.nextLine());
        caesar(message, 4);
    }

    public static void caesar(String message, int shift) {
        char key = (char) 3;
        char[] arrayMessage = message.toCharArray();

        for (int i = 0; i < arrayMessage.length; i++) {
            if (arrayMessage[i] == ' ')
                continue;
            arrayMessage[i] = (char) (arrayMessage[i] + key);
            if (arrayMessage[i] > 'z') {
                arrayMessage[i] = (char) (arrayMessage[i] - 26);
            } else if (arrayMessage[i] < 'a') {
                arrayMessage[i] = (char) (arrayMessage[i] + 26);
            }
        }
        String code = new String(arrayMessage);
        System.out.println("Here is your encoded message: ");
        System.out.println(code);
    }
}
