package apcs.unit03;

import java.util.Scanner;

public class Craps {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int die1, die2, sum, nextSum,point;
        String playerName;
        boolean isPlaying, InProgress, validResponse = false;

        System.out.println("Welcome to APCS Casino!");
        System.out.print("Please enter your name: ");
        playerName = sc.next();

        System.out.println("Hello " + playerName);

        isPlaying = true;

        while (isPlaying) {
            die1 = (int) (Math.random() * 6) + 1;
            die2 = (int) (Math.random() * 6) + 1;
            sum = die1 + die2;

            System.out.println("you have rolled " + die1 + " + " + die2 + " = " + sum);
            if (sum == 3 || sum == 2 || sum == 12) {
                System.out.println("you lose");
            } else if (sum == 7 || sum == 11) {
                System.out.println("You win");
            } else {
                System.out.println(sum + " is now the point.");
                point = sum;
                InProgress = true;

                while (InProgress) {
                    die1 = (int) (Math.random() * 6) + 1;
                    die2 = (int) (Math.random() * 6) + 1;
                    sum = die1 + die2;

                    System.out.println("You have rolled " + die1 + " + " + die2 + " = " + sum);
                    if (sum == 7) {
                        System.out.println("you rolled a 7, You lose");
                        InProgress = false;
                    } else if (sum == point) {
                        System.out.println("You rolled the point, You win");
                        InProgress = false;
                    } else {
                        System.out.println("No win/loss. Roll again.");
                    }
                }
            }
            do {
                System.out.println("would you like to play again? (y/n)");
                String playAgain = sc.next();
                if (playAgain.equals("y")) {
                    isPlaying = true;
                    validResponse = true;
                } else if (playAgain.equals("n")) {
                    isPlaying = false;
                    validResponse = true;
                    System.out.println("Goodbye " + playerName + "!");
                } else {
                    System.out.println("Please enter y or n.");
                    validResponse = false;
                }
            } while (!validResponse);
        }
    }
}