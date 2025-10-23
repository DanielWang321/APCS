package apcs.unit03;

import java.util.Scanner;
import java.util.InputMismatchException;

//5. calculate the sum of the numbers from 1 to n (a user entered positive integer)
public class Example5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int userInput = -1;
        int sum = 0;
        int counter = 1;
        do {
            try{
                System.out.println("Enter a number");
            userInput = sc.nextInt();
            }catch(InputMismatchException e){
                sc.nextLine();
                System.out.println("That was not a number. Try again.");
                userInput = -1;
            }
        } while (userInput <= 0);
        while (counter <= userInput) {
            sum += counter;
            counter++;
            
        }
        System.out.println(sum);
    }
}
