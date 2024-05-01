package model;

import exceptions.*;

public class Bank {
    private Account account1;
    private Account account2;

    public Bank(Account account1, Account account2){
        this.account1 = account1;
        this.account2 = account2;
    }

    public String makeTransferBetweenAccounts(Long numberAccount1 , Long numberAccount2 , double value) throws NoCredit, EqualAccount, NoExistAccount {
        if (numberAccount1 != null && numberAccount2 != null) {
            if(!numberAccount1.equals(numberAccount2)) {
                if (numberAccount1 == account1.getNumberAccount()){
                    if(numberAccount2 == account2.getNumberAccount()) {
                        if(account1.getAccountBalance()>= value){
                            account1.setAccountBalance(account1.getAccountBalance() - value);
                            account2.setAccountBalance(account2.getAccountBalance() + value);
                            return "La transacción se realizó de manera exitosa";
                        }else {
                            throw new NoCredit();
                        }
                    } else {
                        throw new NoExistAccount();
                    }
                } else {
                    throw new NoExistAccount();
                }
            } else {
                throw new EqualAccount();
            }
        } else {
            throw new NoExistAccount();
        }
    }

    public String printNumberAccounts(){
        return "NÚMERO DE LAS CUENTAS ALMACENADAS" + "\n"
                + account1.getNumberAccount() + "\n"
                + account2.getNumberAccount();

    }

}
