public class BankAccountWithOwner{
    private Person owner;
    private BankAccount iban;

    public BankAccountWithOwner(Person owner, BankAccount iban) {
        this.owner = owner;
        this.iban = iban;
    }

    @Override
    public String toString() {
        return "owner=" + owner +", iban=" + iban ;
    }
}

