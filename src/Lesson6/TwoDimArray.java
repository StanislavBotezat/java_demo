package Lesson6;

public class TwoDimArray {
    public static void main(String[] args) {
        int t,i;
        int[][] table = new int[3][4];
        for (t=0; t<3; t++){
            for (i=0;i<4; i++){
                table [t][i]=(t*4)+i+1;
                System.out.print("table[" +t+"]"+"["+i+"]"+table [t][i]+"\t\t");
            }
            System.out.println();
        }
    }
}
