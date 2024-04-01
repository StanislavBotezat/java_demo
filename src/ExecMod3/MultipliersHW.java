package ExecMod3;

import java.util.Scanner;

public class MultipliersHW {
    public static void main(String[] args) {
        boolean prime = true;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите положительное число, множетели которого хотите узнать");
        int number = in.nextInt();
        if (number<0) System.out.println("Вы ввели отрицательное число, а требовалось положительное теперь начните заново"); else {
        for (int i = 2; i <= (number/2) ; i++) {
            if (number % i == 0 && number!=2 ) {
                prime = false;
                break;
            } else {
                prime = true;
            }
        }
        if (prime) {
            System.out.println("Число " + number +" простое и не имеет других множителей кроме единицы и самого себя. ");
        } else {
            System.out.println("Введенное число это продукт умножения ");
            for (int i = 2; i <=  number/2  ; i++) {
                if (number % i == 0) {
                    int divider = number / i;
                    if (divider < i) break;
                    System.out.println(i  + " и " + divider);
                }
            }
        }
    }
}
}

