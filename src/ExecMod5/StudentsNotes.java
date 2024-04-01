package ExecMod5;

import java.util.Scanner;

public class StudentsNotes {
    public static void main(String[] args) {
        Scanner somescanner = new Scanner(System.in);
        System.out.println("Введите количество студентов");
        int stnum = somescanner.nextInt();
        System.out.println("Введите максимальное число оценок у студента");
        int notenum = somescanner.nextInt();

       int[][] table = new int[stnum][notenum];
        int i, j;
       for ( i = 0; i < stnum; i++){
            System.out.println("Введите оценки студента № " + (i + 1)+ " для окончания ввода нажмите 0");
               for ( j=0; j<notenum; j++)
               table [i][j] =  somescanner.nextInt();
        }
       for (i = 0; i < stnum; i++){
           System.out.print("\n Student №" + (i+1) + " notes: ");
           for (j=0; j<notenum; j++)
               System.out.print (" " +table[i][j]) ;
       }


    }
}

