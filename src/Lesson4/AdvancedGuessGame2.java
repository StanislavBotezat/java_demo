package Lesson4;

import java.util.Scanner;

public class AdvancedGuessGame2 {

    public static void main(String[] args) {

        char ch, answer = 'M';
        boolean WantToCont=false;
        System.out.println("A letter from diapason A-Z should be guessed");
        System.out.println("Try it!");
        do{
            System.out.println("Enter your char");
            Scanner input =  new Scanner(System.in);
            ch = input.nextLine().charAt(0);
            if (ch==answer) {
                System.out.println("Ugadal");
                WantToCont=false;
            }else{
                System.out.println("poprobui eshe raz");
                if(ch < answer) System.out.println("blije k kontsu");
                else System.out.println("Blije k na4alu");
                }
            System.out.println("Do you want to continue Y for yes" );
            ch=input.nextLine().charAt(0);
            if (ch=='y') WantToCont=true;

        }while (WantToCont);




           }

    }

