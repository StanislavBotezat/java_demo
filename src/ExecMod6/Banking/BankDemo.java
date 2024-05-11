package ExecMod6.Banking;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BankDemo {
    public static void main(String[] args) {

        List<Client> clientList = new ArrayList<>();



        for ( ; ; ) {

            switch (Operations.SelectOperation()) {
                case 1:
                    System.out.println("Вы выбрали: Добавить клиента");
                    clientList.add(Operations.AddClient());
                    System.out.println(clientList);
                    break;
                case 2:
                    System.out.println("Вы выбрали: Удалить клиента");
                    System.out.println(clientList);
                    clientList.remove(Operations.DeleteClient());
                    System.out.println(clientList);
                    break;
                case 3:
                    System.out.println("Вы выбрали: Изменить данные клиента");
                    break;
                case 4:
                    System.out.println("Вы выбрали: Выбраьт клиента");
                    break;
                case 5:
                    System.out.println("Вы выбрали: Добавить Счет");
                    break;
                case 6:
                    System.out.println("Вы выбрали: Удалить Счет");
                    break;
                case 7:
                    System.out.println("Вы выбрали: Положить деньги на счет");
                    break;
                case 8:
                    System.out.println("Вы выбрали: Снять деньги со счета");
                    break;
                case 9:
                    System.out.println("Вы выбрали: Перевести деньги со счета на счет");
                    break;
                case 0:
                    System.out.println("Вы выбрали: Pаспечатать отчет от клиенте");
                    break;
            }

        }
    }
}
