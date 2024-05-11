package ExecMod5;

import java.util.Scanner;

public class TextEditor {

    String text = "";

    public String getText() {
        return this.text;
    }
    public String addText() {
        System.out.println("Введите новый текст, который хотите добавить");
        Scanner in = new Scanner(System.in);
        in.useDelimiter("\n");
        text = text + in.next();
        return getText();
    }

    public void printText(){
        System.out.println("Текст выглядит так: ");
        System.out.println(this.getText());
    }
}
