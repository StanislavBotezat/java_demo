package ExecMod7.shapes;

public class Rectangle extends TwoDShape {
String style;
double area;
    Rectangle(double _length, double _height, String _style) {
        super(_length, _height);
        style = _style;
    }


    @Override
    String Dimensions() {
        return "length " + length + " height " + height;
    }

    @Override
    double Area() {

        area = length * height;
        return area;
    }


}
