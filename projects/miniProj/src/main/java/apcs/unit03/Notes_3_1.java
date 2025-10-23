package apcs.unit03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Notes_3_1 {
    public static void main(String[] args) {

        // try - should include whatever it is that you want to "try" to do (whatever
        // could cause the error)
        // catch - should include whatever code you want to execute if the error
        // does occur
        /*
         * Looping (Iterative) Structure
         * iteration: one repetition of a loop
         *
         * -while loop - when the number of iterations is not known
         * while(booleanStatement)
         * {
         * //code that will execute as long as the statement is
         * true
         * }
         *
         * -do-while loop - used when the number of iterations is not known,
         * always executes at least once
         *
         * do
         * {
         * //code that will execute as long as the statement is
         * true
         * }
         * while(booleanStatement);
         *
         * break; - exits a structure
         *
         * continue; - skips the remainder of the code in the body of a loop but
         * tests the condition again
         * REMEMBER: the condition describes the situation in which you want the
         * loop to continue iterating
         *
         * /*
         * Define: local, scope, accumulator, counter
         * Tracing examples:
         * EXAMPLE 1 - what is the value of count after the code executes? 6
         * int count = 1;
         * while (count <= 10)
         * {
         * count *= 2;
         * }
         * count = count - 10;
         * EXAMPLE 2 - What is the output of the following code segment? -4 -3 -2 -1 0
         * int x = -5;
         * while (x < 0)
         * {
         * x++;
         * System.out.print(x + " ");
         * }
         * EXAMPLE 3 - What is the output of the following code segment? 1\n1\n1...
         * int count = 1;
         * while (count < 8)
         * {
         * System.out.println(count);
         * }
         * EXAMPLE 4 - What is the value of num after the following code executes? 22
         * int num = 1;
         * do
         * {
         * num *= 3;
         * } while (num < 20);
         * num = num - 5;
         * EXAMPLE 5 - What is the output of the following code? 2 4 6 8
         * int y = 2;
         * do
         * {
         * System.out.print(y + " ");
         * y += 2;
         * } while (y < 0);
         * Programming examples
         * 1. write a loop that outputs the numbers 1-10
         * 2. calorie calculator - allow the user to enter the calorie count of the
         * items
         * they ate today. The user will specify he/she is done by entering -1
         * Define: sentinel value, temporary variable
         * 3. Prompt, and FORCE the user to enter a number from 1-10. Check for range
         * and
         * type errors.
         * 4. Generate a random number from 1-10. Continue to ask the user to enter a
         * number from 1-10 until they guess the correct number. As they guess, tell
         * them
         * if their guess was too high, too low, or correct. Count (and output) how
         * many
         * guesses it took the user to get it right.
         * 5. calculate the sum of the numbers from 1 to n (a user entered positive
         * integer)
         */

        /*
         * int counter = 1;
         * while (counter<= 10){
         * System.out.println(counter++);
         * }
         */
        Scanner sc = new Scanner(System.in);
        /*
         * int tempCal; // temporary variable
         * int totalCal = 0; // accumulator
         * System.out.
         * println("Enter the calorie count of each item you ate today. Enter negative num when you are done."
         * );
         * do{
         * tempCal = sc.nextInt();
         * totalCal += tempCal;
         * }while(tempCal >0);
         * totalCal -= tempCal; // subtract off the sentinel value
         * System.out.println("Your total calorie count for today is " + totalCal);
         */
        /*
         * int userInput;
         * boolean isNumeric = false;
         * 
         * do {
         * System.out.println("Enter a number 1-10: ");
         * try {
         * userInput = sc.nextInt(); // this is the line that could cause the exception,
         * so it foes in the try
         * isNumeric = true;
         * } catch (InputMismatchException e) // catch executes only if the exception
         * occurs
         * {
         * sc.nextLine();// clear out the bad input
         * System.out.println("That was not a number. Try again.");
         * isNumeric = false;
         * userInput = 0;
         * }
         * } while (isNumeric == false || userInput > 10 || userInput < 1);
         * System.out.println("you enetered" + userInput);
         */
        int random = (int) (Math.random() * 10) + 1;
        int userInput, numGuesses = 0;
        boolean isNumeric = false;
        do {
            do {
                System.out.println("Enter a number 1-10: ");
                try {
                    userInput = sc.nextInt(); // this is the line that could cause the exception, so it foes in the try
                    isNumeric = true;
                    
                } catch (InputMismatchException e) // catch executes only if the exception occurs
                {
                    sc.nextLine();// clear out the bad input
                    System.out.println("That was not a number. Try again.");
                    userInput = 0;
                }
                numGuesses++;
                if (userInput < random) {
                    System.out.println("Too low, try again");
                } else if (userInput > random ) {
                    System.out.println("Too high, try again");
                } else if (userInput == random) {
                    System.out.println("You got it!");
                    System.out.println("Num of guesses" + numGuesses);
                }
                
                //user has entered number from 1 to 10
            } while (isNumeric == false || userInput > 10 || userInput < 1);
        } while (userInput != random);
        
    }
}

// an ACCUMULATOR is a variable that changes either incrementally
// or by a multiple of itself (sums, products)
// general rule: initialize accumulators to the identity
// of whatever operation is being performed (sum - 0, product - 1)
// counter variable: a special kind of variables that
// tallies, counts, or keeps track of the number of times
// something occurs
// local: a variable is considering LOCAL to the block of code
// in which its declared, meaning it can only be used
// in that block
// scope: a description of where a variable can be used
// example: here, the scope of i is LOCAL to the for loop
