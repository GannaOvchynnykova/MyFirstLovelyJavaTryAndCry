package lessons20;

public class HomeWorkGeometry {
    public static void main(String[] args) {
        //"Нарисуйте/выведите в консоль" треугольник из звёздочек
        // используя только одну звёздочку и то что только что изучили:
        firstTriangle(10);
        invertedLeftTriangle(10);
       rightTriangle(10);
        triangle(10);
        invertedTriangle(10);
        romb(10);
    }

    private static void firstTriangle(int line) {
        for (int i = 0; i <= line; i++) { //kolvo strok
            for (int j = 0; j < i; j++) { // kolvo *
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

    }

    private static void invertedLeftTriangle(int lines) {
        for (int i = lines; i > 0; i--) { // kolvo strok
            for (int j = 1; j <= i; j++) { // kolvo *
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void rightTriangle(int line) {
        for (int i = 1; i <= line; i++) { // kolvo strok
            for (int j = line - i; j > 0; j--) { //kolvo space
                System.out.print(" ");
            }
            for (int j = i; j > 0; j--) { //kolvo *
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void triangle(int line) {
        for (int i = 1; i <= line; i++) { // kolvo strok
            for (int j = line; j >= i; j--) { // kolvo space
                System.out.print(" ");
            }
            for (int k = line; k < (i * 2) - 1; k++) { // kolvo *
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void invertedTriangle(int line) {
        for (int i = 0; i <= line; i++) { // kolvo strok
            for (int j = 0; j <= i; j++) { // kolvo space
                System.out.print(" ");
            }
            for (int k = line; k > (i * 2) - 1; k--) { //kolvo *
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void romb (int line){
        for (int i = 1; i <= line; i++) { // kolvo strok
            for (int j = line; j >= i; j--) { // kolvo space
               System.out.print(" ");
            }
            for (int k = line; k < (i * 2) - 1; k++) { // kolvo *
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= line; i++) { // kolvo strok
            for (int j = 1; j <= i; j++) { // kolvo space
                System.out.print(" ");
            }
            for (int k = line; k > (i * 2) - 1; k--) { //kolvo *
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

