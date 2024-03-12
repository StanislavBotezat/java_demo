package Lesson4;

public class NestedLoops {
    public static void main(String[] args) {
        for (int i=0; i<3;i++){
            System.out.println("Outerloop countrrer" + i);
            System.out.print("Inner loop counte: ");

            int t=0;
            while (t<100){
                if (t==10) break;
                System.out.print(t+" ");
                t++;
            }
            System.out.println();

        }
        System.out.println("Al lops was completed");
    }
}
