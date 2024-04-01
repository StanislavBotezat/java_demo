package Lesson9;

public class StaticDemmoApp {
    public static void main(String[] args) {
        StaticDemo obj1 = new StaticDemo();
        StaticDemo obj2 = new StaticDemo();

        obj1.x = 10;
        obj2.x = 20;

        System.out.println("obj1.x & obj2.x are independent  :" +   "They are equal: " +obj1+ "and " +obj2);
        System.out.println("Static variable y is COMMON");

        StaticDemo.y = 19;

        System.out.println("obj1.sum()" + obj1.sum());
        System.out.println("obj2.sum()" + obj2.sum());

        StaticDemo.y = 100;

        System.out.println("obj1.sum()" + obj1.sum());
        System.out.println("obj2.sum()" + obj2.sum());

    }
}
