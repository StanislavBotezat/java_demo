package Lesson4;

import java.io.IOException;

public class DoWhileDemo {
    public static void main(String[] args) throws IOException {

        char ch;
        do {
            System.out.println("press any key and the [Enter]:");
            ch=(char) System.in.read();
            }while (ch!='q');
    }
}
