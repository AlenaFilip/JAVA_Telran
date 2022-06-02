import java.util.Date;

public class Person {
    String name;
    String eMail;
    String status;

    public Person(String name, String eMail, String status) {
        this.name = name;
        this.eMail = eMail;
        this.status = status;
    }
    @Override
    public String toString() {
        return name +", "+status ;
    }

    public void pay(){
        System.out.println("I don't know about the payment");
    }
    public String getName() {
        return name;
    }
}
