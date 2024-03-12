package Exercise;

import java.util.Scanner;

public class GalToLit {
    public static void main(String[] args) {
        double liters;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество галлонов: ");
        double gallons = in.nextDouble();
        liters=gallons*3.7854;
        System.out.println(gallons+"галлонам соответсвует " + liters + "литров");
    }
}
