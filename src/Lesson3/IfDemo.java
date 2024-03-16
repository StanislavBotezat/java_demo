package Lesson3;

import java.util.Scanner;

public class IfDemo {
    public static void main(String[] args) {
//      if (condition) {some code;}
//        else-if (condition){some code}
//        else-if (condition){some code}
//        ...
//      else {some code}

        char ch, answer = 'M';
        System.out.println("A letter from diapason A-Z should be guessed");
        System.out.println("Try it!");

        Scanner input =  new Scanner(System.in);
        ch = input.nextLine().charAt(0);
        if (ch==answer) {
            System.out.println("Ugadal");
            System.out.println("You won from the first attempt!");
        }
        else{
            System.out.println("poprobui eshe raz");
        }


    }
}
