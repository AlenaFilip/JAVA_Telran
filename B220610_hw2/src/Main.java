import java.util.ArrayList;
import java.util.List;

/* Given a list of Person (String name, List<BankAccount> accounts) .
BankAccount is the class with following fields: String iban, double balance.
Create class BankAccountWithOwner (Person owner, String iban, double balance).
Implement the method that returns the List of BankAccountWithOwner.
 */
public class Main {
    public static void main(String[] args) {
        //   делаю 3 персоны: сначала создаю по 1-2 BankAccount, делаю из них листы, потом делаю Person
        BankAccount b11 = new BankAccount("123455DE");
        BankAccount b12 = new BankAccount("223455DE");
        List<BankAccount> ls1 = new ArrayList<>();
        ls1.add(b11);
        ls1.add(b12);
        Person ps1 = new Person("Anna",ls1);
        BankAccountWithOwner ba1 = new BankAccountWithOwner(ps1, b11);
        BankAccountWithOwner ba2 = new BankAccountWithOwner(ps1, b12);
        BankAccount b2 = new BankAccount("ps2DE");
        List<BankAccount> ls2 = new ArrayList<>();
        ls2.add(b2);
        Person ps2 = new Person("Fedya",ls2);
        BankAccount b31 = new BankAccount("ps3155DE");
        BankAccount b32 = new BankAccount("ps32455DE");
        List<BankAccount> ls3 = new ArrayList<>();
        ls3.add(b31);
        ls3.add(b32);
        Person ps3 = new Person("Anna",ls1);
        // делаю лист из персон
        List<Person> persons = new ArrayList<>();
        persons.add(ps1);
        persons.add(ps2);
        persons.add(ps3);

        // вызываю метод, который создает лист  of BankAccountWithOwner для одного Person
        // сколько у человека счетов, столько элементов в листе
        List<BankAccountWithOwner> lst1 = creatList(ps1);
        for (BankAccountWithOwner l: lst1) {
            System.out.println(l);
        }

    }

    public static List<BankAccountWithOwner> creatList(Person person){
        List<BankAccountWithOwner> res = new ArrayList<>();
        for (BankAccount s : person.lstBa) {
            BankAccountWithOwner ba = new BankAccountWithOwner(person, s);
            res.add(ba);
        }
        return res;
    }
}
