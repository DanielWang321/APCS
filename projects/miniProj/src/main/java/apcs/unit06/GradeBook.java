package apcs.unit06;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class GradeBook {
    private Student[] students;
    private double[] possibleScores;

    public GradeBook(int numStudents, int numGrades, String file) throws FileNotFoundException{
        students = new Student[numStudents];
        possibleScores = new double[numGrades];
        File f = new File(file);
        Scanner fScan = null;
        try {
            fScan = new Scanner(f);
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        fScan.next();
        for (int i = 0; i < numGrades; i++) {
            possibleScores[i] = fScan.nextDouble();
        }
        fScan.nextLine();
        
        for (int i = 0; i < numStudents; i++) {
            String name = fScan.next();
            double[] tempGradeList = new double[numGrades];
            for (int k = 0; k < numGrades; k++) {
                tempGradeList[k] = fScan.nextDouble();
            }
            students[i] = new Student(name, tempGradeList, getSumOfList(possibleScores));
        }
    }

    private double getSumOfList(double[] ar) {
        double sum = 0;
        for (double d : ar) {
            sum += d;
        }
        return sum;
    }

    public String toString() {
        String builder = "";
        for (int i = 0; i < students.length; i++) {
            builder += "Name: " + students[i].getName() + "\t Grade: " + students[i].getFormatGrade() + "\n";
        }
        return builder;
    }

    public Student findTopStudent() {
        int bestStudentIndex = 0;
        for (int i = 1; i < students.length; i++) {
            if (students[i].getGrade() > students[bestStudentIndex].getGrade()) {
                bestStudentIndex = i;
            }
        }
        return students[bestStudentIndex];
    }

    public Student findBottomStudent() {
        int worstStudentIndex = 0;
        for (int i = 1; i < students.length; i++) {
            if (students[i].getGrade() < students[worstStudentIndex].getGrade()) {
                worstStudentIndex = i;
            }
        }
        return students[worstStudentIndex];
    }

    public double[] getAssignmentAverages() {
        double[] assingmentAverages = new double[possibleScores.length];
        for (int i = 0; i < assingmentAverages.length; i++) {// for each assignment
            double sumEarned = 0;
            double sumPossible = 0;
            for (int j = 0; j < students.length; j++) { // for each student
                sumEarned += students[j].getGradeForAssignment(i);
                sumPossible += possibleScores[i];
            }
            assingmentAverages[i] = sumEarned / sumPossible;
        }
        return assingmentAverages;
    }

    public double[] findStudentAverages() {
        double[] studentAverages = new double[students.length];
        for (int i = 0; i < students.length; i++) {
            studentAverages[i] = students[i].getGrade();
        }
        return studentAverages;
    }

    public Student findTopStudentForAssignment(int assignmentNum) {
        int topStudentIndex = 0;
        for (int i = 1; i < students.length; i++) {
            if (students[i].getGradeForAssignment(assignmentNum) > students[topStudentIndex]
                    .getGradeForAssignment(assignmentNum)) {
                topStudentIndex = i;
            }
        }
        return students[topStudentIndex];
    }

    public Student findBottomStudentForAssignment(int assignmentNum) {
        int bottomStudentIndex = 0;
        for (int i = 1; i < students.length; i++) {
            if (students[i].getGradeForAssignment(assignmentNum) < students[bottomStudentIndex]
                    .getGradeForAssignment(assignmentNum)) {
                bottomStudentIndex = i;
            }
        }
        return students[bottomStudentIndex];
    }
}
