package ExecMod3;

public class BreakDEmo {
    public static void main(String[] args) {
        int num;
        num=100;
        for (int i=0; i<num;i++){
            if(i*i>num) break;
            System.out.print(i+ " ");
        }
        System.out.print("цикл завершен");
    }

}
