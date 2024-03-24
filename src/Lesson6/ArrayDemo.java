package Lesson6;

public class ArrayDemo {

    public static void main(String[] args) {

        int sample1[];
        sample1 = new int[10];
        int sample[]=new int [10];

//        sample[0]=1;
//        sample[2]=10;
//        sample[3]=23;
//        sample[4]=1234;
//        sample[5]=121;
//        sample[6]=421;
//        sample[7]=351;
//        sample[8]=1231;
//        sample[9]=131;
//        sample[10]=131;
//

        for (int i=0; i<10;i++)
            sample [i]=i+5;

        for (int i=0; i<10; i++)
            System.out.println("sample ["+i+"]:"+sample [i]);

    }
}
