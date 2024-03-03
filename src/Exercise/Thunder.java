package Exercise;

import java.util.Scanner;

public class Thunder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите время от вспышки до грома [с]: ");
        double time = in.nextDouble();
        double distance;
        distance = (time * 343)/1000;
       System.out.println("Расстояние до молнии : " +distance + " км");
    }
}
