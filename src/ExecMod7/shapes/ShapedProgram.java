package ExecMod7.shapes;

public class ShapedProgram {
    public static void main(String[] args) {

        Rectangle r1 = new Rectangle(10,10, "rectangle");
        Circle c1 = new Circle (10, "circle");
        System.out.println("area of "+ r1.style + " dimensions "+ r1.Dimensions() +" is equal "+r1.Area());
        System.out.println("area of "+ c1.style + " dimensions "+ c1.Dimensions() +" is equal "+c1.Area());

    }
}
