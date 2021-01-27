package lessons30;

public class Duck {
    String bred; //poroda duck
    int age; //vosrast
    String color; //okraska
    String name;
    int rangeAge;

    void quack(){
        System.out.println("Duck quacks"); // golos
    }
    void eats(){
        System.out.println("Duck eats"); // est
    }
    void swims (int meter){
        System.out.println(name + "Duck swims"); //plavaet
        rangeAge = rangeAge + meter;
    }
    void flies (){
        System.out.println("I believe I can fly"); //letaet
        System.out.println("I can fly");
        System.out.println("I fly");
    }
}
class DuckTest{
    public static void main(String[] args) {
        Duck donaldDuck = new Duck();
        donaldDuck.name = "Donald";
        Duck daisyDuck = new Duck();
        Duck goofyDuck = new Duck();
        Duck daffyDuck = new Duck();
        daffyDuck.name = "Daffy";
        Duck [] newDuckArray = new Duck[]{donaldDuck, daisyDuck, goofyDuck};
        System.out.println(newDuckArray[0].name);
        //System.out.println(donaldDuck.name);
        newDuckArray[0] = daffyDuck;
        System.out.println(newDuckArray[0].name);

        // proverka meter
        goofyDuck.name = "Guffi";
        goofyDuck.swims(100);
        System.out.println("Sostoianie speed " + goofyDuck.rangeAge);
        goofyDuck.swims(100);
        System.out.println(goofyDuck.rangeAge);
    }
}
