package model;

public class Account {
    private Double accountBalance;
    private String nameOfOwner;
    private Long numberAccount;

    public Account(Double accountBalance, String nameOfOwner) {
        this.accountBalance = accountBalance;
        this.nameOfOwner = nameOfOwner;
        this.numberAccount = numberAccount;
    }

    public Double getAccountBalance() {
        return accountBalance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountBalance=" + accountBalance +
                ", nameOfOwner='" + nameOfOwner + '\'' +
                ", numberAccount=" + numberAccount +
                '}';
    }

    public void setRevenue(Double Revenue){
        accountBalance  = accountBalance + Revenue;

    };
    public void setRefunds(double Refunds){
        if (accountBalance >= Refunds){
            accountBalance = accountBalance - Refunds;
        }else {
            System.out.println("insufficient funds");
        }
    }

}