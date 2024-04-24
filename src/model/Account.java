package model;

import java.util.Random;

public class Account {
    private double accountBalance;
    private String nameOfOwner;
    private long numberAccount;

    public Account(double accountBalance, String nameOfOwner) {
        Random randomNumbers = new Random();
        this.accountBalance = accountBalance;
        this.nameOfOwner = nameOfOwner;
        this.numberAccount = Math.abs(randomNumbers.nextLong());
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


    @Override
    public String toString() {
        return "Account{" +
                "accountBalance=" + accountBalance +
                ", nameOfOwner='" + nameOfOwner + '\'' +
                ", numberAccount=" + numberAccount +
                '}';
    }
}