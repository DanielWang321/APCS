package apcs.Misc;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Gradebook {
    private Student[] students;
    private double[] possibleScores;
    private double totalPossiblePoints;

    public Gradebook(int numStudents, int numGrades, String fileName) throws FileNotFoundException {
        students = new Student[numStudents];
        possibleScores = new double[numGrades];
        Scanner fScan = new Scanner(new File(fileName));

        fScan.next();
        for (int i = 0; i < numGrades; i++) {
            possibleScores[i] = fScan.nextDouble();
        }
        fScan.nextLine();

        for (double val : possibleScores) {
            totalPossiblePoints += val;
        }

        for (int i = 0; i < numStudents; i++) {
            String name = fScan.next();
            double[] gradeList = new double[numGrades];

            for (int j = 0; j < numGrades; j++) {
                gradeList[j] = fScan.nextDouble();
            }
            students[i] = new Student(name, gradeList, totalPossiblePoints);
        }
    }

    public String toString() {
        String output = "";
        for (int i = 0; i < students.length; i++) {
            output += students[i] + "\n";
        }
        return output;
    }

    public Student findTopStudent() {
        int bestIndex = 0;
        for (int i = 1; i < students.length; i++) {
            if (students[i].getGrade() > students[bestIndex].getGrade()) {
                bestIndex = i;
            }
        }
        return students[bestIndex];
    }

    public Student findStrugglingStudent() {
        int worstPersonIndex = 0;
        for (int i = 1; i < students.length; i++) {
            if (students[i].getGrade() < students[worstPersonIndex].getGrade()) {
                worstPersonIndex = i;
            }
        }
        return students[worstPersonIndex];
    }

    public Student findTopStudentForAssignment(int assignmentNum) {
        int topIndex = 0;
        for (int i = 1; i < students.length; i++) {
            if (students[i].getGrades()[assignmentNum] > students[topIndex].getGrades()[assignmentNum]) {
                topIndex = i;
            }
        }
        return students[topIndex];
    }

    public Student findStrugglingStudentForAssignment(int assignmentNum) {
        int lowIndex = 0;
        for (int i = 1; i < students.length; i++) {
            if (students[i].getGrades()[assignmentNum] < students[lowIndex].getGrades()[assignmentNum]) {
                lowIndex = i;
            }
        }
        return students[lowIndex];
    }

    public double[] findStudentAverages() {
        double[] averages = new double[students.length];
        for (int i = 0; i < students.length; i++) {
            averages[i] = students[i].getGrade();
        }
        return averages;
    }

    public double[] findAssignmentAverages() {
        double[] assignmentAverages = new double[possibleScores.length];
        for (int i = 0; i < possibleScores.length; i++) {
            double earnedTotal = 0.0;
            for (int j = 0; j < students.length; j++) {
                earnedTotal += students[j].getGrades()[i];
            }
            double possibleTotal = possibleScores[i] * students.length;
            assignmentAverages[i] = earnedTotal / possibleTotal;
        }

        return assignmentAverages;
    }
}
