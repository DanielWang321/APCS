package apcs.unit04;

public class Student {
    //three pieces of instance data
    private int studentID;
    private String name;
    private int grade;
    //this constructor lets me create a Student when I know all the information.
    public Student(int studentID, String name, int grade) {
        this.studentID = studentID;
        this.name = name;
        this.grade = grade;
    }
    // This constructor is for when I do not know the grade yet.
    public Student(int studentID, String name) {
        this.studentID = studentID;
        this.name = name;
        this.grade = 0; // default grade
    }
    //I included setters for name and grade, because those can  change
    // but studentID should not change, so no setter for that
    //I have getters so other classes can read students information.
    public void setgrade(int grade) {
        this.grade = grade;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getStudentID() {
        return studentID;
    }
    public String getName() {
        return name;
    }
    public int getGrade() {
        return grade;
    }
    // This is my fun/cool method.
    public static void checkPassFail(String name, int grade) {
        if (grade >= 60) {
            System.out.println(name + " has passed");
        } else {
            System.out.println(name + " has failed");
        }
    }
    public String toString(){
        return ("Student: " + name + "\nID: " + studentID + "\nGrade: " + grade);
    }


}
