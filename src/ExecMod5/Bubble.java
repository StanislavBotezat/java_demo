package ExecMod5;

public class Bubble {
    public static void main(String[] args) {
        int [] nums = {100 , 200, 300 , 400 , 590, 600 , 700, -100, -200, -300, -600, -800, 0, -314, 432};
         int a , b = 0, t;
         int size;
        size = nums.length;
        System.out.println("Исходный массив ");
        for (int i = 0 ; i< nums.length; i++ )
        System.out.print(" " + nums[i]);
        System.out.println();

        for (a = 1; a < size; a++)
            for (b = size-1; b >= a; b--) {

                if (nums[b - 1] > nums[b]) {
                    t = nums[b - 1];
                    nums[b - 1] = nums[b];
                    nums[b] = t;
                }
            }
        System.out.println("Отсортированный массив ");
        for (int i = 0 ; i< nums.length; i++ )
            System.out.print(" " + nums[i]);
        System.out.println();
    }
}
