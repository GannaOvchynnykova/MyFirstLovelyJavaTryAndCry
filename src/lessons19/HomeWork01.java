package lessons19;

import jdk.nashorn.internal.objects.NativeString;

public class HomeWork01 {
    public static void main(String[] args) {
        System.out.println(deFront("Hello"));// → "llo"
        System.out.println(deFront("java"));// → "va"
        System.out.println(deFront("away"));// → "aay"
        System.out.println(deFront("away"));// → "abay"

        System.out.println(withoutX2("xHi"));// → "Hi"
        System.out.println(withoutX2("Hxi"));// → "Hi"
        System.out.println(withoutX2("Hi"));// → "Hi"
    }

    private static String deFront(String a) {
            String output = a.substring(2);
            if (a.charAt(0) == 'a') {
                output = 'a' + output;
            }
            if (a.substring(1, 2).equals("b")) {
                output = "b" + output;
            }
            return output;
        }

    private static String withoutX2(String inputTwo) {
        //if (input.substring(0,2).equals("xx"))
        if (inputTwo.charAt(0) == 'x' && inputTwo.charAt(1) == 'x') {
            return inputTwo.substring(2);
        } else if (inputTwo.charAt(1) == 'x') {
            return inputTwo.substring(0, 1) + inputTwo.substring(2);
        } else {
            return inputTwo;
        }
    }
    }
