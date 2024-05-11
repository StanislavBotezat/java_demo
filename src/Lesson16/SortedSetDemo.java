package Lesson16;

import java.util.*;

public class SortedSetDemo {
    public static void main(String[] args) {

        Book a = new Book ("smth", "smbd", (short) 1700);
        Book b = new Book ("abcd", "Kakl", (short) 1910);
        Book c = new Book ("efgh", "Friederik", (short) 1917);
        Book d = new Book ("ijkl", "Iosiph", (short) 1920);
        Book e = new Book ("mnop", "Ulianov", (short) 1923);
        Book f = new Book ("qrst", "nikita", (short) 1956);
        Book g = new Book ("Unknown");

        List<Book> list = Arrays.asList(b,c,d,e,f);

        Comparator<Book>  nameComparator =   Comparator.comparing(Book::getName);
        SortedSet<Book> library = new TreeSet<>(nameComparator);
        library.addAll(list);
        Iterator<Book> it = library.iterator();
        System.out.println(it.next());

    }
}

