package Lesson16;

import java.util.*;

public class HashSetDemo {
    public static void main(String[] args) {

        Set<Book> librarySet = new HashSet<>();
        List<Book> libraryList = new ArrayList<>();

        Book a = new Book ("smth", "smbd", (short) 1700);
        Book b = new Book ("abcd", "Kakl", (short) 1910);
        Book c = new Book ("efgh", "Friederik", (short) 1917);
        Book d = new Book ("ijkl", "Iosiph", (short) 1920);
        Book e = new Book ("mnop", "Ulianov", (short) 1923);
        Book f = new Book ("qrst", "nikita", (short) 1956);
        Book g = new Book ("Unknown");
        Book g1 = new Book ("Unknown", "erreer");
        Book g2 = new Book ("Unknown", "asssa"  );

        List<Book> list = Arrays.asList(a, b, c, d, e, f, g, g1, g2);

        librarySet.addAll(list);
        libraryList.addAll(list);

        for (Book myBook : librarySet) {
            System.out.println(myBook);
        }
        System.out.println();
        for (Book myBook : libraryList){
            System.out.println(myBook);
        }
    }
}
