package Lesson9;

public class NestedClassDemo {
    public static void main(String[] args) {
        int [] x = {3, 2, 1,5,6,7,8,9,0 };
        OuterClass outerClassObj = new OuterClass(x);
        outerClassObj.analyze();
    }
}
