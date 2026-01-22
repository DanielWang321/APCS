package apcs.unit06;
import java.util.Arrays;
public class StudentTest {
    public static void main(String[] args) {
        double[] grades = { 10, 9.5, 10, 8 };
        Student me = new Student("Prosser", grades, 40);
        System.out.println(me);
        System.out.println(Arrays.toString(me.getListOfGrades()));
        System.out.println(me.getGrade());
        System.out.println(me.getName());
    }

}
