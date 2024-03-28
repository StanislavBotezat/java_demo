package ExecMod4.bankApp;

import java.io.IOException;
import java.util.Scanner;

public class BankAccount {
    String userName;
    String accNumber;
    double accBalance;
    char selection;

    BankAccount(String userNameValue, String accNumberValue, double accBalanceValue) {
        userName=userNameValue;
        accNumber=accNumberValue;
        accBalance = accBalanceValue;
    }
    BankAccount(){
        System.out.println("введите имя клиента");
        Scanner name = new Scanner(System.in);
        userName = name.next();

        System.out.println("введите номер счета клиента");
        Scanner acc = new Scanner(System.in);
        accNumber = acc.next();

        System.out.println("введите баланс");
        Scanner income = new Scanner(System.in);
        accBalance = income.nextDouble();
    }


    public void selectOperation() throws IOException {
        System.out.println("Выберите операцию");
        System.out.println("1.Пополнить счет");
        System.out.println("2.Снять со счета");
        selection = (char) System.in.read();
        switch (selection) {
            case '1':
                addMoney();
                break;
            case '2':
                withdrawMoney();
                break;
        }
    }


    public void changeClientData(){

        System.out.println("введите имя клиента");
        Scanner name = new Scanner(System.in);
        userName = name.next();

        System.out.println("введите номер счета клиента");
        Scanner acc = new Scanner(System.in);
        accNumber = acc.next();

        System.out.println("введите баланс");
        Scanner income = new Scanner(System.in);
        accBalance = income.nextDouble();
    }

   public double addMoney() throws IOException {
       System.out.println("Введите сумму на которую необходимо пополнить счет "+ userName + " ваш баланс:"+ accBalance);
       Scanner income = new Scanner(System.in);
       double a = income.nextDouble();
       accBalance = accBalance + a;
   System.out.println("Вы успешно внесли сумму " + a + " теперь ваш баланс составляет " + accBalance );
       return accBalance;
    }
    public double withdrawMoney() throws IOException {
        System.out.println("Введите сумму которую необходимо снять со счета "+ userName + " ваш баланс:"+ accBalance);
        Scanner income = new Scanner(System.in);
        double a = income.nextDouble();
        accBalance = accBalance - a;
        System.out.println("Вы успешно сняли сумму " + a + " теперь ваш баланс составляет " + accBalance );
        return accBalance;
    }
}

