public abstract class Client {
    private String name;
    private Account account;

    public Client(String name, Account account) {
        this.name = name;
        this.account = account;
    }

    public String getName() {
        return name;
    }

    public Account getAccount() {
        return account;
    }

    public abstract void chargeInterest(double rate, double bonus, double minBalance);

    public double countRate(double balance, double rate){
        return ((double) Math.round(balance * rate /12)) / 100;
    }

    public void informBalance() {
        System.out.println("Print letter : dear "+getName()+" your balance = "+getAccount().balanceToString());
    }

}
