package lesson05;

public class HomeWork09Lift {
    public static void main(String[] args) {
       int floor = 6;
        System.out.println(elevator(floor));
    }
    public static String elevator (int level){
        String result = "";
       switch (level){
           case 9:
               result = "Nine floor";
               break;
           case 8:
               result = "Eighth floor";
               break;
           case 7:
               result = "Seventh floor";
               break;
           case 6:
               result = "Sixth floor";
               break;
           case 5:
               result = "Fifth floor";
               break;
           case 4:
               result = "Fourth floor";
               break;
           case 3:
               result = "Third floor";
               break;
           case 2:
               result = "Second floor";
               break;
           case 1:
               result = "First floor";
               break;
           case 0:
               result = "Erd floor";
               break;
           case -1:
               result = "Keller floor";
               break;
           default:
               result = "Not";
               break;
       }
       return "Good Morning " + result + "!";
    }

}
