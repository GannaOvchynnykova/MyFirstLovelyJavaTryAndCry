package lessons17;

public class StringHomeWork {
    public static void main(String[] args) {
        //charAt(int index) - vosvrat simvola
        String myName = "Ganna";
        System.out.println(myName.charAt(1));

        //codePointAt(int index) - daet Unicode
        System.out.println(myName.codePointAt(1));

        //codePointBefore(int index) - Unicode pered ykasannim indexom
        System.out.println(myName.codePointBefore(2));

        //codePointCount(int beginIndex, int endIndex) - (I am NE PONIMAT)
        System.out.println(myName.codePointCount(0, 4));

        //compareToIgnoreCase(String str) - sravnivaet dve stroki bes registra
        String myNameTwo = "Anna";
        String myNameSmall = "anna";
        System.out.println(myName.compareToIgnoreCase(myNameTwo));
        System.out.println(myNameTwo.compareToIgnoreCase(myNameSmall));

        //concat(String str) - dobavit stroky k konzy drygoi stroki
        System.out.println(myName.concat(myNameTwo));

        //contains(CharSequence s) - vosvrat - soderjit li String drygoi String s ychetom registra
        System.out.println(myName.contains(myNameTwo));
        System.out.println(myNameTwo.contentEquals(myNameSmall));

        //endsWith(String suffix) - vosvrat - sakan4ivaet li string ykasannim okon4aniem
        System.out.println(myName.endsWith(myNameSmall));
        System.out.println(myName.endsWith(myNameTwo));

        //equals(Object anObject) - vernet true esli odinakovie - s y4etom registra
        System.out.println(myName.equals(myNameSmall));
        System.out.println(myName.equals(myNameTwo));

        //equalsIgnoreCase(String anotherString) - a tyt true bes registra
        System.out.println(myName.equalsIgnoreCase(myNameSmall));
        System.out.println(myNameTwo.equalsIgnoreCase(myNameSmall));

        //indexOf(int ch) - vosvrat index ot naidenigo simvola
        System.out.println(myName.indexOf('a'));

        //isEmpty() - vosvrat esli rasmer String = 0
        System.out.println(myName.isEmpty());

        //length() - vosvrat dliny strig
        System.out.println(myName.length());

        //replace(char oldChar, char newChar) - zamena podmena
        System.out.println(myName.replace('G', 'A'));

        //startsWith(String prefix) - vernet true esli String na4inaet s drygoi String
        System.out.println(myNameTwo.startsWith(myName));

        //toCharArray() - preobrasyet string v stroky simvolov - I AM NE PONIMAT
        System.out.println(myName.toCharArray());

        //toLowerCase() - stro4nie bukvi
        System.out.println(myName.toLowerCase());
        //toUpperCase() - VERHNII REGISTR
        System.out.println(myNameSmall.toUpperCase());

        //trim() - delete probel v nachale i v ende
        String myLastName = "    Ovchinnikova";
        System.out.println(myLastName.trim());










    }
}
