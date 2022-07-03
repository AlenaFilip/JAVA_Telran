public class Account {
    private String ibann;
    private double balance;

    public Account(String ibann, double balance) {
        this.ibann = ibann;
        this.balance = balance;
    }

    public Account(String ibann) {
        this.ibann = ibann;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public String balanceToString() {
        return String.format("%.2f",balance) ;
    }
}
