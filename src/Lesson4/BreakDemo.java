package Lesson4;

import java.util.Scanner;

public class BreakDemo {
    public static void main(String[] args) {
        int num;
        num=100;
        for (int i=0; i<num;i++){
            if(i*i>=num) break;
            System.out.println(i+" ");
        }

        char ch;
        System.out.println("The for loop is stopped");

        for ( ; ; ){

            Scanner in = new Scanner (System.in);
            ch = in.nextLine().charAt(0);

            if(ch == 'q') break;

        }
        System.out.println("The for loop is stopped");



    }

}
