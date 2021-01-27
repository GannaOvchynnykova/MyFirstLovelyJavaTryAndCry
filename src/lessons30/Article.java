package lessons30;

import java.awt.*;
import java.time.LocalDate; // today
import java.util.Date; // old

public class Article {
    int id;
    String title;
    String url;
    String date;
    String announce;
    String author;
    String articleText;
    Image img;

    // early
    Date today;
    //feature
    LocalDate day;
}
class ArticleTest{
    public static void main(String[] args) {
        Article lockDownJanuary2021 = new Article();
        lockDownJanuary2021.title = "Lockdown 30 years";
        lockDownJanuary2021.articleText = "Im mbnnmnvhvvkjvkjbjhjh";
        lockDownJanuary2021.announce = "Simple";
        lockDownJanuary2021.day = LocalDate.now();
        System.out.println(lockDownJanuary2021.day);
        System.out.println(lockDownJanuary2021.articleText);
        lockDownJanuary2021.url = "link same";
    }
}
