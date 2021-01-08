package lessons19;

public class ArrayIntro {
    public static void main(String[] args) {
        //introOne();
        //introOld();
        arrayDeclarationAndInitialization();
        germanCitiesExample();
        anotherExample();

    }

    private static void anotherExample() {
        String hm = "Vasili";
        String gubernator = "Schwarzneger";
        String[] people = new String[]{hm, gubernator};
        System.out.println(hm.length());
        System.out.println(people[0].length());
        System.out.println(people[1].length());
        System.out.println(people[0].length() + people[1].length());

        int result = 0;
        for (int i = 0; i < people.length; i++) {
            result = result + people[i].length();
        }
        System.out.println(result);
    }

    private static void germanCitiesExample() {
        String[] germanCities = new String[]{"Berlin", "München", "Dresden", "Hamburg", "Düsseldorf"};
        int allGermanCitiesLength = 0;
        int allGermanCities = germanCities.length;
        System.out.println(allGermanCities);
        for (int i = 0; i < germanCities.length; i++) {
            allGermanCitiesLength = allGermanCitiesLength + germanCities[i].length();
        }
        System.out.println(allGermanCitiesLength);
    }

    private static void arrayDeclarationAndInitialization() {
        int[] justExample;
        justExample = new int[10];
        int[] justExampleTwo;
        justExampleTwo = new int[1001];
        int[] field = new int[]{10, 15, 3, 7, 4, 9, 8};
        int[] numberFibonacci = new int[]{0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55};
        String theBestCitiInTheWorld = "Berlin";
        String[] germanCities = new String[]{theBestCitiInTheWorld, "Berlin", "München",
                "Dresden", "Hamburg", "Düsseldorf"};
        String[] fourSeasons = new String[]{"Vivaldi", "Chaikovcki", "Stiven"};
    }

    private static void introOne() {
        int[] myArray;
        String[] user;
        double[] gpsPoints;
        boolean[] truthTable;
        char[] cyrillicAlphabet;
    }

    private static void introOld() {

    }

}
