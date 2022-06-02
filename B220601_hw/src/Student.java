import java.util.ArrayList;
import java.util.Arrays;

public class Student extends Person{
    Integer amountPay;
    ArrayList<Integer> notes;

    public Student(String name, String eMail, Integer amountPay, ArrayList<Integer> notes) {
        super(name, eMail,"student");
        this.notes = notes;
        this.amountPay = amountPay;
    }

    public Student(String name) {
        this(name,"no ",1300,new ArrayList<>());
    }

    @Override
    public String toString() {
        return name +", "+status+ ", eMail= " + eMail ;
    }

    public void pay(){
        System.out.println("I am paying for my studies "+amountPay);
    }

    public void makeNote(Integer note){
        notes.add(note);
    }


    public double midlNote(){
        double result = 0.0;
        int i ;
        if (notes.size() == 0) return 0.0;
        for (i = 0; i < notes.size(); i++) {
            result+=notes.get(i);
        }
        return Math.round(result * 100.0 / i ) /100.0;
    }
     public void addNote(int nt){
        notes.add(nt);
     }

}
