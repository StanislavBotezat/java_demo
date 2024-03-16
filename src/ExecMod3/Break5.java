package ExecMod3;

public class Break5 {
    public static void main(String[] args) {
        hui:
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    System.out.println(k + " ");
                    if (k == 5) break hui;
                }
                System.out.println("после цикла К");
            }
            System.out.println("посе цикла j");
        }
        System.out.println("после цикла i");
    }
}