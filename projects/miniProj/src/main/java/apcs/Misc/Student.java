package apcs.Misc;

import java.text.DecimalFormat;

public class Student {
    private String studentName;
    private double[] assignmentScores;
    private double averageGrade;
    private double pointsPossible;

    public Student(String studentName, double[] scores, double pointsPossible) {
        this.studentName = studentName;

        this.assignmentScores = new double[scores.length];
        for (int i = 0; i < scores.length; i++) {
            this.assignmentScores[i] = scores[i];
        }

        this.pointsPossible = pointsPossible;
        this.averageGrade = calculateAverage();
    }

    public double calculateAverage() {
        double earnedPoints = 0.0;
        for (int i = 0; i < assignmentScores.length; i++) {
            earnedPoints += assignmentScores[i];
        }
        return earnedPoints / pointsPossible;
    }

    // accessors
   public String getName() {
        return studentName;
    }

    public double getGrade() {
        return averageGrade;
    }
    public double[] getGrades() {
        return assignmentScores;
    }

    public String toString() {
        DecimalFormat df = new DecimalFormat("###.00%");
        return "Name: " + studentName + "\tGrade: " + df.format(averageGrade);
    }

}
