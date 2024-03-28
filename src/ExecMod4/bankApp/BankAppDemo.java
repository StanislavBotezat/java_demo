package ExecMod4.bankApp;

import java.io.IOException;

public class BankAppDemo {
    public static void main(String[] args) throws IOException {

        BankAccount account1 = new BankAccount();

        BankAccount account2 = new BankAccount("Senia", "9995533", 85855);
        BankAccount account3 = new BankAccount( "Fedia", "1234433", 36251);


        account1.selectOperation();

        account1.addMoney();

        account1.addMoney();
        account1.withdrawMoney();
        account2.addMoney();
        account2.withdrawMoney();
        account3.addMoney();
    }


}

