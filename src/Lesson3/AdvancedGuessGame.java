package Lesson3;

import java.util.Scanner;

public class AdvancedGuessGame {

    public static void main(String[] args) {
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
            if(ch < answer) System.out.println("blije k kontsu");
            else System.out.println("Blije k na4alu");
        }

    }
}
