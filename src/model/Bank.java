package model;

public class Bank {
    private Account account1;
    private Account account2;

    public Bank(Account account1, Account account2){
        this.account1 = account1;
        this.account2 = account2;
    }

    public String makeTransferBetweenAccounts(Long numberAccount1 , Long numberAccount2 , double value ){
        String message = "";
        if (numberAccount1== account1.getNumberAccount()){
            if(numberAccount2 == account2.getNumberAccount()){
                if(account1.getAccountBalance()>= value){
                    account1.setAccountBalance(account1.getAccountBalance() - value);
                    account2.setAccountBalance(account2.getAccountBalance() + value);
                    return message = "La transacción se realizó de manera exitosa";
                }else {
                    return message= "NO se tiene el saldo suficiente en la cuenta";
                }
            }else {
                return message = "No existe una cuenta que reciba el dinero con ese número";
            }
        }else {
            return message = "No existe una cuenta que envíe el dinero con ese número";
        }
    }

    public String printNumberAccounts(){
        String message = "";
        return message = "NÚMERO DE LAS CUENTAS ALMACENADAS" + "\n"
                + account1.getNumberAccount() + "\n"
                + account2.getNumberAccount();
    }

}
