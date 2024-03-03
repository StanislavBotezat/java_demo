package Exercise;

import java.util.Scanner;

public class Gravity {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите ваш земной вес [кгс]: ");
        int ew = in.nextInt();
        double mw;
        mw = (ew * 17) / 100;
        System.out.println("Земной вес : " +ew + " кгс");
        System.out.println("лунный вес : " +mw + " кгс");
    }
}
