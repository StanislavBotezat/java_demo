package ExecMod5;

import java.util.Scanner;

public class TicTacToe {

    char[][] array;
    int m, n;

    public TicTacToe(int _m, int _n) {
        this.array = new char[_m][_n];
        m = _m;
        n = _n;
    }

    public char[][] initArray() {
        int i, j;
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++)
                this.array[i][j] = ' ';
        }
        return this.array;
    }

    public void printArray() {
        for (int i = 0; i < m; i++) {
            if (i != 0) System.out.println("\u2501\u2501\u2501\u254b\u2501\u2501\u2501\u254b\u2501\u2501\u2501");
            for (int j = 0; j < n; j++) {
                System.out.print(" " + array[i][j] + " ");
                if (j != 2) System.out.print("\u2503");
                if (j == 2) System.out.println();
            }
        }
    }

    public char[][] changeArrayX() {

        System.out.println("Введите номер строки и столбца куда поставить Х");
        Scanner inp = new Scanner(System.in);

        for (; ;) {
            one:{
                int k = inp.nextInt();
                int l = inp.nextInt();

                if ( k>0 && k <= 3 && l>0 && l<= 3 && this.array[(k - 1)][(l - 1)] == ' ') {
                    this.array[(k - 1)][(l - 1)] = 'Х';
                    break;
                } else {
                    System.out.println("Туда нельзя :) попробуйте еще раз поставить Х");
                    break one;
                }
            }
        }return this.array;
    }

    public char[][] changeArrayO()  {

        System.out.println("Введите номер строки и столбца куда поставить O");
        Scanner inp = new Scanner(System.in);

        for (; ;) {
        one:{
            int k = inp.nextInt();
            int l = inp.nextInt();


            if (k>0 && k <= 3 && l>0 && l<= 3 && this.array[(k - 1)][(l - 1)] == ' ') {
                this.array[(k - 1)][(l - 1)] = 'O';
                break;
            } else {
                System.out.println("Туда нельзя :) попробуйте еще раз поставить О");
                break one;
                    }
            }
        }return this.array;
    }

    public boolean verifyArray(){
    boolean win=false;

    if      (array[0][0]!=' ' && array[0][1]!=' ' && array [0][2]!=' '      & array[0][0] == array[0][1] & array[0][1]==array[0][2]) win=true;
    else if (array[1][0]!=' ' && array[1][1]!=' ' && array [1][2]!=' '      & array[1][0] == array[1][1] & array[1][1]==array[1][2]) win=true;
    else if (array[2][0]!=' ' && array[2][1]!=' ' && array [2][2]!=' '      & array[2][0] == array[2][1] & array[2][1]==array[2][2]) win=true;

    else if (array[0][0]!=' ' && array[1][0]!=' ' && array [2][0]!=' '      & array[0][0] == array[1][0] & array[1][0]==array[2][0]) win=true;
    else if (array[0][1]!=' ' && array[1][1]!=' ' && array [2][1]!=' '      & array[0][1] == array[1][1] & array[1][1]==array[2][1]) win=true;
    else if (array[0][2]!=' ' && array[1][2]!=' ' && array [2][2]!=' '      & array[0][2] == array[1][2] & array[1][2]==array[2][2]) win=true;

    else if (array[0][0]!=' ' && array[1][1]!=' ' && array [2][2]!=' '      & array[0][0] == array[1][1] & array[1][1]==array[2][2]) win=true;
    else if (array[0][2]!=' ' && array[1][1]!=' ' && array [2][0]!=' '      & array[0][2] == array[1][1] & array[1][1]==array[2][0]) win=true;

    return win;
    }

}







