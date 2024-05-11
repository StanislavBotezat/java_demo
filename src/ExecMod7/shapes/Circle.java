package ExecMod7.shapes;

public class Circle extends TwoDShape{

    String style;
    double area;

    Circle(double radius,String _style) {
        super(radius);
        style=_style;
    }

    @Override
   String Dimensions() {
        return " Radius " + radius ;
    }

    @Override
    double Area() {
        area = 3.14 * radius * radius;
        return area;
    }
}
