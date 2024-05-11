package Lesson16;

import Lesson14.Dog;

import java.util.*;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Book> library = new LinkedList<>();
        LimitedLinkedList<Book> limitedLibrary = new LimitedLinkedList<>(8);


        Book a = new Book ("smth", "smbd", (short) 1700);
        Book b = new Book ("abcd", "Kakl", (short) 1910);
        Book c = new Book ("efgh", "Friederik", (short) 1917);
        Book d = new Book ("ijkl", "Iosiph", (short) 1920);
        Book e = new Book ("mnop", "Ulianov", (short) 1923);
        Book f = new Book ("qrst", "nikita", (short) 1956);
        Book g = new Book ("Unknown");

        Dog z = new Dog("fsdfsf");

        System.out.println("before removal");
        List<Book> list = Arrays.asList(g, a,b,c,d,e,f, g,g);
        library.addAll(list);

        limitedLibrary.addAll(list);

        System.out.println(limitedLibrary.offerFirst(a));

//        System.out.println(limitedLibrary.offerFirst(z));
        System.out.println(limitedLibrary);

//        Iterator<Book> it = library.iterator();
//        while (it.hasNext()){
//            System.out.println(it.next());
//        }
//
//        System.out.println();
//        library.removeFirstOccurrence(g);
//        library.removeLastOccurrence(g);
//        library.removeFirst();
//        library.removeLast();
//
//
//        System.out.println("After removal");
//
//        for(Book item : library){
//            System.out.println(item);
        }
    }

