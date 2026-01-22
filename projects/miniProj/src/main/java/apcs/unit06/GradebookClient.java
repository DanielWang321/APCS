package apcs.unit06;

import java.io.FileNotFoundException;
import java.text.DecimalFormat;

public class GradebookClient 
{
	public static void main(String[] args) throws FileNotFoundException
	{
		GradeBook gb = null;
		gb = new GradeBook(7, 5, "projects\\miniProj\\data\\grades.txt");
		
		System.out.println(gb);
		
		Student top = gb.findTopStudent();
		System.out.println("Top Student: " + top);
		Student bottom = gb.findBottomStudent();
		System.out.println("Struggling Student: " + bottom);
		
		Student top1 = gb.findTopStudentForAssignment(2);
		Student bottom1 = gb.findBottomStudentForAssignment(2);
		System.out.println("Top Student for assignment 2: " + top1);
		System.out.println("Struggling Student for assignment 2: " + bottom1);
		
		double[] studAvs = gb.findStudentAverages();
		double[] assignAvs = gb.getAssignmentAverages();
		
		print(studAvs);
		print(assignAvs);
	}

	public static void print(double[] ar)
	{
		DecimalFormat df = new DecimalFormat("###.00%");
		for(double d : ar)
			System.out.print(df.format(d) + "\t");
		System.out.println();
	}
}

