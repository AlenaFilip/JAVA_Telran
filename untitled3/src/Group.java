import java.util.ArrayList;
import java.util.List;

public class Group {
    private String title;
    private List<Student> students ;

    public Group(String title) {
        this.title = title;
    }
    public Group(String title, List<Student> students) {
        this.title = title;
        this.students = students;
    }

    public List<Student> getStudents() {
        return students;
    }

    public boolean addStudent(Student student){
        if (students==null) students = new ArrayList<>();
        return students.add(student);
    }
    public boolean addListStudents(List<Student> std){
        if(students==null && std != null){
            students = new ArrayList<>(std);
            return true;
        }
        return students.addAll(std);
    }
}
