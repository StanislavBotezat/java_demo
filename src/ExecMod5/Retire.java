package ExecMod5;

import java.io.IOException;
import java.util.Scanner;

public class Retire {
    public static void main(String[] args) throws IOException {
        boolean male = false, female = false  ;
        int age;
        char answer;

        Scanner someascanner = new Scanner(System.in);
        System.out.println("Выберете пол человека нажмите M для мужского / F для женского и любую другую для LGBTQ+++");
        answer =  (char) System.in.read();
        for ( ; ; ){
        if (answer=='M' | answer == 'm'){  male = true; System.out.println("Ведите возраст человека : ");}
        else if (answer =='F' | answer =='f'){ female = false; System.out.println("Ведите возраст человека : ");}
        else { System.out.println(" ваш пол был определен как боевой вертолет апачи. "); break;}

        age = someascanner.nextInt();

        if (male == true & age >=70) {
            System.out.println("Поздравляем, вы на пенсии уже " + (age-70) + " лет");
        } else if (male == true & age < 70 & age >0) {
            System.out.println("Эх, придется еще поработать " + (70 - age) + " лет");
        }
        else if (female==false & age >=65) {
            System.out.println("Поздравляем, вы на пенсии уже " + (age-65) + " лет");
        }
        else if (female==false & age < 65 & age >0 ){
            System.out.println("Эх, придется еще поработать " + (65 - age) + " лет");
        } else {
        }
    }

    }
}
