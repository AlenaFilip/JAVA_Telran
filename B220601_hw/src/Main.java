import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> nt1 = new ArrayList<>();
	    Student st1 = new Student("Anna", "emailanna@tut",1100, nt1);
        ArrayList<Integer> nt2 = new ArrayList<>();
        nt1.add(1);
        nt1.add(1);
        nt1.add(3);
        nt1.add(4);
        nt1.add(2);
        nt2.add(3);
        nt2.add(4);
        nt2.add(1);
        Student st2 = new Student("Oleg", "emailoleg@tut",1100, nt2);
        Teacher tc1 = new Teacher("Vitya", "myEmail",4800,"Algorithms");
        Guest g1 = new Guest("Ivan");
        List<Person> list = new ArrayList<>();
        list.add(st1);
        list.add(st2);
        list.add(tc1);
        list.add(g1);
        for (Person s: list){
            System.out.println("------" + s.toString());
            s.pay();
        }

        List<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        Student st3 = new Student("Kolya");
        students.add(st3);
        st3.addNote(1);
        st3.addNote(1);
        st3.addNote(2);
        System.out.println("------ middle notes ----------");
        for (Student k: students) {
            System.out.println(k.getName()+" = "+k.midlNote());
        }
    }

}
