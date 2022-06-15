import java.util.List;

public class Person {
    private String name;
    public List<BankAccount> lstBa;

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, List<BankAccount> lstBa) {
        this.name = name;
        this.lstBa = lstBa;
    }

    public List<BankAccount> getLstBa() {
        return lstBa;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name ;
    }
}
