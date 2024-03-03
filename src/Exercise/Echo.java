package Exercise;

import java.util.Scanner;

public class Echo {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите время от хлопка до эхо [с]: ");
        double time = in.nextDouble();
        double distance;
        distance = (time * 343)/2000;
        System.out.println("Расстояние до горы : " +distance + " км");
    }

}
