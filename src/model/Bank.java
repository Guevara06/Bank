package model;

import exceptions.*;

public class Bank {
    private Account account1;
    private Account account2;

    public Bank(Account account1, Account account2){
        this.account1 = account1;
        this.account2 = account2;
    }

    public String makeTransferBetweenAccounts(Long numberAccount1 , Long numberAccount2 , double value) throws NoCredit, NoExistGetAccount,NoExistSendAccount,EqualAccount{
        String message="";
        if (numberAccount1 == account1.getNumberAccount() || account1 == null){
            if(numberAccount2 == account2.getNumberAccount() || account2 == null){
                if(numberAccount1 != numberAccount2){
                    if(account1.getAccountBalance()>= value){
                        account1.setAccountBalance(account1.getAccountBalance() - value);
                        account2.setAccountBalance(account2.getAccountBalance() + value);
                        return message= "La transacción se realizó de manera exitosa";
                    }else {
                        throw new NoCredit();
                    }
                }else {
                    throw new EqualAccount();
                }

            }else {
                throw new NoExistGetAccount();
            }
        }else {
            throw new NoExistSendAccount();
        }
    }

    public String printNumberAccounts(){
        return "NÚMERO DE LAS CUENTAS ALMACENADAS" + "\n"
                + account1.getNumberAccount() + "\n"
                + account2.getNumberAccount();

    }

}
