package ExecMod3;

import java.io.IOException;

public class Break2 {
    public static void main(String[] args) throws IOException {
        char ch;
        for(;;){
            ch=(char) System.in.read();
            if (ch=='q') break;}
            System.out.println("вы нажали клавишу q!");

    }
}
