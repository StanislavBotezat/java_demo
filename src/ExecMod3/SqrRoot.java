package ExecMod3;

public class SqrRoot {
    public static void main(String[] args) {
        double num, sroot,rerr;
        for(num =1.0 ; num <=100; num ++ ){
            sroot=Math.sqrt(num);
            System.out.println("Квадрантый корень из числа: "+ num + " Равен :"+sroot);
            rerr = num-(sroot*sroot);
            System.out.println("Ошибка вычисления = "+rerr);
            System.out.println();
        }
    }
}
