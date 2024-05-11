package Lesson10;

import Lesson7.StringDemo;

public class ShapesDemo {
    public static void main(String[] args) {
        Triangle t1 = new Triangle("colored", 4 , 4 );
        Triangle t2 = new Triangle("contur" , 8 , 12);
        Triangle t3 = new Triangle(4);
        ColorTriangle t4 = new ColorTriangle("White" , "Hatch", 4,4);

//        t1.setWidth(8.0);
//        t1.setWidth(12);
//        t2.setHeight(12);
//        t2.setWidth(15);
        t2.style = "contour";

        System.out.println("inf about t1: ");
        t1.showStyle();
        t1.showDimensions();
        System.out.println("Area" + t1.areaCalc() );

        t2.showStyle();
        t2.showDimensions();
        System.out.println("Area is " + t2.areaCalc());

    }
}
