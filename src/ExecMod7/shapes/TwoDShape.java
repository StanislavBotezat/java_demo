package ExecMod7.shapes;

abstract class TwoDShape {
    double length;
    double height;
    double radius;

    TwoDShape(double _length, double _height){
        length = _length;
        height = _height;
    }

    TwoDShape(double _radius) {
        radius = _radius;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double _length) {
        length = _length;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double _height) {
        height = _height;
    }



    abstract String Dimensions ();
    abstract double Area();
}
