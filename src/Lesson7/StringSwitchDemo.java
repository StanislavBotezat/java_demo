package Lesson7;

import java.util.Scanner;

public class StringSwitchDemo {
    public static void main(String[] args) {



        System.out.println("Enter any comand of the folowing:");
        System.out.println("connect\ncancel\ndisconnect");
        Scanner input = new Scanner(System.in);
        String command = input.nextLine();


        switch (command){
            case "connect" -> System.out.println("Connecting");
            case "cancel" -> System.out.println("Cancelling");
            case "disconnect" -> System.out.println("Disconnecting");
            default -> System.out.println("Unknown command");
        }
    }
}
