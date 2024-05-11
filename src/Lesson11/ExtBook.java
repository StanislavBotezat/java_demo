package Lesson11;

import Lesson12.bookback.Book;

public class ExtBook extends Book {
    public ExtBook (String t, String a, int p){
        super (t, a, p);
        System.out.println(super.title);
    }
}
