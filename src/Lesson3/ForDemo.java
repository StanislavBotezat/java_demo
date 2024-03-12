package Lesson3;

public class ForDemo {
    public static void main(String[] args) {
//        for(initalization, condition, iteration){
//            some code
//        }
    double num, sqroot, rerr;
    for (num=1.0; num < 100.0;num++){
        sqroot=Math.sqrt(num);
        System.out.println("SQRT " + num + "is " +sqroot);
        rerr = num - (sqroot*sqroot);
        System.out.println("Routing error is " +rerr);
        System.out.println();
    }
    }
}
