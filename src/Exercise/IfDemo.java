package Exercise;

public class IfDemo {
    public static void main(String[] args) {
        int a,b,c;
        a=2;
        b=3;
        if (a<b) System.out.println( "a меньше b");
        if (a==b) System.out.println("вы не должны увидеть этот текст");
        System.out.println();
        c = a-b;
        System.out.println("c содержит значение" + c);
        if (c>=0) System.out.println("c- не отрицательное число");
        if (c<0) System.out.println("c-отрицательное число");
        c = b-a;
        System.out.println("c содержит значение " + c);
        if (c>=0) System.out.println("c- не отрицательное число");
        if (c<0) System.out.println("c-отрицательное число");



    }
}
