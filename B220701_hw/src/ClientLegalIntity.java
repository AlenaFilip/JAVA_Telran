public class ClientLegalIntity extends Client {

    public ClientLegalIntity(String name, Account account) {
        super(name, account);
    }
    @Override
    public void chargeInterest(double rate, double bonus, double minBalance) {
        double balance = getAccount().getBalance();
        if (balance>=minBalance) {
            double amount = countRate(balance, rate);
            getAccount().setBalance(balance + amount);
            System.out.println("Charge interest as Legal Intity = " + amount);
        }
    }
}
