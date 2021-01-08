package lesson08;

public class HelloFor {
    public static void main(String[] args) {
        myWeek();
    }
    public static void myWeek (){
        int weekDays = 7;
        int x = 10;
        //nachalo yslovia step
        for (int i = 0; i <= weekDays; i++) {
            System.out.println("________");
            System.out.println("I wake am 5 o'clock");
            System.out.println("Breakfast");
            System.out.println("Go to job");
            System.out.println("Come after job");
            System.out.println("Smoke");
            System.out.println("Dinner");
            System.out.println("Netflix");
            System.out.println("Go to the bad");
            System.out.println("_______");
            System.out.println(i);
        }
    }
}
