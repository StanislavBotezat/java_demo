package Lesson2;

import java.util.Scanner;

public class LogicalDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name=input.nextLine();

        System.out.println("Hello dear " + name + "!");


        System.out.println("Are you a hardworking person");
        String answer1 = input.nextLine();

        System.out.println("Do you have a job? answer Yes or No");
        String answer2 = input.nextLine();

        boolean isEmployed = false;
        if (answer1.equalsIgnoreCase("yes") && answer2.equalsIgnoreCase("yes")) System.out.println("Congradulations!");
        else System.out.println("Do you want to work with us?");




    }
}
