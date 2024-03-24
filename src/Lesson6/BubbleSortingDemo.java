package Lesson6;

public class BubbleSortingDemo {
    public static void main(String[] args) {

        int[] nums = {123,130,230,131,333,33,1342,121,163,19};
        int a,b,t;
        int size;

        size = 10;
        System.out.println("initial array");
        for (int i=0; i<size; i++){
        System.out.print (" " + nums[i]);}
        System.out.println();

        for(a=1; a < size; a++){
            for (b=size-1;b>=a; b--){
                if (nums [b-1]>nums[b]){
                    t=nums[b-1];
                    nums[b-1] = nums[b];
                    nums[b]=t;

                }
            }
        }
        for (int i=0; i<size; i++){
            System.out.print (" " + nums[i]);}
        System.out.println();
        System.out.println();



    }


}
