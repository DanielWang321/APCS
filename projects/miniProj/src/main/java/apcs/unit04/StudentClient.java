package apcs.unit04;

public class StudentClient{
    public static void main(String[] args) {
        Student s1 = new Student(225990, "Advaita", 45);
        Student s2 = new Student(225991, "Bob");
        s2.setgrade(45);
        System.out.println(s1);
        s1.setName("Star Wars");
        Student.checkPassFail(s1.getName(), s1.getGrade() );
    }
}