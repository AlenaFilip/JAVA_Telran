import java.util.ArrayList;

public class Teacher extends Person{
    Integer salary;
    String subject;

    public Teacher(String name, String eMail, Integer salary, String subject) {
        super(name, eMail,"teacher");
        this.salary = salary;
        this.subject = subject;
    }

    public void pay(){
        System.out.println("I am getting my salary "+salary);
    }

    @Override
    public String toString() {
        return name +", "+status+ ", subject " + subject + ", eMail= " + eMail ;
    }
}
