package Lesson7;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Account {
    String phoneNumber;
    String name;
    byte age;

    Account(String phoneNumber, String name) {
        while (!Pattern.matches("\\d{9}", phoneNumber) | !Pattern.matches("[A-Z][a-z]{1,10}", name)){
            System.out.println("sorry   ");

            Scanner input=new Scanner (System.in);
            phoneNumber=input.nextLine(); 

            System.out.println("\n now enter your name");
            name=input.nextLine();

        }

            System.out.println("This number does not exist will assign default number");
        this.phoneNumber = phoneNumber;
        this.name=name;

    }
}
