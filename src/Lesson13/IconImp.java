package Lesson13;
public class IconImp implements IConst {
    public static void main(String[] args) {
        int [] nums = new int [MAX];

        for (int i = MIN; i < 11 ; i++) {

            if (i>= MAX ) System.out.println();
            else {
                nums [i] = i;
                System.out.println(nums[i]+" ");
            }

        }
        MyClass ob = new MyClass();
        ob.method1();
        ob.method2();
        ob.method3();

        A ob1 = new MyClass();
        ob1.method1();
        ob1.method2();



        DImp obj = new DImp();
        obj.getAdminId();
        obj.getUserId();
        System.out.println(obj.getAdminId());

    }
}


