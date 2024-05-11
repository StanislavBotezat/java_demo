package Lesson12.bookback;

public class Book {
    protected String title;
    protected String author;
    protected int publishdate;


    protected Book(String t, String a, int p){
        title = t;
        author = a;
        publishdate = p;

    }

    void show(){
        System.out.println(title);
        System.out.println(author);
        System.out.println(publishdate);
        System.out.println();
    }

}
