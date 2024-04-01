package ExecMod3;

import java.util.Scanner;

public class EvenOddHW {
    public static void main(String[] args)  {
        Scanner in = new Scanner(System.in);

        for (; ;) {
            System.out.println("Ведите число: ");
            int num = in.nextInt();
            if (num % 2 == 0) System.out.println("Число четное");
            else System.out.println("число нечетное");
            System.out.println("желаете продолжить? Y/N");
            String answer = in.next();
            if (answer.equalsIgnoreCase("N")) break;
        }
    }
}
