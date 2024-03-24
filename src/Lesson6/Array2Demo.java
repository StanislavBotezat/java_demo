package Lesson6;

public class Array2Demo {
    public static void main(String[] args) {
        int nums[]=new int [10];

        int min, max;

        nums[0]=123;
        nums[1]=130;
        nums[2]=230;
        nums[3]=131;
        nums[4]=6333;
        nums[5]=13423;
        nums[6]=1343;
        nums[7]=1212;
        nums[8]=163;
        nums[9]=19;
// еще одна запись массива
        int nums1[] = {123,130,230,131,333,33,1342,121,163,19};


        min = nums[0];
        max = nums[0];


        for (int i=1; i<10;i++){
        if(nums[i]<min ) min=nums[i];
        if(nums[i]>max ) max=nums[i];}
        System.out.println(min + max);
    }
}
