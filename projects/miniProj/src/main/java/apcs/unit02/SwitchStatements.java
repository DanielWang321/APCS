package apcs.unit02;
import java.util.Scanner;
public class SwitchStatements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char letterGrade;
        System.out.println("Enter letter grade: ");
        String input = sc.next();
        //they enter anything other than A,B,C,D: handle using default case
        //lower vs upper case
        input = input.toUpperCase(); //sets input to all uppercase version of itself
        letterGrade= input.charAt(0); //first character of input and assigns to lettergrade
        //sc.next().toUpperCase().charAt(0)
        switch(letterGrade){
            case 'A':
                System.out.println("Awesome");
                break;
            case 'B':
                System.out.println("Broke");
                break;
            case 'C':
                System.out.println("Completely dumb");
                break;
            case 'D':
                System.out.println("Diabolical");
                break;
            case 'E':  
            case 'F':
                System.out.println("Exit the house");
                break;
            default:
                System.out.println("Invalid input");
        }

        /*
         * * -switch statement
         *
         * switch(controllingExpression)
         * {
         * case __:
         * //code to execute if case is matched
         * break;
         * case __:
         * //code to execute if case is matched
         * break;
         * .
         * .
         * .
         * default:
         * //code to execute if no case is matched
         * }
         *
         */



        /*
         * Example 2: Write a program that outputs an appropriate message based on
         * a user's letter grade in a class
         */
    }
}