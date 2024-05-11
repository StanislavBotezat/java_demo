package Lesson14;

public class ExeptionDemo {
//    try {
////        block of code with potential exeption
//    }
//    catch (ExceptionType exceptionObj) {
////        block of code which will be executed if the exeption of this type will occur
//    }
//    finally{
//        block of code which will be executed  anyway
//    }

    public static void main(String[] args) {
        int[] arr1 = {2, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] arr2 = {2, 0, 6, 8, 0};
try{
        for (int i = 0; i < arr1.length; i++) {


            try {
                System.out.println("arr1[" + i + "] /arr2[" + i + "]  = " + arr1[i] / arr2[i]);
                System.out.println("Before exception");
                arr1[7] = 10;


                System.out.println("This wont be displayed");
            } catch (ArithmeticException exc) {
                System.out.println("Arithmetic exeption");
            }
        }
    }
  catch(ArrayIndexOutOfBoundsException exc){
            System.out.println("Out of bound exception! ");
            exc.printStackTrace();
//            throw exc;
        }
        System.out.println("After catch");
    }


}


