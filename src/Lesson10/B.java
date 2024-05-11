package Lesson10;

public class B extends A{
    int i;
    B(int a, int b){
        super.i = a;
        i=b;
    }

    B(){
        System.out.println("Constructor B is called");
    }

    public void showDetails() {
        System.out.println("i in superclass "+ super.i);
        System.out.println("i in class "+ i);
    }
}
