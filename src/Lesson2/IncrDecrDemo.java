package Lesson2;

public class IncrDecrDemo {
    public static void main(String[] args) {
        int x,y;
        x=2;
        y=-45;
        System.out.println("Initial values of x & y : " + ++x + " " + ++y);

        System.out.println("Initial values of x & y : " + x + " " + y);
x+=5;
        System.out.println("did x=+5 now x is " + x);
        x -=5;
        x=x-5;
        x *=5;
        x=x*5;
        x /=5;
        x=x/5;
        x %=5;
        x=12;
        x =x %5;
        System.out.println("x="+x);

        boolean t=true;
        boolean f=false;
        t ^= (x>5);
        t= t ^ (x>5);
    System.out.println("t= " + t);


    }
}
