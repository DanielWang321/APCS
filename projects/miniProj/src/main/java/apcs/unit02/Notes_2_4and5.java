package apcs.unit02;

import java.util.Scanner;
import java.util.Random;
public class Notes_2_4and5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        int userGuess, random = 0;
        random = (int)(Math.random()*10) + 1;
        Random r = new Random();
        random = r.nextInt(10)+ 1;
        System.out.println("Enter number");
        userGuess = sc.nextInt();
        if(userGuess > random){
            System.out.println("Too high");
        }else if(userGuess == random){
            System.out.println("Correct");
        }else{
            System.out.println("Too low");
        }*/
        /*
        // what is wrong with the following code? its not if else if
        // what value(s) of z will demonstrate the error? 10
        // how can you fix the error? add an else if
        int z = 0;
        if (z > 0) {
            System.out.println("z is positive");
        }
        if (z < 0) {
            System.out.println("z is negative");
        } else {
            System.out.println("z is zero");
        }
        // what is wrong with the following code? its not if else
        // what value(s) of grade will demonstrate the error? 97
        // how can you fix the error? add else ifs
        double grade = 97.7;
        if (grade >= 90)
            System.out.println("A");
        if (grade >= 80)
            System.out.println("B");
        if (grade >= 70)
            System.out.println("C");
        if (grade >= 60)
            System.out.println("D");
        else
            System.out.println("E");
        // What is the output of this code segment if the user enters 5? 16
        // If the user enters 10? 21
        // If the user enters 15? 26
        // If the user enters 20? 31
        // If the user enters 30? 41
        // If the user enters 31? 42
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        if (x <= 10)
            x = x + 11;
        else if (x <= 20)
            x = x + 11;
        else if (x <= 30)
            x = x + 11;
        else
            x = x + 11;
        System.out.println(x);
        // What is the output of this code segment if the user enters 5? 38
        // If the user enters 10? 32
        // If the user enters 15? 37
        // If the user enters 20? 42
        // If the user enters 30? 41
        // If the user enters 31? 42
        x = input.nextInt();
        if (x <= 10)
            x = x + 11;
        if (x <= 20)
            x = x + 11;
        if (x <= 30)
            x = x + 11;
        else
            x = x + 11;
        System.out.println(x);
        // What is the output of this code segment if the user enters 5? UNDER TEN
        // If the user enters 8? UNDER TEN
        // If the user enters 10? EVEN
        x = input.nextInt();
        if (x < 10)
            System.out.println("UNDER TEN");
        else if (x % 2 == 0)
            System.out.println("EVEN");
        else if (x > 5)
            System.out.println("OVER FIVE");
        else
            System.out.println("UNDER FIVE");
        // What is the output of this code segment if the user enters 5? UNDER 10 UNDER 5
        // If the user enters 8? UNDER TEN; EVEN; OVER FIVE
        // If the user enters 10? EVEN; OVER FIVE
        x = input.nextInt();
        if (x < 10)
            System.out.println("UNDER TEN");
        if (x % 2 == 0)
            System.out.println("EVEN");
        if (x > 5)
            System.out.println("OVER FIVE");
        else
            System.out.println("UNDER FIVE");
            */
        
    
/*
 * Nested if-else and if-else-if statements
 * Example 1: randomly generate a number from 1-10 inclusive. Ask the user to
 * guess a
 * number
 * from 1-10. Tell them if their number was too high, too low, or correct.
 * Example 2: based on input of age, tell the user if they are old enough to get
 * a
 * work permit,
 * old enough to drive, old enough to vote, and old enough to retire without
 * penalty
 * (output all that are appropriate)
 */
        int age;
        System.out.println("Enter your age");
        age = sc.nextInt();
        if (age >= 14){
            System.out.println("work permit");
            if(age >= 16){
                System.out.println("drivers license");
                if(age>= 18){
                    System.out.println("vote");
                    if (age >= 21){
                        System.out.println("Alcohol");
                        if(age>=25){
                            System.out.println("Rent a car and insurance decrease");
                            if (age >= 35){
                                System.out.println("President");
                                if(age>=65){
                                    System.out.println("Collect social security");
                                }
                            }
                        }
                    }
                }
            }
        }else{
            System.out.println("Youre too young");
        }
    }
}