import java.util.*;

/* У вас есть два класса Student{String name, int tasksDone}
(поле tasksDone – количество решенных задач) и класс Group{String title, List<Student>}.
Дан список Group. Необходимо получить список из 3 студентов,
решивших наибольшее количество задач. Обратите внимание,
один студент может посещать занятие в нескольких группах.
Подсказка: необходимо использовать Set студентов. */
public class Main {

    public static void main(String[] args) {
        Student st1 = new Student("Anna", 5);
        Student st2 = new Student("Kolya",7 );
        Student st3 = new Student("Ivan", 12);
        Student st4 = new Student("Igor", 41);
        Student st5 = new Student("Jack", 3);
        Student st6 = new Student("John", 35);
        Student st7 = new Student("Alla", 35);
        Student st8 = new Student("Olga", 35);
        Student st9 = new Student("Alena", 35);
        Student st0 = new Student("Dzmitry", 35);
        Student st10 = new Student("Andrei", 71);
        Group gr1 = new Group("g20 morning",List.of(st1,st2,st3,st4,st7,st9));
        Group gr2 = new Group("g23 evening",List.of(st6,st7,st3,st4,st7,st10));
        Group gr3 = new Group("g28 morning",List.of(st1,st2,st3,st8,st9,st7));
        List<Group> groups = Arrays.asList(new Group[] {gr1, gr2, gr3});
        TreeSet <Student> allstudents = makeAllStudents(groups);
        for (Student s: allstudents) {
            System.out.println(s);
        }
        System.out.println("--------------3 Students: --------------");
        List <Student> students3 = make3Students(allstudents);
        for (Student s: students3) {
            System.out.println(s);
        }
    }

    public static List<Student> make3Students(TreeSet <Student> set){
        List<Student> result = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            result.add(set.pollFirst());
        }
        return result;
    }

    public static TreeSet<Student> makeAllStudents(List<Group> groups){
        TreeSet <Student> result = new TreeSet<>();
        for (Group g :groups) {
            for (Student st: g.getStudents()) {
                result.add(st);
            }
        }
        return result;
    }
}
