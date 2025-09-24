package apcs.unit02;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Notes_2_2and3 {
    public static void main(String[] args) {
        /*
         * // EXAMPLE 1
         * int age = 0;
         * // get age from user
         * if (age < 3) {
         * System.out.println("You get into Disney World for free!"); // prints| prints;
         * not print; not print
         * }
         * if (age < 10) {
         * System.out.println("You get to eat as a child at Disney World!"); // prints|
         * prints, prints; not print
         * } else {
         * System.out.
         * println("You have to pay full price for everything at Disney World"); // not
         * print| not print,
         * // not print, print
         * }
         * // what would print if the user entered 2? 9? 30?
         * 
         * // EXAMPLE 2
         * if (age < 3) {
         * System.out.println("You get into Disney World for free!"); // rpint| print;
         * not print, not print
         * } else if (age < 10) {
         * System.out.println("You get to eat as a child at Disney World!"); // not
         * print| not print; print; not print
         * } else {
         * System.out.
         * println("You have to pay full price for everything at Disney World"); // not
         * print| not print;not print; print
         * }
         * // what would print if the user entered 2? 9? 30?
         */

        // scope of a variable: a description of where the variable can be used
        // a variable is LOCAL to the block in which it is declared
        /*
         * Control Structures
         * 1. Branching Structure
         * -if statement
         * if(boolean statement)
         * {
         * //code that will execute if statement is true
         * }
         *
         * -if-else statement
         * if(boolean statement)
         * {
         * //code that will execute if statement is true
         * }
         * else
         * {
         * //code that will execute if statement is false
         * }
         *
         * -if-else-if
         * if(boolean statement)
         * {
         * //code to execute if statement is true
         * }
         * else if(booleanstatement2)
         * {
         * //code to execute if statement2 is true
         * }
         * //as many else-if statements as necessary
         * else
         * {
         * //code to execute if none of the statements above are
         * true
         * }
         *
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
         * Example 1a: write a program that calculates an hourly worker's weekly pay
         * if the user enters a negative number for any input, tell them
         * their input is invalid and quit the program
         * Example 1b: ask the user if they are paid hourly (1) or salary (2)
         * set a boolean variable called isHourlyWorker to true or false
         * based on the user's response
         * Example 1c: calculate the user's hourly or salary weekly pay
         * Example 2: Write a program that outputs an appropriate message based on
         * a user's letter grade in a class
         */
        Scanner sc = new Scanner(System.in);
        double hours, hourlyPay, weeklyPay, annualSalary;
        int payTypeInput;
        DecimalFormat df = new DecimalFormat("$#,###.00");
        System.out.println("Salary(1) or Hourly(2)");
        payTypeInput = sc.nextInt();
        if (payTypeInput != 1 && payTypeInput != 2) {
            System.out.println("Invalid");
            return;
        }
        boolean isHourlyWorker = payTypeInput == 2;
        //
        if (isHourlyWorker) {
            System.out.println("Enter pay per hour");
            hourlyPay = sc.nextDouble();
            if (hourlyPay < 0) { // bad input for hourly rate
                System.out.println("Invalid input");
                return;
            }
            System.out.println("Enter hours: ");
            hours = sc.nextDouble();
            if (hours < 0 || hours > 168) { // bad input for amt of hours
                System.out.println("Invalid amount of hours");
                return;
            }
            if (hours > 40) {
                weeklyPay = ((hours - 40) * 1.5 + 40) * hourlyPay;
            } else {
                weeklyPay = hours * hourlyPay;
            }
        } else {// salaried worker
            System.out.println("Please enter annual salary: ");
            annualSalary = sc.nextDouble();
            if (annualSalary < 0) {
                System.out.println("Invalid Input");
                return;
            }
            weeklyPay = annualSalary / 52;
        }

        System.out.println("Paycheck this week: " + df.format(weeklyPay));

    }
}