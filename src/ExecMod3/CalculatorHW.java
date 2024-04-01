package ExecMod3;

import java.util.Scanner;

public class CalculatorHW {
    public static void main(String[] args) {
        float   sum, avg, compare;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число и нажмите [Enter] ");
        float num1 = in.nextFloat();
        System.out.print("Введите первое число и нажмите [Enter] ");
        float num2 = in.nextFloat();
        sum=num1+num2;
        avg=sum/2;

        System.out.println("Сумма двух чисел равна: "+sum );
        System.out.println("Среднне двух чисел равно: "+avg );
        if (num1>num2) System.out.println( "Первое число больше");
        else if(num1==num2) System.out.println("Числа равны между собой");
        else System.out.println("Второе число больше");

    }
}
