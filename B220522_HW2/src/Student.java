public class Student {
    String name;
    int[] grade;

    public Student(String name, int[] grade){
        this.name = name;
        this.grade = grade;
    }

    public double midlGrade(){
        int i = 0;
        int sum = 0;
        for (i = 0; i < grade.length; i++) {
            sum +=grade[i];
        }
        return 1.0 * sum / i ;
    }
}
