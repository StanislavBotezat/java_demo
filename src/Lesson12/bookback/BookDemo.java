package Lesson12.bookback;

public class BookDemo {
    public static void main(String[] args) {
        Book[] books = new Book[5];
        books[0] = new Book("JAVA", "Shofkl", 2014);
        books[1] = new Book("VALA", "qweradf", 2017);
        books[2] = new Book("LAVAS", "Armean", 2020);
        books[3] = new Book("SHAVA", "Turkis", 1996);
        books[4] = new Book("MOTSA", "Semit", 1999);

        for (Book book : books) {
            book.show();
            book.title = " ";
        }
    }
}
