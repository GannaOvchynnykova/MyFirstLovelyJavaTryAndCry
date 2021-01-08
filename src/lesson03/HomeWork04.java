package lesson03;

public class HomeWork04 {
    public static void main(String[] args) {
        double myRelation = exercise04();
        System.out.println(myRelation);
        System.out.println(exercise4AnotherTime(234324, 3245));
        System.out.println(exercise4AnotherTime(3423,234234));
    }
    public static double exercise04(){
        //Find ratio Area of Belarus and Ukraine
        //Area of the Belarus 207.595 km2
        //Area of the Ukraine 603.628 km2
        double belarusArea = 207.595;
        double ukraineArea = 603.628;
        double relation = belarusArea / ukraineArea;
        System.out.println("Ratio area of the two country \t" + relation);
        return relation;
    }
    public static double exercise4AnotherTime (double firstArea, double secondArea){
        double areaRelation = firstArea / secondArea;
        return areaRelation;
    }
}
