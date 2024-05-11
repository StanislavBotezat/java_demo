package Lesson14;

import java.io.IOException;

public class ThrowsDemo {
    public static char promt (String str) throws IOException {
        System.out.println(str + ":  ");
        return (char) System.in.read();

    }

    public static void main(String[] args) {
        char ch;
        try {
            ch = promt ( "Enter letter: ");
        } catch (IOException e) {
            System.out.println(" IO exeption has occured");
            ch = 'X';

        }
        System.out.println(" you pressed the button " + ch );
    }
}
