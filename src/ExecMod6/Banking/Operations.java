package ExecMod6.Banking;

import java.util.Scanner;

public class Operations {

       static byte SelectOperation() {

         System.out.println("Пинкофф Банк 8=э \nГлавное Меню  \nВыберите операцию");
         System.out.println("1. Добавить клиента");
         System.out.println("2. Удалить клиента");
         System.out.println("3. Изменить данные клиента");
         System.out.println("4. Выбраьт клиента");
         System.out.println("5. Добавить Счет");
         System.out.println("6. Удалить Счет");
         System.out.println("7. Положить деньги на счет");
         System.out.println("8. Снять деньги со счета");
         System.out.println("9. Перевести деньги со счета на счет");
         System.out.println("0. Распечатать отчет от клиенте");

         Scanner scanner = new Scanner(System.in);
         byte i  = scanner.nextByte();
         return i;

    }

     static Client AddClient(){
        Scanner addClientScanner = new Scanner(System.in);
        Client c = new Client();
        System.out.println("Введите имя клиента");
        String name = addClientScanner.nextLine();
        System.out.println("Введите Фамилию клиента");
        String lastName = addClientScanner.nextLine();
        System.out.println("Введите пол М Ж ");
        String gender = addClientScanner.nextLine();

        c.setName(name);
        c.setLastName(lastName);
        c.setGender(gender);

        System.out.println(" Вы добавили клиента  " +"\tИмя: " + c.getName() +"\tФамилия: "+ c.getLastName());
        System.out.println();


        return c;
    }


    static int DeleteClient(){
        Scanner addClientScanner = new Scanner(System.in);
        int index = addClientScanner.nextInt();

        index--;
        return  index;
    }

    void EditClient(){

    }
    void AddAccount(){

    }
    void DeleteAccount(){

    }

    void AddMoney(){

    }

    void WithdrawMoney(){

    }

    void TransferMoney(){

    }
    void PrrintReport(){

    }

}
