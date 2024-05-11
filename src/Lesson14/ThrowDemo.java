package Lesson14;

public class ThrowDemo {
    public static void main(String[] args) {
        try {
            System.out.println(" Before throw ");
            throw new ArithmeticException();
        } catch (ArithmeticException exc) {
            System.out.println(" THe arithmetic exeption was caught ");
            throw exc;
        }

        finally {
            System.out.println(" After catch");
        }
    }
}

