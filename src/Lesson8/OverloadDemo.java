package Lesson8;

public class OverloadDemo {
    public static void main(String[] args) {
        OverloadDemo myObj = new OverloadDemo();
        myObj.printHello("Mary");
    }
    void printHello(){
        System.out.println("Hello");
            }

    void printHello(String name){
        System.out.println("Hello " + name + " !");
    }
}
