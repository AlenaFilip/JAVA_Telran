/*Given two arrays. The first is String[n] students – names of students. The second is int[n][] grades – the array of grades for student homework. Every row of grades array is one student's grades (grades[k] is the grades of students[k]). Note, that each student has a different number of grades. You should implement the program that finds and displays the student with highest GPA and the score.
Example:
{Jack, Nick} { { 3,4,2}, { 5,5,5,4} } -> Nick 4.75
 */
public class Main {
    public static void main(String[] args) {
        String[] students = {"Jack", "Nick"};
        int[][] notes = {{3,4,2},{5,5,5,4}};
        double maxGrade = 0;
        int maxNumb = 0;
        for (int i = 0; i < students.length; i++) {
            Student st = new Student(students[i], notes[i]);
            if (st.midlGrade()>maxGrade){
                maxGrade = st.midlGrade();
                maxNumb = i;
            }
        }
        System.out.println(students[maxNumb]+" "+maxGrade);
    }
}
