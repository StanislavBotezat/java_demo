package ExecMod3;

import javax.sound.midi.Soundbank;
import java.io.IOException;

public class SymbolsKeyboard {
    public static void main(String[] args) throws IOException {
        char ch='0';
        int i=0;
        System.out.println("Введите символы с клавиатуры, программа сотановится, когда введете точку");

    for (byte dot=0; dot<1; ) {
        ch = (char) System.in.read();
        if (ch == ' ') i++;
        if (ch == '.') dot++;
      }
        System.out.println("количество пробелов " + i);
    }
}



