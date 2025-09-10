package apcs.unit01;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double PI = 355.0/113;
        System.out.println("Enter Base of Triangle: "); //TRIANGLE
        double triBase = sc.nextDouble();
        System.out.println("Enter Height of Triangle: ");
        double triHeight = sc.nextDouble();
        System.out.println("Enter Height of Rectangle: ");//RECTANGLE
        double recHeight = sc.nextDouble();
        System.out.println("Enter Width of Rectangle: ");
        double recWidth = sc.nextDouble();
        System.out.println("Enter Radius of Circle: ");//CIRCLE
        double radius = sc.nextDouble();

        double triArea = triBase * triHeight * 0.5;
        double recArea = recHeight * recWidth;
        double circArea = Math.pow(radius,2.0) * PI;
        double roundedTriArea = (int)((triArea+0.005)*100) /100.00;
        double roundedRecArea = (int)((recArea+0.005)*100) /100.00;
        double roundedCircArea = (int)((circArea+0.005)*100) /100.00;
        System.out.println("Shape\t\tArea");
        System.out.println("Triangle\t"+ roundedTriArea);
        System.out.println("Rectangle\t"+roundedRecArea);
        System.out.println("Circle\t\t"+roundedCircArea);
        sc.close();
    }
}
