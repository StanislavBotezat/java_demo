package Lesson4;

public class ContinueLableDemo {
    public static void main(String[] args) {

        outerloop:

        for (int i=1;i<10;i++){
            System.out.println();
            for (int j=1; j<10;j++){
                if(j==5) continue outerloop;
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
