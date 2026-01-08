package apcs.unit06;

import java.util.Scanner;
import java.util.Arrays;

public class Keno {
    public static void main(String[] args) {
        boolean playAgain = true;
        while (playAgain == true) {
            int[] userNumbers = getUserInput();
            int[] computerNumbers = generateComputerNumbers();
            int numOfMatches = check(userNumbers, computerNumbers);
            double bal = 100;
            double bet = 0;
            output(computerNumbers, userNumbers, numOfMatches, bet, bal);
        }

    }

    public static int[] getUserInput() {
        Scanner sc = new Scanner(System.in);
        int[] userInputList = new int[7];
        System.out.println(Arrays.toString(userInputList));
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

    private static boolean isUnique(int input, int[] currentList) {
        for (int i : currentList) {
            if (i == input) {
                return false;
            }
        }
        return true;
    }

    public static int[] generateComputerNumbers() {
        int[] nums = new int[20];
        for (int i = 0; i < nums.length; i++) {
            int random;
            do {
                random = (int) (Math.random() * 20 + 1);
            } while (isUnique(random, nums) == false);
            nums[i] = random;
        }
        return nums;
    }

    public static int check(int[] humanList, int[] computerList) {
        int matched = 0;
        for (int i : humanList) {
            if (isUnique(i, computerList) == false) {
                matched++;
            }
        }
        return matched;

    }

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

    public static void output(int[] computerList, int[] humanList, int matched, double bet, double bal) {

        System.out.println("Your picks: " + Arrays.toString(humanList));
        System.out.println("The Computer picks:" + Arrays.toString(computerList));
        bal -= winMatch(matched, bet);
        System.out.println("You matched " + matched + " numbers, you win $" + winMatch(matched, bet) + ", you have "
                + bal + " left. ");

    }

}
