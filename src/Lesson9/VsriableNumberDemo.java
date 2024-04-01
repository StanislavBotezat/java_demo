package Lesson9;

import javax.swing.*;

public class VsriableNumberDemo {


    static void varTest(int  ... v) {
        System.out.println("Number of arguents: " + v.length);

        System.out.println("Contents: ");

        for (int i = 0; i < v.length; i++) {
            System.out.println(" arg" + i + " : " + v[i]);
        }

    }
    public static void main(String[] args) {
        varTest(10);
        varTest( 10,9,2);
        varTest();
    }
}
