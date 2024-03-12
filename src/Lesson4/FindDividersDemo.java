package Lesson4;

public class FindDividersDemo {
    public static void main(String[] args) {
        for(int i=2; i<=100000; i++ ){
            System.out.print("Dividers of "+i+": ");
            for (int j=2; j <= i/2; j++){
                if((i%j)==0) System.out.print(j+" ");
                }
            System.out.println();
        }
    }
}
