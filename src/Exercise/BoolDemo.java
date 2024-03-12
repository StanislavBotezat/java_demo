package Exercise;

public class BoolDemo {
    public static void main(String[] args) {
        boolean b;
        b=false;
        System.out.println("значение b: "+b);
        b=true;
        System.out.println("значение b: " +b );

        if (b) System.out.println("эта инструкция выполняется");
        b=false;
        if (b) System.out.println("эта инструкция не выполняется");
        System.out.println("результат сравнения 10>9:" + (10>9));
        }
    }

