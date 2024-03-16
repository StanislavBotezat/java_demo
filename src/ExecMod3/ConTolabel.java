package ExecMod3;

public class ConTolabel {
    public static void main(String[] args) {
        outerloop:
        for(int i=1;i<10;i++)
        {
            System.out.print ("\n внешний цикл: проход " + i + " внутренний цикл: ");
            for (int j=1; j<10; j++)
            {
            if (j==5) continue outerloop;
            System.out.print (j);
            }
        }
    }
}
