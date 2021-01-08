package lesson10;

public class BolleanReview {
    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        boolean logicalExpression = 5 > 7;
        System.out.println(logicalExpression);
        booleanExercise();
        ifElseExercise();
    }
    public static boolean booleanExercise (){
        return 5 > 7;
    }
    public static void ifElseExercise (){
        if (5 > 7){
            System.out.println(false);
        }else {
            System.out.println(true);
        }
    }
}
