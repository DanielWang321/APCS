package apcs.unit06;

import java.util.Scanner;
import java.util.Arrays;

public class Keno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("welcome to the Casino!");
        System.out.println("What your name? ");
        String name = sc.nextLine();
        double bal = 100;
        int decidePlayAgain = 1;
        while (decidePlayAgain == 1) {
            System.out.println("You have " + bal + ", How much would you like to bet? ");
            double bet = sc.nextDouble();
            int[] userNumbers = getUserInput();
            int[] computerNumbers = generateComputerNumbers();
            int numOfMatches = check(userNumbers, computerNumbers);
            bal -= bet;
            bal += winMatch(numOfMatches, bet);
            output(computerNumbers, userNumbers, numOfMatches, bet, bal);
            if (bal <= 0) {
                System.out.println("You have no more money to play, goodbye!");
                break;
            }
            String response;
            do {
                System.out.println(name + ", would you like to play again? (yes/no)");
                response = sc.next();
                decidePlayAgain = playAgain(response); // decidePlayAgain = 1 for yes, 0 for no, -1 for invalid
            } while (decidePlayAgain == -1);
        }
    }

    // gets user input of 7 unique numbers between 1-80
    public static int[] getUserInput() {
        Scanner sc = new Scanner(System.in);
        int[] userInputList = new int[7];
        // System.out.println(Arrays.toString(userInputList));
        int inputCount = 1;
        while (inputCount <= 7) {
            int tempNumInputed = 0;
            System.out.print("Enter guess number " + inputCount + ": ");
            tempNumInputed = sc.nextInt();
            while (tempNumInputed < 1 || tempNumInputed > 80 || isUnique(tempNumInputed, userInputList) == false) {
                if (tempNumInputed < 1 || tempNumInputed > 80) {
                    System.out.println("Sorry, that number is invalid, please enter another number between 1 and 80");
                    System.out.print("Enter guess number " + inputCount + ": ");
                    tempNumInputed = sc.nextInt();
                }
                if (isUnique(tempNumInputed, userInputList) == false) {
                    System.out.println("Sorry, that number is invalid, please enter another number");
                    System.out.print("Enter guess number " + inputCount + ": ");
                    tempNumInputed = sc.nextInt();
                }
            }
            userInputList[inputCount - 1] = tempNumInputed;
            inputCount++;
        }
        return userInputList;
    }

    // checks if number is unique in list
    private static boolean isUnique(int input, int[] currentList) {
        for (int i : currentList) {
            if (i == input) {
                return false;
            }
        }
        return true;
    }

    // generates 20 unique random numbers for computer
    public static int[] generateComputerNumbers() {
        int[] nums = new int[20];
        for (int i = 0; i < nums.length; i++) {
            int random;
            do {
                random = (int) (Math.random() * 80 + 1);
            } while (isUnique(random, nums) == false);
            nums[i] = random;
        }
        return nums;
    }

    // checks how many numbers match
    public static int check(int[] humanList, int[] computerList) {
        int matched = 0;
        for (int i : humanList) {
            if (isUnique(i, computerList) == false) {
                matched++;
            }
        }
        return matched;

    }

    // calculates winnings based on matches
    public static double winMatch(int matched, double bet) {
        if (matched < 4) {
            return 0;
        } else if (matched == 4) {
            return bet * 1;
        } else if (matched == 5) {
            return bet * 20;
        } else if (matched == 6) {
            return bet * 200;
        } else {
            return bet * 12000;
        }
    }

    // outputs results
    public static void output(int[] computerList, int[] humanList, int matched, double bet, double bal) {
        System.out.println("Your picks: " + Arrays.toString(humanList));
        System.out.println("The Computer picks:" + Arrays.toString(computerList));

        System.out.println("You matched " + matched + " numbers, you win $" + winMatch(matched, bet) + ", you have "
                + bal + " left. ");
    }

    public static int playAgain(String response) {
        if (response.equals("no") || response.equals("No")) {
            System.out.println("Goodbye");
            return 0;
        } else if (response.equals("yes") || response.equals("Yes")) {
            return 1;
        } else {
            System.out.println("Invalid response");
            return -1;
        }
    }
}
