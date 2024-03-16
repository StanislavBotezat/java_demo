package ExecMod3;

import java.io.IOException;

public class ForTest {
    public static void main(String[] args) throws IOException {
        int i;
        System.out.println("Для отсановки нажмите клавишу S");
        for (i=0; (char) System.in.read() !='S'; i++)
            System.out.println("Проход №"+i);

    }
}
