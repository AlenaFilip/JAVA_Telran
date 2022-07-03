public class ClientVIP extends Client{
    public ClientVIP(String name, Account account) {
        super(name, account);
    }

    @Override
    public void chargeInterest(double rate, double bonus, double minBalance) {
        double balance = getAccount().getBalance();
        double amount = countRate(balance, rate+bonus);

        getAccount().setBalance(balance+amount);
        System.out.println("Charge interest as VIP = "+amount);
    }

    @Override
    public void informBalance() {
        super.informBalance();
        System.out.println("Send E-mail : dear "+getName()+" your balance = "+getAccount().balanceToString());
    }
}
