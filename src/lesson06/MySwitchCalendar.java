package lesson06;

public class MySwitchCalendar {
    public static void main(String[] args) {
        int myUnKnownMonth = 1;
        System.out.println(intToStringMonthName(myUnKnownMonth));
        //System.out.println(intToStringMonthName(8));
    }
    public static String intToStringMonthName (int number){
        //String output = "";
        //String result = "";
        String monthName = "";

        switch (number) {
            case 1:
                monthName = "Januar";
                break;
            case 2:
                monthName = "February";
                break;
            case 3:
                monthName = "March";
                break;
            case 4:
                monthName = "April";
                break;
            case 5:
                monthName = "May";
                break;
            case 6:
                monthName = "June";
                break;
            case 7:
                monthName = "July";
                break;
            case 8:
                monthName = "August";
                break;
            case 9:
                monthName = "September";
                break;
            case 10:
                monthName = "October";
                break;
            case 11:
                monthName = "November";
                break;
            case 12:
                monthName = "December";
                System.out.println("Proverka december");
                System.out.println("Samii prekrasnii");
                break;
            default:
                monthName = "Takogo net";
                break;
        }
        return monthName;
    }

}
