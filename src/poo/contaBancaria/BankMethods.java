package poo.contaBancaria;

public class BankMethods {

    private int  accountNumber;
    private String titularName;
    private double balance = 0.00;

    protected final double tax = 5.00;

    public  void deposit(double quantityToDeposit){
          balance += quantityToDeposit;
    }

    public  void sake(double quantityToSake){
        balance -= (quantityToSake + tax);
    }

    
    public String toString() {
        return String.format("Account: %d, Holder: %s, Balance: $%.2f", accountNumber, titularName, balance);
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getTitularName() {
        return titularName;
    }

    public void setTitularName(String titularName) {
        this.titularName = titularName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
