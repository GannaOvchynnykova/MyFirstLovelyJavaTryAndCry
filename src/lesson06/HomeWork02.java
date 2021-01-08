package lesson06;

public class HomeWork02 {
    public static void main(String[] args) {
         int month = 8;
        System.out.println(seasonsOfTheYear(month));
        // scope -> oblast vidimosti
    }
    public static String seasonsOfTheYear (int monthNumber){
        String season = "";
        switch (monthNumber){
            case 12:
            case 1:
            case 2:
                season = "Winter";
                break;
            case 3:
            case 4:
            case 5:
                season = "Spring";
                break;
            case 6:
            case 7:
            case 8:
                season = "Summer";
                break;
            case 9:
            case 10:
            case 11:
                season = "Autumn";
                break;
            default:
                season = monthNumber + " Not";
                break;
        }
        return season;
    }
}
