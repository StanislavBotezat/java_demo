package Exercise;

public class SimpleNumbers {
    public static void main(String[] args) {

        for (int i = 2; i <= 20; i++) {
            boolean simp = true;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    simp = false;
                    break;
                }
            }
            if (simp) {
                System.out.println(i);
            }
        }
    }
}










