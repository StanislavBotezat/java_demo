package Lesson7;

public class ForEachDemo {
    public static void main(String[] args) {

        int [] nums = {1, 2,3,4,5,6,7,8,9,10};
                int sum=0;
                String[] strings = {"cat", "dog", "bird"};

                for (int i=0;i<nums.length;i++){
                    nums [i]+= 1;
                }



// С помощью foreach нельзя изменять значения массива и это работать не будет
                for (int num:nums){
                    num+=1;
                }
//        for (int i=0;i<nums.length; i++){
//            sum+=nums[i];
//        }
//Dlea kajdogo format elementa elementa varname massiva nums sdelalai s nim cto dalshe

        for (int varname:nums){
            sum += varname;
            if (varname==5) break;

        }
            for (String x: strings){
                System.out.println("array element:" + x );
            }



        System.out.println("sum is equal to "+sum);
    }
}
