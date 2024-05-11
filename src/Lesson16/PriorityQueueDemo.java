package Lesson16;


import java.util.*;

public class PriorityQueueDemo {
    public static void main(String[] args) {

        Queue<Book> library = new PriorityQueue<>();

        Book a = new Book ("smth", "smbd", (short) 1700);
        Book b = new Book ("abcd", "Kakl", (short) 1910);
        Book c = new Book ("efgh", "Friederik", (short) 1917);
        Book d = new Book ("ijkl", "Iosiph", (short) 1920);
        Book e = new Book ("mnop", "Ulianov", (short) 1923);
        Book f = new Book ("qrst", "nikita", (short) 1956);
        Book g = new Book ("Unknown");

        List<Book> list = Arrays.asList(b,c,d,e,f);

        library.addAll(list);

        System.out.println(library.peek());

        Patient newPatient0 = new Patient("Jones", 1 , Severity.LOW );
        Patient newPatient1 = new Patient("Jones", 45 , Severity.MEDIUM );
        Patient newPatient2 = new Patient("Jones", 44, Severity.HIGH );
        Patient newPatient3 = new Patient("Jones", 1 , Severity.HIGH );
        Patient newPatient4 = new Patient("Jones", 45 , Severity.CRITICAL );

        List<Patient> listOfPatients = Arrays.asList(newPatient0, newPatient1, newPatient2, newPatient3, newPatient4);

        Comparator<Patient> ageComparator  = Comparator.comparing(Patient::getAge);
        Queue<Patient> hospitalQueueByAge = new PriorityQueue<>(ageComparator);
        Queue<Patient> hospitalQueueBySeverity = new PriorityQueue<>(ageComparator);


        hospitalQueueByAge.addAll(listOfPatients);
        hospitalQueueBySeverity.addAll(listOfPatients);
        System.out.println("hospital queue by age peek" + hospitalQueueByAge.peek());
        System.out.println("hospital queue by severity peek" + hospitalQueueBySeverity.peek());


        System.out.println("BY AGE");
        Iterator<Patient> it = hospitalQueueByAge.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println("BY SEVERITY ");
        Iterator<Patient> it1 = hospitalQueueBySeverity.iterator();
        while (it1.hasNext()){
            System.out.println(it1.next());
        }

        System.out.println("BY AGE");
        while (!hospitalQueueByAge.isEmpty()){
            System.out.println(hospitalQueueByAge.poll());
        }

        System.out.println("BY severity");
        while (!hospitalQueueBySeverity.isEmpty()){
            System.out.println(hospitalQueueBySeverity.poll());
        }
        System.out.println(newPatient0.compareTo((newPatient1)));
    }
}
