package apcs.unit06;

import java.text.DecimalFormat;

public class Student {
    private String name;
    private double[] listOfGrades;
    private double gradeAverage;
    private double totalPointsPossible;

    public Student(String name, double[] listOfGrades, double totalPoints) {
        this.name = name;
        this.listOfGrades = new double[listOfGrades.length];
        for (int i = 0; i < listOfGrades.length; i++) {
            this.listOfGrades[i] = listOfGrades[i];
        }
        this.totalPointsPossible = totalPoints;
        this.gradeAverage = calculateAverage();
    }
    
    public double calculateAverage() {
        double sum = 0;
        for (double grade : listOfGrades) {
            sum += grade;
        }
        return sum / totalPointsPossible;
    }
    //accessors
    public double getGrade() {
        return this.gradeAverage;
    }

    public double getGradeForAssignment(int assignmentNumber){
        return listOfGrades[assignmentNumber];
    }

    public String getFormatGrade(){
        DecimalFormat df = new DecimalFormat("###.00%");
        String roundedGrade = df.format(gradeAverage);
        return roundedGrade;
    }

    public double[] getListOfGrades() {
        return this.listOfGrades;
    }

    public String getName() {
        return this.name;
    }

    public String toString() {

        String builder = "Name: " + name + "\t\tGrade: " + getFormatGrade();
        return builder;
    }

}
