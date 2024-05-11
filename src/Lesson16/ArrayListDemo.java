package Lesson16;

import java.lang.reflect.Array;
import java.util.*;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Book> library = new ArrayList<Book>();
        Book a = new Book ("smth", "smbd", (short) 1700);
        Book b = new Book ("abcd", "Kakl", (short) 1910);
        Book c = new Book ("efgh", "Friederik", (short) 1917);
        Book d = new Book ("ijkl", "Iosiph", (short) 1920);
        Book e = new Book ("mnop", "Ulianov", (short) 1923);
        Book f = new Book ("qrst", "nikita", (short) 1956);

        System.out.println(("a.compareTo(b) " + a.compareTo(b)));
        List<Book> list = Arrays.asList(a, b, c, d, e, f);

        library.add(a);
        library.add(c);
        library.add(c);
        library.add(d);
        System.out.println(library.get(0));
        System.out.println(library);
        System.out.println(library.size());
        library.remove(0);
        System.out.println(library.size());
        library.remove(c);
        System.out.println(library.size());
        System.out.println(library.contains(f));
        System.out.println(library.contains(d));
        System.out.println(library.containsAll(list));
        library.addAll(list);
        library.addAll(4, list);
        System.out.println(library.containsAll(list));

        System.out.println(library);
        for (Book item: library){
            System.out.println(item);
        }

        Iterator<Book> it = library.iterator();
        while (it.hasNext()){
            Book i = it.next();
            if (i.getYearOfPublication()<1890) it.remove();
        }

        Comparator<Book> nameComparator = Comparator.comparing(Book::getName);
        library.sort(nameComparator);

        Collections.sort(library);



        library.removeIf(n -> n.getYearOfPublication()<1890);
        System.out.println(library);
        for (Book item: library){
            System.out.println(item);
        }


    }
}
