public class ClientIndividual extends Client {
    public ClientIndividual(String name, Account account) {
        super(name, account);
    }

    @Override
    public void chargeInterest(double rate, double bonus, double minBalance) {
        double balance = getAccount().getBalance();
        double amount = countRate(balance, rate);
        getAccount().setBalance(balance+amount);
        System.out.println("Charge interest as individual = "+amount);
    }
}
