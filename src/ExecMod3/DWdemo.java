package ExecMod3;

import java.io.IOException;

public class DWdemo {
    public static void main(String[] args) throws IOException {
        char ch;
        do{
            System.out.println("нажмите нужную клавишу а затем [enter]: ");
            ch=(char) System.in.read();

        }
        while (ch!='q');
    }
}
