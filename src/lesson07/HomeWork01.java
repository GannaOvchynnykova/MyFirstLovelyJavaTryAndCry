package lesson07;

public class HomeWork01 {
    public static void main(String[] args) {
        System.out.println(trafficPoliceOfficer(70));
    }
    public static String trafficPoliceOfficer (int speed){
        String result = "";
        if (speed < 50) {
            result = "No violations!";
        } else if (speed < 65){
            result = "Verbal reprimand and lecture for 5 minutes!";
        } else if (speed < 100){
            //for speeding from 16 km/h
            result = "40 euros fine!";
        } else if (speed < 130){
            result = "500 euros fine!";
        } else {
            result = "1000 euros fine, forfeiture of rights for 3 years and of a vehicle!";
        }
        return result;
    }
}
