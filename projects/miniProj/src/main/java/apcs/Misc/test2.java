package apcs.Misc;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class test2 {
    private Student[] students;
    private double[] posScores;

    // constructor
    public test2(int numOfStudents, int numOfGrades, String file) throws FileNotFoundException {

        Scanner fs = new Scanner(new File(file));
        students = new Student[numOfStudents];
        posScores = new double[numOfGrades];
        double[] scores = new double[numOfGrades];

        double total = 0;
        String name = "";
        fs.next();
        for (int j = 0; j < numOfGrades; j++) {
            posScores[j] = fs.nextDouble();
            total += posScores[j];
        }

        for (int i = 0; i < numOfStudents; i++) {
            name = fs.next();
            for (int j = 0; j < numOfGrades; j++)
                scores[j] = fs.nextDouble();
            students[i] = new Student(name, scores, total);
        }
        fs.close();
    }

    // findAssignmentAverage
    public static double[] findAssignmentAverages() {
        double[] assignmentAverages = new double[posScores.length];

        for (int i = 0; i < posScores.length; i++) {

        }
    }
}