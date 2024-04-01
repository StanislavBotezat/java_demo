package ExecMod3;

import java.io.IOException;

public class SelectLangHW {
    public static void main(String[] args) throws IOException {
        char choice, ignore;
        do {
            System.out.println("Выберите язык :");
            System.out.println("1.Русский");
            System.out.println("2.Romana");
            System.out.println("3.English");
            System.out.println("4.Deutsch");

            System.out.println("Выберите и введите цифру");
            choice = (char) System.in.read();
            do {
                ignore = (char) System.in.read();
            } while (ignore != '\n');
        } while (choice < '1' | choice > '5');


        switch (choice) {
            case '1':
                System.out.println("Добрый день!");
                break;
            case '2':
                System.out.println("Buna ziua!");

                break;
            case '3':
                System.out.println("Good day!");
                break;
            case '4':
                System.out.println("Guten Tag!");
                break;

        }
    }
}
