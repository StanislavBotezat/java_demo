package Lesson16;

import Lesson3.UseCast;

import javax.swing.*;
import java.util.*;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, String> capitalCities = new HashMap<>();
        HashMap<Book, Patient> hospitalLibrary = new HashMap<>();
        HashMap<Integer, String> inputLibrary = new HashMap<>();

        Queue<Book> library = new PriorityQueue<>();

        Book a = new Book ("smth", "smbd", (short) 1700);
        Book b = new Book ("abcd", "Kakl", (short) 1910);
        Book c = new Book ("efgh", "Friederik", (short) 1917);
        Book d = new Book ("ijkl", "Iosiph", (short) 1920);
        Book e = new Book ("mnop", "Ulianov", (short) 1923);
        Book f = new Book ("qrst", "nikita", (short) 1956);
        Book g = new Book ("Unknown");

        List<Book> list = Arrays.asList(a,b,c,d,e);

        library.addAll(list);

        System.out.println(library.peek());

        Patient newPatient0 = new Patient("Jones", 1 , Severity.LOW );
        Patient newPatient1 = new Patient("Jones", 45 , Severity.MEDIUM );
        Patient newPatient2 = new Patient("Jones", 44, Severity.HIGH );
        Patient newPatient3 = new Patient("Jones", 1 , Severity.HIGH );
        Patient newPatient4 = new Patient("Jones", 45 , Severity.CRITICAL );

        List<Patient> listOfPatients = Arrays.asList(newPatient0, newPatient1, newPatient2, newPatient3, newPatient4);


        for(int i = 0; i <list.size() && i< listOfPatients.size(); i++) {
            hospitalLibrary.put(list.get(i), listOfPatients.get(i));
        }

        for (Book i : hospitalLibrary.keySet()){
            System.out.println("key " + i + " value  " + hospitalLibrary.get(i));
        }






//        capitalCities.put("England" , "London");
//        capitalCities.put("Germany" , "Berlin");
//        capitalCities.put("Norway" , "Oslo");
//        capitalCities.put("USA" , "Washington DC");
//        System.out.println(capitalCities.size());
//        System.out.println(capitalCities);
//
//        for(String i : capitalCities.keySet()){
//            System.out.println(i);
//        }
//
//        for(String i : capitalCities.values()){
//            System.out.println(i);
//        }
//        for(String i : capitalCities.keySet()){
//            System.out.println("Key" + i + "value"+ capitalCities.get(i));
//        }
//
//        System.out.println(capitalCities.get("England"));
//        System.out.println(capitalCities.remove("England"));
//        System.out.println(capitalCities);

        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter keys and values (enter . to stop");
        boolean stop = false;

        System.out.println("enter how many pairs");
        Integer number = scanner.nextInt();

        for(;  number >0 ; number -- ){

            System.out.println("Enter key");
            Integer key = scanner.nextInt();
            System.out.println("Enter key");

            Scanner in = new Scanner(System.in);
            String value = in.nextLine();
            inputLibrary.put(key, value);

            for (int i=0 ; i< value.length(); i++){
                char inputChar = value. charAt(i);
                if (inputChar == '.');
                stop = true;
                break;
            }
            inputLibrary. put (key, value.replace(".",  ""));
        }

        for (Integer i : inputLibrary.keySet()){
            System.out.println(" key " + i+ " value " + inputLibrary.get(i));
        }


    }
}
