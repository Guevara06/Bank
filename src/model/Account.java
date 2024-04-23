package model;

public class Account {
    private double accountBalance;
    private String nameOfOwner;
    private long numberAccount;

    public Account(double accountBalance, String nameOfOwner, long numberAccount) {
        this.accountBalance = accountBalance;
        this.nameOfOwner = nameOfOwner;
        this.numberAccount = numberAccount;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getNameOfOwner() {
        return nameOfOwner;
    }

    public void setNameOfOwner(String nameOfOwner) {
        this.nameOfOwner = nameOfOwner;
    }

    public long getNumberAccount() {
        return numberAccount;
    }

    public void setNumberAccount(long numberAccount) {
        this.numberAccount = numberAccount;
    }


}