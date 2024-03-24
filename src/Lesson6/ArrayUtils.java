package Lesson6;

public class ArrayUtils {
    int[] array;
    ArrayUtils(int[] array) {
        for (int i=0; i<array.length; i++)
            System.out.println(array [i]+ " ");
    }
    public void printArray(){
        System.out.println();
        for (int i=0; i<array.length; i++)
            System.out.println( array [i] + " ");
    }

    public void initArray(){
        for (int i=0; i<array.length; i++)
            array[i]=i;
    }

    public int[]  copyArray(int[] arrayToCopyIn) {
        {
            for (int i = 0; i < arrayToCopyIn.length; i++) {
                if (i < array.length)
                    arrayToCopyIn[i] = array[i];
                else break;
            }

        }
        System.out.println("sorry can't Copy");
        return arrayToCopyIn;
    }
}
