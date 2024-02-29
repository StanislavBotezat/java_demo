package Lesson1;

public class DataTypes {
    public static void main(String[] args) {
        System.out.println("INTEGER DATA TYPES");
        byte    b = 127;
        short   s = 32767;
        int     i = 2147438647;
        long    l = -356;
        System.out.println("byte type: from -128 127 Example : b = " +b);
        System.out.println("short type: from -32768 32767 Example : s = " +s);
        System.out.println("int type: from -2.147.483.648 2.147.483.647 Example : i = "+i );
        System.out.println("long type: from -9.233.372.036.854.775.808 9.233.372.036.854.775.807 Example : l = "+l);

        System.out.println("FLOATING POINT");
        float    f = 127.3942f;
        double   d = 27;
        double pi  = Math.PI;
        double result = f/d;
        System.out.println("PI : " + pi);
        System.out.println("float type 32 bit: rom -2.147.483.648 2.147.483.647  Example : b = " +b);
        System.out.println("double type 64 bit: from -9.233.372.036.854.775.808 9.233.372.036.854.775.807 Example : s = " +d);
        System.out.println("Result f/d = " + result);

        System.out.println("CHARACTER DATA TYPES ");
        char c = 66;
        char c1 ='B';
        int codeOfA = (int) c1;
        System.out.println( codeOfA);
        System.out.println("char : c = " +c1);

        boolean tr=true;
        boolean fal=false;

        System.out.println("Logical type " + "Example : tr = "+ tr);
        System.out.println("Logical type " + "Example : fal = "+ (8>=8));


        int i1 =5;
        int i2 =2;
        int i3 =-2;
        int i4 =0;
        int res;
        res = i1 + i2;
        System.out.println("result of i1+i2="+res);
        res = i1 - i2;
        System.out.println("result of i1-i2="+res);
        res = i1 * i2;
        System.out.println("result of i1*i2="+res);
        res = i1 / i2;
        System.out.println("result of i1/i2="+res);
        res = i1 % i2;
        System.out.println("result of i1%i2="+res);


    }
}
