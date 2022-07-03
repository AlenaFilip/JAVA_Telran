import java.util.Comparator;
import java.util.Objects;

public class Student implements Comparable {
    private String name;
    private int taskDone;

    public Student(String name, int taskDone) {
        this.name = name;
        this.taskDone = taskDone;
    }

    public int getTaskDone() {
        return taskDone;
    }

    @Override
    public int compareTo(Object o) {
        if (((Student)o).getTaskDone() != taskDone) return ((Student)o).getTaskDone() - taskDone;
        return name.compareTo(((Student) o).name);
    }

    @Override
    public String toString() {
        return name + ", taskDone=" + taskDone;
    }
}
