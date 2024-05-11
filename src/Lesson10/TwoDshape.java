package Lesson10;

public class TwoDshape {


    private double width;
    private double height;


    TwoDshape(){

        width=height=0;


//        this.width = width;
//        this.height = height;
    }

    TwoDshape(double dim){
        width = height = dim;
    }

    public double getWidth(){
        return width;
    }
    public double getHeight(){
        return height;
    }

    public void setWidth(double width){
        this.width = width;

    }
    public void setHeight(double height){
        this.height = height;
    }

    void showDimensions() {
        System.out.println(" Width & height: " + width + " " + height);

    }

}
