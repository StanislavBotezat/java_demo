package ExecMod5;

import java.util.Scanner;

public class TextEditorDemo {
    public static void main(String[] args) {
        String t1="";
        TextEditor textOne = new TextEditor();
        for (int i = 0; i < 2; i++) {
            textOne.addText();
            textOne.printText();
        }

    }
}
