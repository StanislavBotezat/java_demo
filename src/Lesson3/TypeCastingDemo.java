package Lesson3;

public class TypeCastingDemo {
    public static void main(String[] args) {
        int i;
        float f;
        long L;
        double D;

        i=10;
        f=i;
        f=10.5f;
        i= (int) f;
        System.out.println("i and f:" + i + " " + f );


        L=1000123285L;
        D = L;
        System.out.println("L and D:" + L + " " + D );

    }
}
