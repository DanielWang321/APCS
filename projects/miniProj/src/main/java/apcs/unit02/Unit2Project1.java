package apcs.unit02;
import java.util.Scanner;
public class Unit2Project1 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Input a: ");
    double a = sc.nextDouble();
    System.out.println("Input b: ");
    double b = sc.nextDouble();
    System.out.println("Input c: ");
    double c = sc.nextDouble();
    if (a == 0 ){
        System.out.println("Invalid Input, cant divide by 0");
        sc.close();
        return;
    }
    if((Math.pow(b,2)-4*a*c)<0){
        System.out.println("There are no real roots");
        sc.close();
        return;
    }
    double formulaOutputPlus = (-1*b+Math.pow((Math.pow(b,2)-4*a*c), 0.5))/(2*a);
    double formulaOutputMinus = (-1*b-Math.pow((Math.pow(b,2)-4*a*c), 0.5))/(2*a);
    
    if ((Math.pow(b,2)-4*a*c)== 0){
        System.out.println("The root is " + formulaOutputPlus);
    }else{
        System.out.println("The roots are " + formulaOutputPlus + " and " + formulaOutputMinus);
    }
    sc.close();
}
}