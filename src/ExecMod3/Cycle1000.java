package ExecMod3;

public class Cycle1000 {
    public static void main(String[] args) {
        int i;
        for (i=1000; i>=0; i=i-2){
         System.out.print  (" "+ i);
         if (i%100==0) System.out.println();
        }
    }
}