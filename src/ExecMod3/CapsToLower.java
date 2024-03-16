package ExecMod3;

import java.io.IOException;
public class CapsToLower {
    public static void main(String[] args) throws IOException {
        char ch='a'; int i = 0;

 while (ch!='.') {
     ch = (char) System.in.read();
     if (ch >= 97 & ch <= 122) {ch -= 32; i++;}
     else if (ch >= 65 & ch <= 90) {ch += 32; i++;}
     else if (ch=='.')  break;

     System.out.print(ch);
 }
        System.out.println();
        System.out.println("было изменено " +i+ " символ");
    }
}
