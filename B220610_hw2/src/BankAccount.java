public class BankAccount {
    private String iban ;
    private double balance;

    public BankAccount(String iban) {
        this.iban = iban;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return iban + ", balance=" + balance;
    }
}
