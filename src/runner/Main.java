package runner;

import exceptions.EqualAccount;
import exceptions.NoCredit;
import exceptions.NoExistAccount;
import model.Account;
import model.Bank;

public class Main {
    public static void main(String[] args) throws NoCredit, EqualAccount, NoExistAccount {

        Account cuenta1 = new Account(80000000, "Angie" );
        Account cuenta2 = new Account(50000000, "Yilma");

        Bank banco = new Bank(cuenta1, cuenta2);

        Long numAccount1 = cuenta1.getNumberAccount();
        Long numAccount2 = cuenta2.getNumberAccount();

        //String result = banco.makeTransferBetweenAccounts(numAccount1, numAccount2, 90000000);
        //String result = banco.makeTransferBetweenAccounts(numAccount1, numAccount1, 9000000);
        String result = banco.makeTransferBetweenAccounts(null, numAccount2, 9000000);
        System.out.println(result);
    }
}
