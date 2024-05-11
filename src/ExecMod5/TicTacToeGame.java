package ExecMod5;

public class TicTacToeGame {
    public static void main(String[] args)  {

        TicTacToe tic = new TicTacToe(3,3 );

        tic.initArray();
        tic.printArray();
        tic.changeArrayX();
        tic.printArray();
        for (int i=0; i<4;i++) {
            tic.changeArrayO();
            tic.printArray();
            if (tic.verifyArray()) {System.out.println("Игра окончена! O Победил"); return;}
            tic.changeArrayX();
            tic.printArray();
            if (tic.verifyArray()) {System.out.println("Игра окончена! Х Победил"); return;}
        }

        if(!tic.verifyArray()) System.out.println("Игра окончена! Ничья");
    }
}
