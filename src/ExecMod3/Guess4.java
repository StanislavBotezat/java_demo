package ExecMod3;

import java.io.IOException;

public class Guess4 {
    public static void main(String[] args) throws IOException {

        char ch, ignore, answer = 'S';
        do{
            System.out.println("Задумана буква");
            System.out.println("попытайтесь ее найти");

            ch=(char) System.in.read();
            do{
                ignore = (char) System.in.read();
                            }
            while (ignore !='\n');
            if (ch==answer) System.out.println("Correct");
            else {
                System.out.print("Sorry the letter is");
                if (ch<answer)
                    System.out.println(" closer to the end");
                else System.out.println(" closer to the begining");
            }
        }while (answer !=ch);
    }
}
