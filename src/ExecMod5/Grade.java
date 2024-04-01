package ExecMod5;

import java.util.Scanner;
import java.util.SortedMap;

public class Grade {
    public static void main(String[] args) {
        Scanner someascanner = new Scanner(System.in);

        System.out.println("Enter the number of your points in the range 0 - 100 ");
            int note = someascanner.nextInt();
            if (note >= 90 & note <= 100) System.out.println(" you have " + note + " points your grade is A");
            else if (note >= 80 & note < 90) System.out.println(" you have " + note + " points your grade is B");
            else if (note >= 70 & note < 80) System.out.println(" you have " + note + " points your grade is C");
            else if (note >= 60 & note < 70) System.out.println(" you have " + note + " points your grade is D");
            else if (note < 60) System.out.println(" you have " + note + " points your grade is F");
            else System.out.println("You have entered the value out of range ");
    }
}
