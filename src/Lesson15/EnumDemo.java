package Lesson15;

import java.util.Scanner;

public class EnumDemo {
    Gender gender;
    enum Gender{
        MALE , FEMALE
    }
    public static void main(String[] args) {



        Transport tr;
        tr = Transport.AIRPLANE;
        System.out.println("Value of tr: " + tr);

        if (tr == Transport.AIRPLANE){
            System.out.print("tr is equal to airplane");
        }

        switch (tr){
            case CAR: System.out.println("it's a car");
            case TRUCK : System.out.println("it's a truck");
            case TRAIN : System.out.println("it's train ");
            case AIRPLANE:System.out.println("its a plane");

        }
        Transport[] allTransports = Transport.values();

        for( Transport t: allTransports){
            System.out.print (t);
            System.out.println( " speed"+ t.getSpeed());
        }
        try{
            tr = Transport.valueOf("HORSE");
            System.out.println("Tr is "+ tr);
        } catch (IllegalArgumentException e){
            tr = Transport.UNDEFINED;
        }


        System.out.println("Choose your transport");
        for ( Transport t: allTransports){
            System.out.print (t);
            System.out.println( " speed "+ t.getSpeed());}


        Scanner in = new Scanner(System.in);
        String candidate = in.nextLine();


        try {
            tr = Transport.valueOf(candidate.toUpperCase());
        }catch (IllegalArgumentException e){
            System.out.println("Sorry there is no such type");
            tr = Transport.UNDEFINED;
            }
        System.out.println("tr is " + tr);
    }
}
