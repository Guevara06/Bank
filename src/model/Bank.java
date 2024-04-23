package model;

import exceptions.NoCredit;
import exceptions.NoExistGetAccount;
import exceptions.NoExistSendAccount;
import exceptions.SuccesfulTransaction;

public class Bank {
    private Account account1;
    private Account account2;

    public Bank(Account account1, Account account2){
        this.account1 = account1;
        this.account2 = account2;
    }

    public void makeTransferBetweenAccounts(Long numberAccount1 , Long numberAccount2 , double value) throws SuccesfulTransaction, NoCredit, NoExistGetAccount,NoExistSendAccount{
        if (numberAccount1 == account1.getNumberAccount() || account1 == null){
            if(numberAccount2 == account2.getNumberAccount() || account2 == null){
                if(account1.getAccountBalance()>= value){
                    account1.setAccountBalance(account1.getAccountBalance() - value);
                    account2.setAccountBalance(account2.getAccountBalance() + value);
                    throw new SuccesfulTransaction();
                }else {
                    throw new NoCredit();
                }
            }else {
                throw new NoExistGetAccount();
            }
        }else {
            throw new NoExistSendAccount();
        }
    }

    public String printNumberAccounts(){
        String message = "";
        return message = "NÚMERO DE LAS CUENTAS ALMACENADAS" + "\n"
                + account1.getNumberAccount() + "\n"
                + account2.getNumberAccount();
    }

}
