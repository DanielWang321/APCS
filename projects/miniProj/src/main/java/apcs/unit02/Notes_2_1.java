package apcs.unit02;

import java.util.Scanner;

//Programming exercise: ask the user to enter two integer values (num1 and num2).
// output "second number is a factor of first number" if that's the case,
// output "second number is not a factor of first number" if that's the case.
public class Notes_2_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("num1");
        int num1 = sc.nextInt();
        System.out.println("num2");
        int num2 = sc.nextInt();

        if (num1 % num2 == 0) {
            System.out.println("num2 is a factor of num1");
        } else {
            System.out.println("num2 is not a factor of num1");
        }
    }
}
/*
 * Arithmetic Expression vs. Boolean Expression
 *
 * Arithmetic Expression -
 * Operands - numeric
 * Operators - arithmetic operators (+, -, *, / %)
 * Evaluates to - numeric
 *
 * Boolean Expression -
 * evaluates to - boolean (true/false)
 * operators
 * 1. Relational (<, >, <=, >=, ==, !=)
 * operands - numeric
 * 2. Logical (&&, ||, ^, !)
 * operands - boolean
 * **look at truth tables
 *
 * short circuit evaluation - boolean expressions are evaluated
 * until the truth value is known
 *
 * examples: T || ____ is _T__, so the evaluation stops after the ||
 * F && ____ is _F__, so the evaluation stops after the &&
 *
 * Programming exercise: ask the user to enter two integer values (num1 and
 * num2).
 * output "second number is a factor of first number" if that's the case,
 * output "second number is not a factor of first number" if that's the case.
 *
 * boolean truthValue;
 * int x = 5, y = 0, z = -1;
 * truthValue = x < y;
 * System.out.println(truthValue); //false
 * truthValue = x == x;
 * System.out.println(truthValue); //true
 * truthValue = !(x != y);
 * System.out.println(truthValue); //false
 * truthValue = x < y && y < z;
 * System.out.println(truthValue); //false
 * truthValue = y < x || x == y;
 * System.out.println(truthValue); //true
 * truthValue = y < x || (x / y < 0);
 * System.out.println(truthValue); //true: program will only see y<x and short
 * circuits
 * Practice writing boolean expressions:
 * write an expression to represent:
 * 1. x is greater than 5 x>5
 * 2. y is less than or equal to 2 y<=2
 * 3. weight is equal to 0 weight==0
 * 4. cost is between 0 and 80 inclusive //cost>=0 && cost <= 80
 * 5. input is less than 0 (inclusive) or greater than 10 (inclusive) input<=0
 * || input>=10
 * 6. age is not between 13 and 19 (inclusive) age>19 || age<13
 * 7. numStudents is between 1 and classroomCapacity (inclusive) numStudents >=
 * 1 && numStudents<=classroomCapacity
 * Write the expression that represents the OPPOSITE
 * of the expression given
 * 1. x > 0 x<=0
 * 2. y == 8 y!=8
 * 3. age <= 100 age > 100
 * 4. weight > 100 || weight < 30 weight <=100 && weight >= 30
 * 5. height >= 50 && height < 75 height<50 || height >=75
 * 6. !(input < 90 && input > 45) input<90 && input > 45
 * Let's say that I have a menu in my program like this:
 * 1. Play game
 * 2. See high scores
 * 3. Exit
 * I want to force the user to enter valid input, so I put the following loop
 * in my program:
 * do
 * {
 * //ask for input of 1, 2, or 3
 * //read in input
 * }while(!(input >= 1 && input<=3)); //while input is not 1, 2, or 3
 * finish the code above
 */