package ExecMod6;

import java.util.Scanner;

public class MultipliersFinder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a number");
        int number = in.nextInt();
        boolean hasMultipliers = findMultipliers(number);

        if (!hasMultipliers) {
            System.out.printf("number %d has no multipliers", number);
            System.out.printf(" so it's natural ");
        }
    }

    private static boolean findMultipliers(int number){
        boolean  hasMultipliers = false;
 for (int i = 2 ; i<= Math.sqrt(number); i++){
     if (number % i == 0 ){
         int factor = number / i;
         System.out.printf(" %d is a product of: %d and %d%n" , number , i, factor);
         hasMultipliers = true;
     }
 }
        return hasMultipliers;
    }

}
