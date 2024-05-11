package Lesson10;

public class ColorTriangle extends Triangle {
    private String colour;

    ColorTriangle(String colour, String style, double width, double height ){

        super(style,width,height);
        this.colour = colour;

    }
    String getColour(){
        return colour;

    }

    void showColour(){
        System.out.println("colour is " + colour);

    }
}
