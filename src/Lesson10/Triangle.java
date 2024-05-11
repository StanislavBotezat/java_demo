package Lesson10;

public class Triangle extends TwoDshape {
    //    double width;
//    double height;

//    void showDimensions(){
//        System.out.println(" Width & height: " + width + " " + height);

Triangle( String style,double width, double height ){

    super();

    //    setWidth(width);
    //    setHeight(height);
    this.style = style;

}

Triangle(){
    super();
    style="none";
}

Triangle(double x) {
    super(x);
    style = "coloured";
}
String style;
    double areaCalc() {
        return   getHeight()*getWidth() / 2;
    }
    void showStyle() {
        System.out.println("Style is " + style);
    }
}
